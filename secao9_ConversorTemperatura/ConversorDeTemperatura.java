package secao9_ConversorTemperatura;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha o tipo de conversão!");
    System.out.println("1: Celsius para Fahrenheit");
    System.out.println("2: Fahrenheit para Celsius");

    int input = scanner.nextInt();

        switch (input) {
            case 1 -> converterCparaF();
            case 2 -> converterFparaC();
            default -> System.out.println("Opção inválida!");
        }
    scanner.close();
    }

    public static void converterCparaF(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatur em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "C convertido é igual a: " + fahrenheit + "F");
        scanner.close();
    }

    public static void converterFparaC(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatur em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + "F convertido é igual a: " + celsius + "C");
        scanner.close();
    }
}
