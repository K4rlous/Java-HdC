package secao23;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        
        // 1 - Classes genéricas
        // Ao instanciar uma classe genérica temos de definir finalmente o tipo de dado como no exemplo abaixo, <Integer>
        Caixa<Integer> caixaInteira = new Caixa<>();
        // Podemos adicionar '100' pois é um tipo de inteiro
        caixaInteira.adicionar(100);
        // Tentar adicionar qualquer outro tipo de dado resultaria num erro
        //caixaInteira.adicionar("conteudo");
        System.out.println(caixaInteira.obter()); // 100

        Caixa<String> caixaString = new Caixa<>();
        caixaString.adicionar("Fulano");
        //caixaString.adicionar(20);
        System.out.println(caixaString.obter()); // Fulano

        // 2 - Métodos genéricos
        System.out.println("Maior valor entre 5 e 10: " + obterMaior(5, 10)); // 10

        System.out.println("Maior valor entre Java e Python: " + obterMaior("Java", "Python")); // Python

        String[] letras = {"a", "b", "c", "d"};
        Integer[] numeros = {12, 24, 35, 31, 6};
        Boolean[] bools = {true, false, true, false, false};

        imprimirArray(letras);
        imprimirArray(numeros);
        imprimirArray(bools);

        System.out.println();

        // a, b, c, d, 12, 24, 35, 31, 6, true, false, true, false, false,
        
        // 3 - Tipos delimitados (Bounded types)
        Comparador<Integer> comparadorInteiros = new Comparador<>();
        
        System.out.println("Maior número entre 20 e 40: " + comparadorInteiros.obterMaior(20, 40)); // 
        
        // Como restringimos T para dados numéricos, a linha abaixo retornaria um erro, uma vez que o comparador não pode ser inicializado como String!
        // Comparador<String> comparadorString = new Comparador<>();

        
        // 4 - Coringas (Wildcards) - Veremos mais sobre Listas depois!
        List<Integer> numeros2 = List.of(1,2,3,4,5,6);
        List<String> palavras2 = List.of("Teste", "Java", "Exemplo");

        // Como o método 'imprimirLista' é genérico, podemos usar ele para imprimir ambos exemplos acima e/ou qualquer tipo de dado
        imprimirLista(numeros2);
        imprimirLista(palavras2);

        // Coringa com bounded type
        System.out.println(somarNumeros(numeros2)); // 21.0
        // Como limitamos os valores genéricos a numerais, o uso de Strings retorna erro!
        // System.out.println(somarNumeros(palavras2));

        // Coringa aceitando apenas tipos numéricos específicos, aqui ele somente aceitará <Number> ou <Integer>, qualquer outro tipo de dado numérico retornará um erro!
        List<Number> numeros3 = new ArrayList<>();
        adicionarNumeros(numeros3);

        // Note que se declarassemos <Integer> acima, abaixo no loop for teriamos que declarar Integer também! o uso de <Number> requer o uso do Object!
        for(Object numero : numeros3){
            System.out.println(numero);
        }
    }

    // Obter maior valor entre 2 valores de forma genérica e implementando o 'Comparable'

    // O uso da classe em <T> tem o propósito de permitir o uso de 'compareTo' em dados genéricos!
    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2){
        return (valor1.compareTo(valor2) > 0) ? valor1 : valor2;
    }

    // Percorrer arrays independentemente do tipo

    // Note o uso do array de valores genéricos T[]
    public static <T> void imprimirArray(T[] array){
        for(T elemento : array){
            System.out.print(elemento + ", ");
        }
    }
    
    // Coringas
    // Veremos Lists (ou Collections) em mais detalhes depois
    public static void imprimirLista(List<?> lista){
        for(Object elemento : lista){
            System.out.println(elemento);
        }
    }

    // Coringa com bounded types
    // Note que limitamos os tipos para 'Number' ou numéricos!
    public static double  somarNumeros(List<? extends Number> lista){
        double soma = 0;
        for(Number numero : lista){
            // Mais um parse para evitar erro de compilação!
            soma += numero.doubleValue();
        }
        return soma;
    }

    // Coringa aceitando apenas tipos numéricos específicos, dessa forma aceitamos apenas numeros inteiros!
    public static void adicionarNumeros(List<? super Integer> lista){
        for(int i = 1; i <= 5; i++){
            lista.add(i);
        }
    }

}
