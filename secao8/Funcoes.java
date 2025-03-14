package secao8;

public class Funcoes {
    public static void main(String[] args) {
        
    // 1 - Criando a primeira função
    saudacao();
    // Funções tem () para diferenciar elas de variáveis e etc

    // 2 - Parâmetros
    soma(2, 10);
    soma(43, 31);

    saudar("Carlos");

    // 3 - Return

    dobrar(10); // Return não retorna código pro usuário e sim para uso posterior!

    int numero = 300;

    int numeroDobrado = dobrar(numero); // Dessa forma atribuimos o resultado em um int!
    System.out.println("O número dobrado é: " + numeroDobrado); // resultado: 600

    System.out.println(dobrar(20)); // resultado: 40

    }

    

    // Perceba que criamos a variável fora do escopo do Main!
    // PUBLIC = nível de acesso, STATIC = não precisa instanciar classe para executar, VOID = tipo de retorno
    // Nome, (Argumentos) e {Bloco}
    public static void saudacao() {
        System.out.println("Olá, está é uma função!");
    }

    public static void soma(int a, int b) {
       int resultado = a + b;
        System.out.println("O resultado da é: " + resultado);
    }

    public static void saudar(String nome) {
        System.out.println("Olá, " + nome + ", como vai?");
    }

    // Note que aqui definimos que o retorno é um int e não um void!
    public static int dobrar(int n){
        return n * 2;
    }

}
