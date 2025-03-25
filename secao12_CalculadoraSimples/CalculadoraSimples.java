package secao12_CalculadoraSimples;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do { 
            System.out.println("Digite o primeiro número para realizar a operação: ");
            double n1 = scanner.nextDouble();
            System.out.println("Digite o segundo número para realizar a operação: ");
            double n2 = scanner.nextDouble();
            System.out.println("Calculadora Simples - Menu de Operações");
            System.out.println("(1) - Soma");
            System.out.println("(2) - Subtração");
            System.out.println("(3) - Multiplicação");
            System.out.println("(4) - Divisão");
            System.out.println("(5) - Sair");
            System.out.println("Escolha a operação!");
            opcao = scanner.nextInt();
            if ((n1 == 0 || n2 == 0) && opcao == 4){
                System.out.println("Não é possível dividir por zero, encerrando programa!");
                break;
            }
            switch (opcao) {
                case 1 -> System.out.println(n1 + " + " + n2 + " = " + soma(n1, n2));
                case 2 -> System.out.println(n1 + " - " + n2 + " = " + subtracao(n1, n2));
                case 3 -> System.out.println(n1 + " x " + n2 + " = " + multiplicacao(n1, n2));
                case 4  -> System.out.println(n1 + " / " + n2 + " = " + divisao(n1, n2));
                default -> {
                    System.out.println("Encerrando");
                    break;
                }
            }
        } while (opcao != 5);
        scanner.close();
    }

    public static double soma(double a, double b){
        return a + b;
    }

    public static double subtracao(double a, double b){
        return a - b;
    }

    public static double multiplicacao(double a, double b){
        return a * b;
    }

    public static double divisao(double a, double b){
        return a / b;
    }
}
