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

        // 7 - Adicionando novos itens a arrays

        // Método 1: Criando um novo array e copiando os elementos com loops

        // Criamos um array que tem como base o comprimento de 'numeros' + 1 índice
        int [] novoArray = new int[numeros.length + 1];
        
        // Loop para copiar os dados de 'numeros' para 'novoArray'
        for (int i = 0; i < numeros.length; i++){
            novoArray[i] = numeros[i];
        }

        System.out.println(Arrays.toString(novoArray)); // [2, 4, 6, 8, 10, 1, 14, 16, 0]

        // O ultimo elemento do array é o 0, se quissemos acessar e alterar ele, poderiamos fazer da seguinte forma, note que não sabemos quantos elementos existem no array, então só subtraimos 1 do comprimento total dele!

        novoArray[novoArray.length -1] = 7; 
        System.out.println(Arrays.toString(novoArray)); // [2, 4, 6, 8, 10, 1, 14, 16, 7]

        // Método 2: Utilizando o arrayCopy para copiar os elementos

        // Criação do array que irá guardar os elementos de 'frutas'
        String[] novoFrutas = new String[frutas.length + 1];

        // Sintaxe: Array antigo, posição inicial, Array novo, posição inicial, e limite da cópia, como queremos copiar tudo usamos o comprimento do array 'frutas' como base!
        System.arraycopy(frutas, 0, novoFrutas, 0, frutas.length);

        novoFrutas[novoFrutas.length - 1] = "Abacaxi";

        System.out.println(Arrays.toString(novoFrutas)); // [Abacate, Banana, Manga, Abacaxi]

        // Método 3: Usando ArrayList

        // <Tipo de dado> nomeDoArray
        java.util.ArrayList<String> listaFrutas = new java.util.ArrayList<>(Arrays.asList("Maça", "Banana", "Laranja"));
        

        // A impressão de ArrayLists não precisa de 'toString'
        System.out.println(listaFrutas); // [Maça, Banana, Laranja]

        // Arraylists permitem usar métodos para realizar ações, tal como adicionar elementos no array!
        listaFrutas.add("Manga");
        System.out.println(listaFrutas); // [Maça, Banana, Laranja, Manga]

        // 8 - Problema de Reference Trap
        int[] arrayOriginal = {1,2,3};
        // Vamos supor que já programamos bastante coisa e queremos reutilizar os valores desse array
        int[] arrayCopia = arrayOriginal;

        arrayCopia[0] = 10;

        // Perceba que o valor 10 foi inserido incorretamente no arrayOriginal
        System.out.println(Arrays.toString(arrayOriginal)); // [10, 2, 3]
        System.out.println(Arrays.toString(arrayCopia)); // [10, 2, 3]

        // Podemos evitar isso através do processo de clonagem de arrays
        int[] arrayClone = arrayOriginal.clone();

        // Se alterarmos os valores do clone...
        arrayClone[2] = 100;

        // Não alteramos o valor do array que foi clonado!
        System.out.println(Arrays.toString(arrayOriginal)); // [10, 2, 3]
        System.out.println(Arrays.toString(arrayClone)); // [10, 2, 100]

        // 9 - Arrays 2D (Matrizes)
        // [[1, 2], [2, 3]]
        // array[0][1] = 2

        // Note o [][] para inicializar a matriz!
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(matriz[1][1]); // 5
        System.out.println(matriz[2][2]); // 9
        System.out.println(matriz[2][0]); // 7

        // Criando um array 2D vazio e preechendo-o, dessa forma criamos uma estrutura similar a de cima!
        int[][] tabela = new int[3][3];

        // Sem loops
        tabela[0][0] = 10;
        tabela[1][1] = 20;
        tabela[2][2] = 30;

        // Impressão de matrizes
        // int[] se refere ao tipo de dado, um array de inteiros!
        for(int[] linha: tabela){
            System.out.println(Arrays.toString(linha));
            // [10, 0, 0]
            // [0, 20, 0]
            // [0, 0, 30]
        }

        // Com loops aninhados
        int[][] grade = new int[4][5];

        for(int m = 0; m < grade.length; m++){
            for (int n = 0; n < grade[m].length; n++){
                grade[m][n] = m * n;
            }
        }

        for(int[] linha: grade){
            System.out.println(Arrays.toString(linha));
            //  [0, 0, 0, 0, 0]
            //  [0, 1, 2, 3, 4]
            //  [0, 2, 4, 6, 8]
            //  [0, 3, 6, 9, 12]
            // Os valores que são multiplicados começam em 0!
        }
     }  
}
