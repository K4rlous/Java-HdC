package secao5;

public class Condicionais {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        
        // 1 - O que é boolean?
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);


        // 2 - Operadores de Comparação

        int x = 10;

        System.out.println(x == 10);

        System.out.println(x == 9);

        System.out.println(x != 5);

        System.out.println(x != 10);

        System.out.println(x > 10);

        System.out.println(x >= 10);

        System.out.println(x < 10);

        System.out.println(x <= 10);


        // 3 - Atribuição e Comparação

        int n = 5;
        // Para o VsCode parar de reclamar!!
        System.out.println(n);
        int m = 10;

        // A ausência de um '=' torna N 12
        System.out.println(n = 12);

        // Aqui simplesmente comparamos ambos Ints
        System.out.println(n == m);

        // 4 - Comparação de Strings
         
        String str1 = "Java";

        // Uma forma alternativa de criar Strings...
        @SuppressWarnings("RedundantStringConstructorCall")
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2); // resultado: false

        System.out.println(str1 == "Java"); // resultado: true

        // Métodos recomendados
        System.out.println(str1.equals(str2)); // resultado: true

        System.out.println(str2.equals(str1)); // resultado: true

        System.out.println(str1.equals("Java")); // resultado: true

        String str3 = "JAVA";

        System.out.println(str1.equals(str3)); // resultado: false

        System.out.println(str1.equalsIgnoreCase(str3)); // resultado: true

        // 5 - If

        int numero = 10;

        // Comparação
        if (numero > 5) {
            System.out.println("Acho que já passamos desse nível rs");
        }

        // If com strings
        String texto = "Teste";

        // Se a função retorna um booleano, eu posso usar no if!
        if (texto.equals("Teste")) {
            System.out.println("Os textos são iguais!");
        }

        // Declaração do if (Comparação ou retorno de booleano) {código para executar!}

        // 6 - Else

        int q = 7;

        if (q > 10) {
            System.out.println("Q é maior que 10!");
        } else {
            System.out.println( "Q não é maior que 10!");
        }

        // Todo else precisa de um if, mas nem todo if precisa ter um else!

        // 7 - Else if

        double nota = 10;
        if (nota == 10) {
            System.out.println("PERFEITO!");
        } else if (nota >= 9) {
            System.out.println("Nota excelente!");
        } else if (nota >= 7) {
            System.out.println("Acima da média!");
        } else {
            System.out.println("Abaixo da média!");
        }

        // Se houverem multiplas condições verdadeiras, o programa irá retornar a primeira!
        int num = 5;

        if (num > 3 ) {
            System.out.println("Alguma coisa");
        } else if (num == 5) {
            System.out.println("Outra coisa aqui");
        }

        // Para resolver isso podemos fazer duas coisas:
        // 1 - Escolher qual situação quero que mais ocorra
        // 2 - Melhorar a lógica do programa!
        // if (num > 3 && num < 5) <- Resolveria o problema!!
    }
}
