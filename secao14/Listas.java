package secao14;

import java.lang.reflect.Array;
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

        // 2 - Loops em Arrays

        // Somar todos os elementos de um array
        int soma = 0;
        // 8 porque o array contém 8 elementos! 
        //         for(int i = 0; i < 8; i++){
        // Normalmente não fazemos assim porque não sabemos o tamanho dos arrays
        // use LENGTH, ele irá retornar a quantidade de elementos do array!
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println("A soma dos elementos no array é: " + soma);

        // For Each (Estrutura de loops para arrays)
        /* Não temos controle sobre a quantidade de suas iterações
        Ele irá iterar de acordo com a quantidade de elementos no array
        Nele temos de nomear o item, isso é o singular do elemento do array
        Pessoas -> Pessoa
        Frutas -> Fruta
        Logo, para cada Fruta em Frutas, faça isso {}
        */ 
        for(String fruta : frutas){
            System.out.println("A fruta da vez é: " + fruta);
        }
         
        // Encontrar o maior valor de um array
        int [] valores = {10, 25, 8, 22, 1};
        // Usamos o primeiro indice como base, os outros numeros serão comparados com este
        int maiorValor = valores[0];

        int j = 0;
        // Enquanto 'j' for menor que o comprimento do array, faça isso {}
        while(j < valores.length){
            // Se valores no indíce 'j' for maior que 'maiorValor' atribua esse valor a ele
            if(valores[j] > maiorValor){
                maiorValor = valores[j];
            }
            // Incremento por fora 
            j++;
        }
        System.out.println(maiorValor); // resultado: 25

        // 3 - For Each
        for(int numero : numeros){
            System.out.println("O número é: " + numero);
        }

        // Concatenar elementos de um array
        String[] palavras = {"Java", "Is", "Cursed!"};
        String frase = "";

        for(String palavra : palavras){
            // Operador de atribuição também funciona com strings
            frase += palavra + " ";
        }
        System.out.println(frase);

        // Verificar se valor esta presente no array
        char[] letras = {'a', 'e', 'i', 'o', 'u'};
        char letraProcurada = 'i';

        for(char letra : letras){
            if (letra == letraProcurada){
                System.out.println("Encontramos a letra: " + letra);
                // Break também funciona no For Each
                break;
            }
        }

        // 4 - Loops com If
        // Filtrar e somar numeros pares
        // int[] numeros = {1,2,3,4,5,6,7,8};
        int somaPares = 0;
        for (int numero : numeros){
            if(numero % 2 == 0){
                somaPares += numero;
            }
        }
        System.out.println(somaPares); // resultado: 20

        // Exibir valores maiores que um determinado valor
        int[] nums = {12, 6, 18, 24, 48, 5};
        int limite = 10;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > limite){
                System.out.println("O seguinte valor é maior que " + limite + ": " + nums[i]);
  
            }
        }
        // Outra forma:
        // for(int num : nums){
        //     if (num > 10){
        //         System.out.println("O seguinte valor é maior que " + limite + ": " + num);
        //     }
        // }

        String[] linguagens = {"Java", "C", "Python", "PHP"};
        String linguagemAlvo = "Python";

        for(String linguagem : linguagens){
            // O VSCode recomenda usar .equals para comparar Strings!
            if(linguagem == linguagemAlvo){
                System.out.println("Linguagem encontrada, parando o loop");
                break;
            } else {
                System.out.println("Linguagem ainda não encontrada");
            }
        }

        // 5 - Atualizar Valores
        for (int i = 0; i < numeros.length; i++){
            // Multiplica o numero do indice [i] por 2
            numeros[i] *= 2;
        }

        for(int numero : numeros){
            System.out.println("Numero dobrado: " + numero);
        }

        // FOR EACH NÃO PERMITE ALTERAÇÃO DIRETA NOS ELEMENTOS DO ARRAY (SIM, DE NOVO!)
        // Replica errônea abaixo!
        // for(int numero : numeros){
        //     numero *= 2;
        // }

        // Manipulação do indice diretamente
        numeros[5] = 1;

        // Substituindo um valor String por outro, Maça está no índice 0!
        for(int i = 0; i < frutas.length; i++){
            if(frutas[i].equals("Maça")){
                frutas[i] = "Abacate";
            }
        }
        System.out.println(frutas[0]);

        // 6 - Método toString
        String dadosNumericos = Arrays.toString(numeros);
        System.out.println(dadosNumericos); // [2, 4, 6, 8, 10, 1, 14, 16] 

        String dadosFrutas = Arrays.toString(frutas);
        System.out.println(dadosFrutas); // [Abacate, Banana, Manga]

        int[] teste = new int[3];
        System.out.println(Arrays.toString(teste)); // [0, 0, 0]

        
     }
}
