package secao5;

public class Condicionais {
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
        int m = 10;

        // A ausência de um '=' torna N 12
        System.out.println(n = 12);

        // Aqui simplesmente comparamos ambos Ints
        System.out.println(n == m);

        // 4 - Comparação de Strings
         
        String str1 = "Java";

        // Uma forma alternativa de criar Strings...
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
    }
}
