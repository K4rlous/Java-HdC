package secao24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

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
        numeros.add(8);
        numeros.add(5);
        numeros.add(20);
        numeros.add(30);
        numeros.add(2);
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

        // 4 - Iterando sobre coleções

        // For-each para List
        System.out.println("Iterando sobre lista de nomes com For-Each:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Iterator
        System.out.println("Iterando sobre conjunto de nomes com Iterator:");
        Iterator<String> nomesIterator = nomes.iterator();
        // Remover um elemento durante a iteração
        while (nomesIterator.hasNext()) {
            String nome = nomesIterator.next();
            if(nome.equals("Carlos")) {
                nomesIterator.remove(); // Remove "Carlos" do conjunto
            } else {
                System.out.println(nome);
            }
        }

        // ListIterator - precisa de uma lista, permite iteração bidirecional
        System.out.println("Iterando sobre lista de nomes com ListIterator:");
        ListIterator<String> listIteratorNomes = listaDeNomes.listIterator();
        while (listIteratorNomes.hasNext()) {
            String nome = listIteratorNomes.next();
            System.out.println(nome);
        }
        // Iterando em ordem 
        System.out.println("Iterando sobre lista de nomes em ordem reversa com ListIterator:");
        while (listIteratorNomes.hasPrevious()) {
            String nome = listIteratorNomes.previous();
            System.out.println(nome);
        }

        // 5 - Collections Imutáveis

        // List Imutável
        List<String> listaMutavel = new ArrayList<>();
        listaMutavel.add("Item 1");
        listaMutavel.add("Item 2");
        // Criando uma lista imutável a partir da lista mutável
        List<String> listaImutavel = Collections.unmodifiableList(listaMutavel);
        System.out.println("Lista imutável: " + listaImutavel);
        // Tentando modificar a lista imutável (lançará UnsupportedOperationException)
        try {
            listaImutavel.add("Item 3"); // Isso causará uma exceção
        } catch (UnsupportedOperationException e) {
            System.out.println("Não é possível modificar a lista imutável: " + e.getMessage());
        }

        // List of
        List<String> listaImutavel2 = List.of("Item A", "Item B", "Item C");
        System.out.println("Lista imutável criada com List.of: " + listaImutavel2);
        // Ela também não pode ser modificada

        // Set of
        Set<Integer> listaImutavelSet = Set.of(1, 2, 3, 4, 5);
        System.out.println("Set imutável criado com Set.of: " + listaImutavelSet);
        // Adivinha? também não pode ser modificada!

        
        // 6 - Filter
        // Filtrando uma lista para encontrar os números maiores que 3
        List<Integer> numerosFiltrados = numeros.stream()
        .filter(numero -> numero > 3)
        .collect(Collectors.toList());
        // numero -> numero > 3 é uma expressão lambda que define a condição de filtragem
        // A quebra de linha é opcional, mas ajuda na legibilidade de filtros mais complexos
        System.out.println("Números filtrados maiores que 3: " + numerosFiltrados);
        System.out.println("Lista original de números: " + numeros);


        // 7 - Busca
        // Busca em collections usando for
        int numeroParaBuscar = 5;
        boolean encontrado = false;
        for(Integer numero : numeros) {
            if(numero == numeroParaBuscar) {
                encontrado = true;
                break; // Encerra o loop se o número for encontrado
            }
        }
        System.out.println("Número " + numeroParaBuscar + " encontrado? " + encontrado);

        // Usando contains
        String nomeParaBuscar = "Carlos";
        boolean nomeEncontrado = listaDeNomes.contains(nomeParaBuscar);
        System.out.println("Nome " + nomeParaBuscar + " encontrado na lista? " + nomeEncontrado);

        // Usando findAny
        Optional<Integer> qualquerNumero = numeros.stream()
            .findAny();
        System.out.println("Qualquer número encontrado na lista: " + qualquerNumero);

        // Usando findFirst
        Optional<Integer> primeiroNumero = numeros.stream()
            .findFirst();
        System.out.println("Primeiro número encontrado na lista: " + primeiroNumero);

        // Encontrando o primeiro número par
        Optional<Integer> primeiroPar = numeros.stream()
            .filter(numero -> numero % 2 == 0)
            .findFirst();
        System.out.println("Primeiro número par encontrado: " + primeiroPar); 

        // 8 - Map com Stream
        // Modificam a coleção original
        List<Integer> quadrados = numeros.stream()
            .map(numero -> numero * numero) // Multiplica cada número por ele mesmo
            .collect(Collectors.toList());
        System.out.println("Lista original de números: " + numeros);
        System.out.println("Quadrados dos números: " + quadrados);


        List<String> nomesMaiusculos = nomes.stream()
            .map(String::toUpperCase) // Converte cada nome para maiúsculas
            .collect(Collectors.toList());
        System.out.println("Nomes originais: " + nomes);
        System.out.println("Nomes em maiúsculas: " + nomesMaiusculos);


        // 9 - Modificação de lista

        numeros.add(50); // Adiciona um novo número à lista

        numeros.remove(2); // Remove o número no índice 2 (que era 20)
        numeros.remove(Integer.valueOf(30)); // Remove o número 30 da lista
        numeros.removeIf(numero -> numero > 22); // Remove todos os números maiores que 22

        numeros.replaceAll(numero -> numero * 3); // Multiplica todos os números por 3


        // 10 - Reduce
        // Soma de todos os números da lista
        int somaTotal = numeros.stream()
            .reduce(0, Integer::sum); // Começa com 0 e soma todos os números
        System.out.println("Soma total dos números: " + somaTotal);

        // Concatenação de variáveis de texto
        String frase = nomes.stream()
            .reduce("", (acumulador, nome) -> acumulador + " " + nome); // Concatena todos os nomes com um espaço
        System.out.println("Frase formada pelos nomes: " + frase.trim()); // trim() para remover espaços extras no início e no final

        // Versão mais moderna
        /*String frase = nomes.stream()
                    .collect(Collectors.joining(" "));
         */



    }

}
