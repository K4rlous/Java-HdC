package secao21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Erros {
    public static void main(String[] args) {
        
        // 1 - try catch
        // Dividindo por zero
        try {

            int a = 0;
            int b = 10;
            int resultado = b / a;
            System.out.println(resultado);
            // Note o tipo de erro
        } catch (ArithmeticException e) {
            System.out.println("Dividir por 0 não é possível!");
        }

        // Acessando indice não existente
        try {

            int[] numeros = {1,2,3};
            System.out.println(numeros[3]);

        } catch (Exception e) {
            System.out.println("Erro genérico não identificado!");
            System.out.println("Msg: " + e.getMessage()); // Msg: Index 3 out of bounds for length 3
        }

        // 2 - finally
        // com catch
        try {

            int[] numeros = {1,2,3};
            System.out.println(numeros[3]);
            // Podemos também definir qual o tipo de erro e suas tratativas
            // não precisamos trabalhar sempre com erros genéricos
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro genérico não identificado, finally!");
            System.out.println("Msg: " + e.getMessage()); // Msg: Index 3 out of bounds for length 3
        } finally {
            System.out.println("Executou o finally!");
        }

        // com try
        try {

            int[] numeros = {1,2,3};
            System.out.println("Acessando indice existente: " + numeros[2]);
            // Podemos também definir qual o tipo de erro e suas tratativas
            // não precisamos trabalhar sempre com erros genéricos
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro genérico não identificado, finally!");
            System.out.println("Msg: " + e.getMessage()); 
        } finally {
            System.out.println("Executou o finally!");
        }

        // sem catch
        try {

            int[] numeros = {1,2,3};
            System.out.println("Acessando indice existente sem catch: " + numeros[1]);
        } finally {
            System.out.println("Executou o finally!");
        }

        // 3 - verificadas e não verificadas 
        // Vamos ver um pouco de tratamento de arquivos, veremos isso
        // com mais detalhes mais a frente no curso

        // verificada / não permite compilar
        try{
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);
        } catch (Exception e){
            System.out.println("Erro ao ler arquivo " + e.getMessage());
            // Erro ao ler arquivo arquivo.txt (O sistema não pode encontrar o arquivo especificado)
        }

        // não verificadas / permite compilar
        String texto = null;
        //System.out.println(texto.length());
        // RETORNA ERRO

        // 4 - Exceções com throw
        try{

            validarIdade(20);
            validarIdade(10);

        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
            // Erro: Idade deve ser maior que 18
        }

        // 5 - exceções personalizadas
        Banco minhConta = new Banco(5000);

        try{
            minhConta.sacar(6000);
        } catch(SaldoInsuficienteException e ){
            System.out.println("Erro: " + e.getMessage());
            // Erro: Saldo insuficiente para sacar 6000.0
        }

        // 6 - throws em métodos
        // Note o encadeamento de catchs, se tirarmos os tratamentos
        // o código não rodará, quando se herda uma função ou classe com
        // throws, é obrigatório tratar os erros dela também!
        try {
            processarArquivo("/var/ww/arquivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        // 7 - Encadeamento de exceções
        try {
            abrirArquivo(null);
        } catch (Exception e) {
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Causa: " + e.getCause());
        }

        // 8 - Multicatch
        try {
            processarArquivo(null);
        } catch (NullPointerException | IOException e) {
            System.out.println("Erro Multicatch : " + e.getMessage());
        } 

        // 9 - Relançando as exceções
        try {
            processarDados(null);
        } catch (Exception e) {
            System.out.println("Outra coisa");
            System.out.println("Pilha de execução: " + e.getStackTrace());
        }
    }

    // Função para a atividade 4
    public static void validarIdade(int idade){
        if (idade < 18){
            throw new IllegalArgumentException("Idade deve ser maior que 18");
        }
        // Isso não será impresso se a idade for menor que 18 
        System.out.println("Idade válida: " + idade);
    }

    // Função para a atividade 6
    // Aqui temos duas exceções, a primeira é quando o arquivo não é encontrado
    // a segunda é para quando o caminho do arquivo não é encontrado 
    public static void processarArquivo(String caminho) throws FileNotFoundException, IOException{
        if(caminho == null || caminho.isEmpty()){
            throw new IOException("Caminho inválido");
        }
        File arquivo = new File(caminho);
        if(!arquivo.exists()){
            throw new FileNotFoundException("Arquivo não encontrado");
        }
        System.out.println("Arquivo encontrado com sucesso!");
    }

    // Função para atividade 7
    public static void abrirArquivo(String caminho){
        try {
            if(caminho == null){
                throw new NullPointerException("Caminho nulo");
            }
            throw new FileNotFoundException("Arquivo não encontrado");
        } catch (FileNotFoundException e) {
            // Criação da exceção com sua mensagem
            NullPointerException npe = new NullPointerException("Erro ao processar arquivo");
            // Definimos que a causa da exceção acima é a exceção 'FileNotFound'
            npe.initCause(e);
            // Lançamos a exceção criada
            throw npe;
            // Encadeamos uma exceção como causa da outra e vice-versa
        }
    }

    // Função para atividadde 9 
    public static void processarDados(String dados) throws Exception{
        try {
            if(dados == null){
                throw new NullPointerException("Os dados são nulos");
            }
        } catch (Exception e) {
            System.out.println("Tratamento, criação de log");
            throw e; // <----
        }
    }
}
