package secao5;

import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 5

        System.out.println("Insira um valor: ");
        int valor = scanner.nextInt();

        if (valor >= 10 && valor <= 20){
            System.out.println("Valor dentro do intervalo");
        } else {
            System.out.println("Valor fora do intervalo");
        }

        // Exercício 6

        System.out.println("Insira um letra: ");
        // charAt(0) vai considerar apenas o dígito de posição 0! (primeiro)
        char letra = scanner.next().toLowerCase().charAt(0);
        switch (letra) {
            // Com Char usamos aspas simples ' '
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vogal");
            default -> System.out.println("Consoante");
        }
        scanner.close();
    }
}
