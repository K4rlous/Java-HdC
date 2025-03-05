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
        
    }   
}
