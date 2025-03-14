package secao6_calcIMC;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em Kgs: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em Metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("Seu IMC é: " + imc + " Você é considerado: Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Seu IMC é: " + imc + " Você é considerado: Peso normal");
        } else if (imc >= 25 && imc < 29.9){
            System.out.println("Seu IMC é: " + imc + " Você é considerado: Sobrepeso");
        } else {
            System.out.println("Seu IMC é: " + imc + " Você é considerado: Obeso");
        }

        scanner.close();
    }
}
