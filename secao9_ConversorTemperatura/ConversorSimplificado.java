package secao9_ConversorTemperatura;

import java.util.Scanner;

public class ConversorSimplificado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1: Celsius para Fahrenheit");
        System.out.println("2: Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        System.out.println("Informe a temperatura:");
        double temperatura = scanner.nextDouble();
        double resultado = 0;

        switch (escolha) {
            case 1 -> {
                resultado = (temperatura * 9 / 5) + 32;
                System.out.println(temperatura + "°C convertido é igual a: " + resultado + "°F");
            }
            case 2 -> {
                resultado = (temperatura - 32) * 5 / 9;
                System.out.println(temperatura + "°F convertido é igual a: " + resultado + "°C");
            }
            default -> System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}