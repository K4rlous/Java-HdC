package secao14;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class AvancandoArrays {
    public static void main(String[] args) {

        // 1 - Ordenação

        // Array de inteiros

        int[] numbers = {4, 5, 1, 2, 3, 7, 6};
        System.out.println(Arrays.toString(numbers)); // [4, 5, 1, 2, 3, 7, 6]

        // Esse método MODIFICA o array original!!!
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5, 6, 7]

        // Ordenação com Comparator
        String[] names = {"Ana", "Carlos", "João", "Bob"};
        Arrays.sort(names);
        // Ele irá ordenar alfabéticamente!
        System.out.println(Arrays.toString(names)); // [Ana, Bob, Carlos, João]

        // Ordem inversa alfabéticamente dos nomes!
        Arrays.sort(names, Comparator.reverseOrder());
        System.out.println(Arrays.toString(names)); // [João, Carlos, Bob, Ana]

        // Ordenação de matriz
        int[][] matriz = {
            {4, 5, 1},
            {3, 8, 9},
            {2, 3, 1}
        };

        // ERRO -> Arrays.sort(matriz); / NÃO SE PODE USAR SORT EM ARRAYS 2D!
        // Método correto:
        // Em: a -> a[1] estamos escolhendo a coluna 1 como críterio de ordenação!
        Arrays.sort(matriz, Comparator.comparingInt(a -> a[1]));

        for(int[] linha : matriz){
            System.out.println(Arrays.toString(linha));
            // Note que a coluna 1 está ordenada: 3, 5, 8!
            // [2, 3, 1]
            // [4, 5, 1]
            // [3, 8, 9]
        }

        // Método de impressão de matriz sem loops for each:
        System.out.println(Arrays.deepToString(matriz)); // [[2, 3, 1], [4, 5, 1], [3, 8, 9]]

        // 2 - Manipulação avançada de arrays
        int[] original = {1, 2, 2, 4};

        // Cópia de arrays, original.length é o valor máximo que queremos copiar!
        int[] copia = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(copia)); // [1, 2, 2, 4]

        // Fill ou preenchimento
        int[] numeros = new int[5];
        System.out.println(Arrays.toString(numeros)); // [0, 0, 0, 0, 0]

        Arrays.fill(numeros, 5);
        System.out.println(Arrays.toString(numeros)); // [5, 5, 5, 5, 5]

        // Transformação de array para stream / VEREMOS ISSO COM MAIS ATENÇÃO DEPOIS!
        int[] values = {1, 2, 3, 4, 5};

        // Soma dos elementos
        int soma = Arrays.stream(values).sum();
        System.out.println(soma); // 15

        // 3 - Arrays Dinâmicos

        ArrayList<String> frutas = new ArrayList<>();
        System.out.println(frutas); // []

        frutas.add("Banana");
        frutas.add("Maçã");
        System.out.println(frutas); // [Banana, Maçã]

        for(String fruta : frutas){
            System.out.println(fruta);
                // Banana
                // Maçã
        }

        // Remoção por nome
        frutas.remove("Banana");
        System.out.println(frutas); // [Maçã]
        // Remoção por índice
        frutas.remove(0);
        System.out.println(frutas); // []

        frutas.add("Maçã");

        // Atribuição de índice em uma variável, sendo 0 o índice!
        String frutaEspecifica = frutas.get(0);
        System.out.println(frutaEspecifica); // Maçã

        // ArrayList não permite print por índice diretamente!
        // ERRO -> System.out.println(frutas[0]);

    }
}
