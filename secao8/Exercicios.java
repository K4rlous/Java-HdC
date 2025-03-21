package secao8;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1
        double celsius = 23.0;
        double fahrenheit = conversorFahrenheit(celsius);
        System.out.println("A temperatura convertida em Fahrenheits é: "  + fahrenheit);

        // Exercício 2
        System.out.println("O fatorial de 5 é: " + calcFatorial(5));

        // Exercício 3
        System.out.println("O número 15... " + parOuImpar(15));

        // Exercício 4
        System.out.println(notas(5));

        // Exercício 5
        verificarAcesso(18);

        // Exercício 6
        int[] numeros = {10, 5, 22, 44, 5};
        System.out.println(encontrarMaior(numeros));

        scanner.close();
    }



    // Funções

    public static double conversorFahrenheit(double n){
        return (n * 1.8) + 32;
    }

    public static int calcFatorial(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            // Reutilizando a função
            return n * calcFatorial(n-1);
        } 
    }

    public static String parOuImpar(int n){
        if (n % 2 == 0 ){
            return "É par!";
        } else {
            return "É impar!";
        }
    }

    public static String notas(int n){
        if (n < 0 || n > 10){
            return "Nota inválida!";
        }
        return switch (n) {
            case 10, 9 -> "Nota " + n + " Resultado: A";
            case 8, 7 -> "Nota " + n + " Resultado: B";
            case 6, 5 -> "Nota " + n + " Resultado: C";
            case 4, 3 -> "Nota " + n + " Resultado: D";
            default -> "Nota " + n + " Resultado: F";
        };
    }

    public static void verificarAcesso(int n){
        if (n < 18){
            System.out.println("Acesso negado!");
            System.exit(0);
        } else {
            System.out.println("Acesso permitido!");
        }
    }

    // Vamos receber um array [] nomeados de numeros!
    public static int encontrarMaior(int[] numeros){
        int maior = numeros[0];
        // Contador, Cond. execução, Incremento
        for (int i = 1; i < numeros.length; i++){
            // Se o número do array for maior que 'maior', ocorre a atribuição!
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }
        return maior;
    }
    }
