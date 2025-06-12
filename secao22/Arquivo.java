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
    }
}
