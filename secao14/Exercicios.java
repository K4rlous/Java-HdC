package secao14;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {
        
        // Exercício 01:
        // mk1
        // ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList());
        // System.out.println("Digite o primeiro numero: ");
        // int n1 = scanner.nextInt();
        // System.out.println("Digite o segundo numero: ");
        // int n2 = scanner.nextInt();
        // System.out.println("Digite o terceiro numero: ");
        // int n3 = scanner.nextInt();
        // numeros.add(n1);
        // numeros.add(n2);
        // numeros.add(n3);

        // System.out.println("Antes de inverter: " + numeros);
        
        // Collections.reverse(numeros);

        // System.out.println("Depois de inverter: " + numeros);

        // mk2 (professor)

        int[] arrayOriginal = {1, 2, 3, 4, 5};
        int[] arrayInvertido = new int[arrayOriginal.length];

        for(int i = 0; i < arrayOriginal.length; i++){
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayInvertido));

        // Exercício 2:
        int[] arraysInteiros = {1,2,3,4,5,6,4,4,5,5};
        int maisFrequente = arraysInteiros[0];
        int maxContagem = 1;
        for(int i = 0; i < arraysInteiros.length; i++){

            int contagem = 0;

            for(int j = 0; j < arraysInteiros.length; j++){
                if(arraysInteiros[j] == arraysInteiros[i]){
                    contagem++;
                }
            }
            if(contagem > maxContagem){
                maxContagem = contagem;
                maisFrequente = arraysInteiros[i];
            }
        }
        System.out.println("O mais frequente é: " + maisFrequente);

        // Exercício 03:

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        for(int[] linha : matrizTransposta){
            System.out.println(Arrays.toString(linha));
            // Ao invés de 2 linhas e 3 colunas, temos 2 colunas e 3 linhas
        }

        // Exercício 04:
        int[] antesSub = {-10, 20, -3, 4, -1, 20};

        System.out.println(Arrays.toString(antesSub));
        for(int i = 0; i < antesSub.length; i++){
            if(antesSub[i] < 0){
                antesSub[i] = 0;
            }
        }
        System.out.println(Arrays.toString(antesSub));

        // Exercício 05:
        int[] duplicados = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(duplicados));

        // Array numérico sem qtd definida
        ArrayList<Integer> semDuplicados = new ArrayList<>();

        for(int numero: duplicados){
            // ! inverte, então se 'semDuplicados' NÃO conter o numero, ele o adiciona em 'semDuplicados'
            if(!semDuplicados.contains(numero)){
                semDuplicados.add(numero);
            }
        }

        System.out.println(semDuplicados);




    }
}
