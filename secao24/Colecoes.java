package secao24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecoes {
    public static void main(String[] args) {
        
        // 1 - List
        List<String> listaDeNomes = new ArrayList<>();

        // Adicionando elementos
        listaDeNomes.add("Fulano");
        listaDeNomes.add("Ciclano");
        listaDeNomes.add("Beltrano");

        // Resgatando elementos
        System.out.println("Primeiro nome: " + listaDeNomes.get(0));

        // Alterando elementos
        listaDeNomes.set(1, "Novo Ciclano");
        System.out.println("Segundo nome alterado: " + listaDeNomes.get(1));

        // Removendo elementos
        listaDeNomes.remove(2);
        System.out.println("Lista após remoção: " + listaDeNomes);

        // Procura por valor de item
        System.out.println("Lista contém 'Fulano'? " + listaDeNomes.contains("Fulano")); // true

        // LinkedList
        List<Integer> numeros = new LinkedList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        System.out.println("Lista de números: " + numeros);
        System.out.println(numeros.get(1)); // Acessa o segundo elemento
        numeros.remove(0); // Remove o primeiro elemento
        // Ver os valores facilmente, util para debugging
        System.out.println(numeros.toString()); 
        numeros.set(1, 40); // Altera o segundo elemento
        System.out.println(numeros.get(1)); 

        // As collections tem os mesmos métodos, mas nem todas podem aplicar todos os métodos
        // Exemplo: LinkedList não tem o método 'contains' como ArrayList, mas pode ser usado com 'contains' porque é uma interface de List


        // 2 - Set

        // HashSet - Não mantém a ordem de inserção, não permite duplicatas
        Set<String> conjunto = new HashSet<>();
        // Adicionando elementos
        conjunto.add("Item 1");
        conjunto.add("Item 2");
        conjunto.add("Item 3");
        conjunto.add("Carlos");
        conjunto.add("Beltrano");
        conjunto.add("Ana");
        // Tentando adicionar um elemento duplicado
        conjunto.add("Item 1"); // Não será adicionado, pois Set não permite duplicatas
        // Exibindo o conjunto
        System.out.println("Conjunto: " + conjunto);
        // Verificando se um elemento está no conjunto
        System.out.println("Conjunto contém 'Item 1'? " + conjunto.contains("Item 1")); // true

        // LinjkedHashSet - Mantém a ordem de inserção, não permite duplicatas
        Set<Integer> numerais = new LinkedHashSet<>();
        // Adicionando elementos
        numerais.add(1);
        numerais.add(2);    
        numerais.add(3);
        System.out.println("Conjunto de números: " + numerais);

        // Treeset - Mantém a ordem natural (alfabética e  numérica) dos elementos, não permite duplicatas
        Set<String> nomes = new TreeSet<>();
        // Adicionando elementos
        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Beltrano");
        // Exibindo o conjunto
        System.out.println("Conjunto de nomes: " + nomes);

        // SET não permite o uso de get, logo não é possível acessar um elemento por índice.
        // Para acessar um elemento específico, é necessário iterar sobre o conjunto.
        

        // 3 - Map

        // HashMap - Armazena pares chave-valor, não mantém a ordem de inserção
        Map<String, Integer> idadeMap = new HashMap<>();
        // Adicionando elementos com put
        idadeMap.put("Carlos", 30);
        idadeMap.put("Ana", 25);
        idadeMap.put("Beltrano", 40);
        // Exibindo o mapa
        System.out.println("Mapa de idades: " + idadeMap);
        // Inserindo um elemento com chave duplicada
        idadeMap.put("Carlos", 35); // Atualiza o valor da chave "Carlos"
        System.out.println("Mapa de idades após atualização: " + idadeMap);
        // Acessando um valor por chave
        System.out.println("Idade de Ana: " + idadeMap.get("Ana")); 
        // removendo um elemento
        idadeMap.remove("Beltrano");
        System.out.println("Mapa de idades após remoção: " + idadeMap);
        // Verificando se uma chave existe
        System.out.println("Mapa contém chave 'Carlos'? " + idadeMap.containsKey("Carlos")); // true
        // Verificando se um valor existe   
        System.out.println("Mapa contém valor 25? " + idadeMap.containsValue(25)); // true
        // Entryset
        System.out.println("Entradas do mapa: " + idadeMap.entrySet());

        // LinkedHashMap - Armazena pares chave-valor, mantém a ordem de inserção
        Map<String, String> capitalMap = new LinkedHashMap<>();
        capitalMap.put("Brasil", "Brasília");
        capitalMap.put("Estados Unidos", "Washington, D.C.");
        capitalMap.put("França", "Paris");
        System.out.println("Mapa de capitais: " + capitalMap);
        System.out.println(capitalMap.containsKey("Brasil")); // true

        // TreeMap - Armazena pares chave-valor, mantém a ordem natural das chaves
        Map<String, Double> produtoPrecoMap = new TreeMap<>();
        produtoPrecoMap.put("Maçã", 2.50);
        produtoPrecoMap.put("Banana", 1.20);
        produtoPrecoMap.put("Laranja", 3.00);
        System.out.println("Mapa de produtos e preços: " + produtoPrecoMap);
        System.out.println(produtoPrecoMap.containsKey("Banana")); // true  


    }

}
