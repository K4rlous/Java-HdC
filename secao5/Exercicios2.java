package secao5;

import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 3

        System.out.println("Insira um número: ");
        int x = scanner.nextInt();

        // if (x % 2 == 1) é preferencial ao invés de if ((x % 2) == 1)
        if ((x % 2) == 1){
            System.out.println("O número é impar");
        } else {
            System.out.println("O número é par");
        }

        // Exercício 4 

        System.out.println("Insira um número de 1 a 7");
        int y = scanner.nextInt();
        switch (y) {
            case 1 -> System.out.println("Domingo / Final de semana"); 
            case 2 -> System.out.println("Segunda-feira / Dia útil");
            case 3 -> System.out.println("Terça-feira / Dia útil");
            case 4 -> System.out.println("Quarta-feira / Dia útil");
            case 5 -> System.out.println("Quinta-feira / Dia útil");
            case 6 -> System.out.println("Sexta-feira / Dia útil");
            // pode ser assim também 7,8,9...
            case 7 -> System.out.println("Sábado / Final de semana"); 
            default -> System.err.println("Insira um valor válido!");
        }
        scanner.close();
    }
}
