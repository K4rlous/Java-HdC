package secao8;

public class FuncoesBuiltin {
    public static void main(String[] args) {
        
        // 10 - Funções Built-in com Strings
        String frase = "Ninguém merece..";

        // Length
        System.out.println(frase.length()); // resultado: 16

        // Tal como int = inteiro
        // String => S (Letra inicial maiuscula) = Classe / String é classe!

        System.out.println(frase.substring(0, 5)); // resultado: Ningu

        // OS ESPAÇOS SÂO CONTABILIZADOS TAMBÉM

        System.out.println(frase.toUpperCase());

        System.out.println(frase.replace("e", "u")); // resultado: Ninguém murucu..

        // Os dados podem ser armazenados em variáveis
        String fraseModificada = frase.toUpperCase();
        System.out.println(fraseModificada);

        // 11 - Funções do Math

        // Raiz quadrada
        System.out.println(Math.sqrt(26));

        // Potência
        System.out.println(Math.pow(2, 3));

        // Valor absoluto
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));

        // Valor máximo (maior)
        System.out.println(Math.max(100, 10));

        // Atribuição a variáveis
        double raizQuadrada = Math.sqrt(99);
        System.out.println("A raiz quadrada de 99 é: " + raizQuadrada);

    }
}
