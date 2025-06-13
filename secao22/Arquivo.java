package secao22;

// Pra importar TUDO de java.io
import java.io.*;

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
    }
}
