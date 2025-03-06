package secao2;

public class Variavel {
    
    public static void main(String[] args) {
        
        // 1 - O que são variáveis

        // Tipo > Nome > Valor
        String nome = "Fulano";

        System.out.println(nome);


        // 2 - Atribuição de variável com outra

        String teste = "Teste";

        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 99999999999999999l;
        // int não suporta um número tão grande
        //  int numeroGrande2 = numeroGrande;

       System.err.println(numeroGrande);

       // 3 - Comentários

       /* 
        Comentários longos
        de várias linhas!
        */

       /** 
        * Documentação também
        * com várias linhas
        * note o asterisco!
       */

       // 4 - Strings

       String firstName = "Fulano";
       String lastName = "Beltrano";

       System.out.println("Fulano Beltrano");

       System.out.println(firstName + " " + lastName);

       System.out.println("O nome dele é: " + firstName);

       String fullName = firstName + " " + lastName;

       System.out.println(fullName);

       // 5 - Char

       char letra = 'A';

       System.out.println(letra);

       // Isso tem o mesmo efeito ocupando mais espaço!
       String letra2 = "A";

       System.out.println(letra2);

       char simbolo = '$';

       System.out.println(simbolo);

       // 6 - Int

        int n = 42;

        System.out.println(n);

        System.out.println(n + 5);

        System.out.println(n * 2);

        System.out.println(n / 5);

        int soma = n + 12;

        System.out.println(soma);

        // 7 - Long
        
        long populacaoMundial = 7800000000L;

        System.out.println(populacaoMundial);

        long grandeNumero = 1_000_000;

        System.out.println(grandeNumero + 1);
        
        // 8 - Double

        double preco = 19.99;

        System.out.println(preco);

        System.out.println(preco - 12);

        System.out.println(preco / 2);

        double pi = 3.14_592_123;
        
        double valorComD = 100.10D;

        System.out.println(pi);
        
        System.out.println(valorComD);

        // 9 OP. Aritméticos p1

        System.out.println(12 + 5);
        System.out.println(12 - 5);
        System.out.println(12 * 5);
        System.out.println(12 / 5);
        System.out.println(12 % 5);

        /*
         Para se ter um resultado 'quebrado'
         pelo menos um número deve ser double!
        */
        System.out.println(10 / 2.5);

        System.out.println(10.0 / 2.5);

        /*
         Para se ter resultados corretos em divisão
         um dos números deve ser double, já que o Java
         arredonda o resultado para cima!
        */
        System.out.println(10 / 3);
        // resultado: 3
        System.out.println(10.0 / 3);
        // resultado: 3,33333333

        // Módulo
        System.out.println(10 % 3);
        // resultado: 1

        // 10 OP. Aritméticos p2

        int x = 5;
        x++;
        System.out.println(x);
        // resultado: 6

        int y = 5;
        y--;
        System.out.println(y);
        // resultado: 4

        int a = 10;
        a += 5;
        System.out.println(a);
        // resultado: 15

        int b = 10;
        b -= 5;
        System.out.println(b);
        // resultado: 5

        a -= b;
        System.out.println(a);
        // resultado: 10

        b -= a;
        System.out.println(b);
        // resultado: -5
        
        // 11 - Type Casting

        // Implícito (Widening)
        int numero2 = 42;
        int numeroLong = numero2;
        double numeroDouble = numero2;
        System.out.println(numeroLong); // resultado: 42
        System.out.println(numeroDouble); // resultado: 42.0
        // Convertemos os dados para um tipo maior sem perda de dados!

        // Explícito (Narrowing)
        double valorDouble = 9.78;
        // Método incorréto! > int valorInt = valorDouble;
        // (int) converte double para int
        int valorInt = (int) valorDouble;
        System.out.println(valorInt); // resultado: 9

        // Casting de char para int
        // Conversor para Ascii
        char letra3 = 'A';
        int codigoAscii = (int) letra3;
        System.out.println(codigoAscii); // resultado: 65

        // 12 - Constantes
        final int DIAS_DA_SEMANA = 7;
        System.out.println("Dias da semana: " + DIAS_DA_SEMANA);

        // Constantes não são alteradas >X DIAS_DA_SEMANA += 1;

        // final int TESTE2;
        // System.out.println(TESTE2);
        // Elas não podem ser inicializadas sem valor!

        // 13 - Var

        var z = 10;
        System.err.println(z); // resultado: 10
        z = 5;
        System.err.println(z); // resultado: 5
        // Resulta em erro, não pode haver essa conversão
        // >X z = "Teste"

        var texto2 = "Teste";
        System.out.println(texto2); // resultado: Teste
        
        // Nem sempre é utilizado, varia de ambiente para ambiente!

    }   

}
