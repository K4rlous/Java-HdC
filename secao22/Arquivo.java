package secao22;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.imageio.ImageIO;

public class Arquivo {
    public static void main(String[] args) {
        
        // 1 - Leitura de arquivos
        /* Usualmente usuariamos o caminho da pasta, porém para critério de economia de tempo, vamos instanciar uma variavel com o diretório atual!
         */
        // Vamos concatenar pra chegar até a pasta certa!
        String currentDir = System.getProperty("user.dir") + "\\secao22\\";
        System.out.println(currentDir);
        // Acima temos dita variável, podemos concatenar os arquivos que queremos abrir com ela! e abaixo é o resultado que esperamos!
        System.out.println("C:\\Users\\Carlos\\Desktop\\Programação 2024 e Redes\\Java HdC\\secao22\\");
        // Usamos duas contra barras \\ pra dar 'escape' tipo "\n", o uso de somente uma iria retornar inconsistências!
        // Windows -> \
        // Linux -> /

        // FileReader = caracter por caracter
        try (FileReader reader = new FileReader(currentDir + "arquivo.txt")) {
            
            // Essa variável servirá para iterar sobre os caracteres do documento, e mais a frente sofrerá um casting para char (do contrário teremos apenas o código ASCII de cada letra)
            int caracter;

            // O -1 indica o fim do arquivo, ou seja enquanto o caracter não chegar no fim do arquivo ele irá continuar! 
            while((caracter = reader.read()) != -1){
                // Use apenas 'print', 'println' colocaria cada letra em uma linha!
                System.out.print((char)caracter);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo " + e.getMessage());
        }

        System.out.println();

        // BufferedReader = linha por linha
        // Note como ele recebe uma instância do FileReader pra ler o arquivo!
        try (BufferedReader reader = new BufferedReader(new FileReader(currentDir + "arquivo.txt"))) {
            // Aqui lemos a linha inteira
            String linha;
            // E usamos o null para indentificar o fim do arquivo!
            while((linha = reader.readLine()) != null){
                System.out.println(linha);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo " + e.getMessage());
        }
        

        // 2 - Escrever em arquivos
        // Se o arquivo não existe, ele será criado!

        // FileWriter
        try (FileWriter writer = new FileWriter(currentDir + "saida.txt")) {
            writer.write("And quietly there, he rot \n");
            writer.write("Waiting for the day, that never came \n");
        } catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo " + e.getMessage());
        }

        // BufferedWriter, note o uso de FileWriter!
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt"))) {
            writer.write("But the world continued");
            writer.newLine(); // Cria uma nova linha, evitando o uso de \n
            writer.write("And no one mourned him \n");
        } catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo " + e.getMessage());
        }

        // O uso de append adiciona conteudo, usar write de novo substituiria os dados antigos, é necessário habilitar ele, tal como podemos ver na linha  abaixo!
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt", true))) {
            writer.append("In the end, we all rot");
        } catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo " + e.getMessage());
        }

        // 3 - Serialização de objetos
        Pessoa pessoa = new Pessoa("Someone", 66);

        System.out.println(pessoa.getNome());

        // Inicio do processo de serialização
        /*
         oss é o nome de uma variável, qualquer nome serve, usamos oss para referênciar o proprio ObjectOutputStream

         arquivos serializados tem a extensão .ser
         */
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser"))) {

            oos.writeObject(pessoa);
            System.out.println("Objeto serializado com sucesso");

        } catch (Exception e) {
            System.out.println("Erro ao serializar objeto " + e.getMessage());
        }

        // Deserialização de objetos
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentDir + "pessoa.ser"))) {
            
            // Criação da variável para deserializar o objeto, note o tipecast que usamos para converter o objeto para sua classe 'natural'
            Pessoa pessoa2 = (Pessoa) ois.readObject();
            System.out.println("Nome: " + pessoa2.getNome());
            System.out.println("Idade: " + pessoa2.getIdade());

        } catch (Exception e) {
            System.out.println("Erro ao deserializar objeto " + e.getMessage());
        }

        // SERIALIZAR = OUTPUT
        // DESERIALIZAR = INPUT

        // 4 - Manipulação de binários
        // Copia de imagem
        try (
            // Colocamos os dois argumentos assim para evitar 'resource leaks'
            FileInputStream fis = new FileInputStream(currentDir + "imagem.jpg");
            FileOutputStream fos = new FileOutputStream(currentDir + "copia_imagem.jpg");
        ) {
            // Acima ditamos a fonte dos bytes e o destino dele, abaixo vamos passar os bytes do original para o arquivo novo!

            int byteData;
            // O != -1 indica o final do arquivo!
            while((byteData = fis.read()) != -1){
                fos.write(byteData);
            }
            // Enquanto houver bytes no arquivo fonte, eles serão escritos no arquivo copia
            System.out.println("Arquivo copiado com sucesso");

        } catch (Exception e) {
            System.out.println("Erro ao copiar arquivo " + e.getMessage());
        }

        // Copia de video, usamos Buffered para arquivos maiores
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(currentDir + "video.mkv"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(currentDir + "copia_video.mkv")); 
            ) {
            
            // Por ser um arquivo maior usaremos um array de bytes
            byte[] buffer = new byte[1024]; // Buffer 1kb em 1kb, buffers menores garantem integridade caso haja instabilidade na rede, dessa forma os pacotes perdidos não corrompem o 
            int bytesLidos;

            while((bytesLidos = bis.read(buffer)) != -1){
                bos.write(buffer, 0, bytesLidos);
                // Argumentos: dados, intervalo, e o numero de bytes a serem escritos
            }
            System.out.println("Video copiado com sucesso");

        } catch (Exception e) {
            System.out.println("Erro ao copiar video " + e.getMessage());
        }

        // 5 - Manipulação de imagens
        // Vamos inserir um texto no centro de imagem.jpg
        try {
            
            BufferedImage imagem = ImageIO.read(new File(currentDir + "imagem.jpg"));
            if(imagem == null){
                System.out.println("A imagem não pode ser carregada");
                return;
            }
            Graphics g2d = imagem.createGraphics();

            // Definindo propriedades do texto
            g2d.setFont(new Font("Arial", Font.BOLD,50));
            FontMetrics fm = g2d.getFontMetrics();
            String texto = "Marca d'água";

            // Centralizar texto na imagem
            int larguraTexto = fm.stringWidth(texto);
            int alturaTexto = fm.getHeight();

            // Posicionamento, feito através de calculo x = hori y = vert
            int x = (imagem.getWidth() - larguraTexto) / 2;
            int y = (imagem.getHeight() - alturaTexto) / 2 + fm.getAscent();

            // Desenhar retângulo
            g2d.setColor(Color.black);
            g2d.fillRect(x - 10, y - fm.getAscent(), larguraTexto + 20, alturaTexto);

            // Desenhar o texto sobre o retângulo
            g2d.setColor(Color.red);
            // Usamos o x e y que calculamos previamente!
            g2d.drawString(texto, x, y);
            // Liberação de recursos
            g2d.dispose();

            // Salvar a imagem
            File outputFile = new File(currentDir + "imagem_com_texto.png");
            ImageIO.write(imagem, "png", outputFile);
            System.out.println("Imagem modificada com sucesso");

        } catch (Exception e) {
            System.out.println("Erro ao processar imagem " + e.getMessage());
        }

        // 6 - Manipulação de arquivos e diretórios

        // Criando um diretório
        Path caminhoDiretorio = Paths.get(currentDir + "diretorioNovo");

        try {
            if(!Files.exists(caminhoDiretorio)){
                Files.createDirectories(caminhoDiretorio);
                System.out.println("Diretório criado com sucesso: " + caminhoDiretorio.toString());
            } else {
                System.out.println("Diretório já existe!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar diretório " + e.getMessage());
        }
        /*
         Perceba que nunca instanciamos Paths ou Files!
         Nós conseguimos usar os métodos pois eles são static!
         */


         // Criar, copiar e mover arquivos

         Path caminhoArquivoOriginal = Paths.get(currentDir + "arquivo_criado.txt");
         Path caminhoArquivoCopia = Paths.get(currentDir + "arquivo_criado_copia.txt");
         Path caminhoArquivoMovido = Paths.get(currentDir, "diretorioNovo", "arquivo_movido.txt");

         try {
            // Criar
             if(!Files.exists(caminhoArquivoOriginal)){
                Files.createFile(caminhoArquivoOriginal);
                System.out.println("Arquivo criado com sucesso: " + caminhoDiretorio.toString());
            } else {
                System.out.println("Arquivo já existe!");
            }

            // Copiar
            // O if é só pra evitar um erro de sintaxe no contexto geral do código!
            if(!Files.exists(caminhoArquivoCopia)){
                // É a linha abaixo que importa!
                Files.copy(caminhoArquivoOriginal, caminhoArquivoCopia);
            }

            // Mover
            Files.move(caminhoArquivoCopia, caminhoArquivoMovido);


         } catch (Exception e) {
            System.out.println("Erro ao tentar manipular arquivo" + e.getMessage());
        }


        // 7 - Arquivos temporários
        try {
            Path arquivoTemporario = Files.createTempFile("meuTempFile", ".txt");
 
            System.out.println("Arquivo criado em: " + arquivoTemporario.toAbsolutePath());

            Files.writeString(arquivoTemporario, "Brincadeira bicho!");

            String conteudo =  Files.readString(arquivoTemporario);

            System.out.println("Conteudo do arquivo temporário: " + conteudo);

            Files.deleteIfExists(arquivoTemporario);

        } catch (Exception e) {
            System.out.println("Erro ao criar arquivo temporário" + e.getMessage());
        }

        // Arquivos ZIP
        // Compressão
        Path arquivoOriginal = Paths.get(currentDir + "arquivo.txt");
        Path arquivoZip = Paths.get(currentDir + "arquivo_comprimido.zip");
        // Try with resources
        try (
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(arquivoZip.toFile()));
            FileInputStream fis = new FileInputStream(arquivoOriginal.toFile());
        )
         {
            // Cria uma entrada ZIP para o arquivo
            ZipEntry zipEntry = new ZipEntry(arquivoOriginal.getFileName().toString());
            zos.putNextEntry(zipEntry);

            // Lê o conteudo do arquivo e grava no ZIP (buffer)
            byte[] buffer = new byte[1024];
            int bytesRead;

            while((bytesRead = fis.read(buffer)) != -1){
                zos.write(buffer, 0, bytesRead);
            }

            // Fechar a entrada do ZIP
            zos.closeEntry();
            System.out.println("Arquivo compactado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao compactar arquivo " + e.getMessage());
        }

        // Descompressão
        Path arquivoZipado = Paths.get(currentDir + "arquivo_comprimido.zip");
        Path destino = Paths.get(currentDir + "descompactado");
        // Try with resources
        try (
            ZipInputStream zis = new ZipInputStream(new FileInputStream(arquivoZipado.toFile()));
        ) {
            
            ZipEntry zipEntry;

            // Criar o diretório se não existir
            if(!Files.exists(destino)){
                Files.createDirectories(destino);
            }

            // Iteração sobre os arquivos ZIP
            while((zipEntry = zis.getNextEntry()) != null){

                Path caminhDestino = destino.resolve(zipEntry.getName());

                // Try normal
                try(
                    FileOutputStream fos = new FileOutputStream(caminhDestino.toFile())
                ){
                    byte[] buffer = new byte[1024];
                    int bytesRead;

                    while((bytesRead = zis.read(buffer)) != -1){
                    fos.write(buffer, 0, bytesRead);
            }
                }
                System.out.println("Arquivo descompactado " + caminhDestino);
                zis.closeEntry();
            }

        } catch (Exception e) {
            System.out.println("Erro ao descompactar arquivo " + e.getMessage());
        }

        // 9 - Manipulação de CSV
        // Leitura
        String arquivoCSV = currentDir + "dados.csv";
        String linha;
        String separador = ",";

        // Try with resources
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            // Funcionará enquanto não houver mais linhas
            while((linha = br.readLine()) != null){
                // Dividir a string / explodir a string em array
                String[] dados = linha.split(separador);
                System.out.println("Nome: " + dados[0] + ", Idade: " + dados[1] + ", Cidade: " + dados[2]);
            }

        } catch (Exception e) {
            System.out.println("Erro ao ler csv: " + e.getMessage());
        }

        // Escrita
        String arquivoEscritaCSV = currentDir + "dadosEscrita.csv";
        // Try with resources
        try (FileWriter writer = new FileWriter(arquivoEscritaCSV)) {
            
            // Inserção de linha a linha, respeitando o separador (,) e quebrando a linha no final 
            writer.append("Nome,Idade,Cidade\n");
            writer.append("Isabel,22,Rio de Janeiro\n");
            writer.append("Maria,45,Floripa\n");
            writer.append("Igor,15,Guarulhos\n");

            System.out.println("Conteudo gravado no CSV com sucesso");

        } catch (Exception e) {
            System.out.println("Erro ao escrever no csv: " + e.getMessage());
        }
    }
}
