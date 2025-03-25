package secao14;

import java.util.Arrays;

public class Listas {
    public static void main(String[] args) {
        
        // 1 - Sintaxe

        int[] numeros = {1,2,3,4,5,6,7,8};
        // [] após o tipo de dado, seguido do nome, {elementos} separados por vírgula!

        // Primeiro elemento, lembre-se que comaçam em 0!
        System.out.println("Primeiro elemento: " + numeros[0]);

        // Tamanho fixo, porém vazio
        String[] frutas = new String[3];
        // Podemos inserir elementos nos îndices 0, 1, e 2!

        // Atribuição
        frutas[0] = "Maça";
        frutas[1] = "Banana";
        frutas[2] = "Manga";

        // A impressão de arrays é feita com a classe 'Arrays.toString'
        System.out.println(Arrays.toString(frutas));

        double[] precos = {1.99, 1.45, 2.45};

        // 2.45 -> 5.00
        precos[2] = 5.00;

        System.out.println(Arrays.toString(precos));

    }
}
