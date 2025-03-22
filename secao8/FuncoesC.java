package secao8;

import java.util.Arrays;
import java.util.List;

public class FuncoesC {
    public static void main(String[] args) {
        
        // 12 - Funções Recursivas

        int soma = somaRecursiva(6); // resultado: 21
        System.out.println(soma);

        // 13 - Method Overloding
        
        System.out.println(soma(10, 20));
        System.out.println(soma(15, 12, 55));
        System.out.println(soma(45.5, 484.2, 47.2));

        // 14 - Funções Anônimas (Lambda Expressions)
        // Por ser simples e de única linha, não precisamos por abaixo do método main, NÃO ESQUEÇA DO 'RUNNABLE'

        Runnable tarefa = () -> System.out.println("Minha função anônima");

        // Para invocar essa função precisamos do método 'run'
        tarefa.run();

        // (arg1, arg2) -> {}

        // Um pouco mais complexo usando algumas bibliotecas para imprimir os nomes da lista usando funções anônimas

        List<String> nomes = Arrays.asList("Ana", "Pedro", "Paulo");

        // For each usa uma função anônima para exibir cada nome da lista
        nomes.forEach(nome -> System.out.println(nome));

    }

    public static int somaRecursiva(int n ){
        if (n == 1){
            return 1;
        } else {
            // RECURSIVIDADE! 
            return n + somaRecursiva(n - 1);
        }
    }

    public static int soma(int a, int b){
        return a + b;
    }

    public static int soma(int a, int b, int c){
        return a + b + c;
    }

    public static double soma(double a, double b, double c){
        return a + b + c;
    }
}
