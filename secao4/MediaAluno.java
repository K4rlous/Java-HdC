package secao4;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        double a = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double b = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double c = scanner.nextDouble();

        double media = (a + b + c) / 3;

        System.out.println("O nome é: " + nome);
        System.out.println("A média das notas é: " + media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        scanner.close();
    }   
}
