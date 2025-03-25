package secao11;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exercício 01
        int soma = 0;
        for (int x = 0; x <= 100; x++){
            soma += x;
        }
        System.out.println("A soma de 1 a 100 é: " + soma); // resultado: 5050

        // Exercício 02
        int x = 1;
        while(x <= 20){
            if(x % 2 == 0){
                System.out.println(x + " é par!");
            }
            x++;
        }

        // Exercício 03
        System.out.println("Digite um número para saber se ele é primo: ");
        int primo = scanner.nextInt();

        boolean ePrimo = true;
        // i começa em 2 porque numeros primos nao podem ser divididos por 1!
        for(int i = 2; i < primo; i++){
            if (primo % i == 0){
                ePrimo = false;
                break;
            }
        }
        if(ePrimo){
            System.out.println("O número " + primo + " é primo!");
        } else {
            System.out.println("O número " + primo + " NÃO é primo!");
        }

        // Exercício 04

        int opcao;
        do { 
            System.out.println("Exercício 4 - Menu");
            System.out.println("(1) Lanche");
            System.out.println("(2) Batata");
            System.out.println("(3) Suco");
            System.out.println("(4) Sair");
            opcao = scanner.nextInt();
            System.out.println("A opção escolhida foi: " + opcao);
        } while (opcao != 4);

        // Exercício 05
        int numFatorial = 12;
        int fatorial = 1;
       
        for(int i = 1; i <= numFatorial; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numFatorial + " é igual a: " + fatorial);

        // Exercício 06
        int numeroParaContar = 1000;
        int contador = 0;

        while(numeroParaContar != 0){
            // Dividir por 10 remove o último dígito 1000 > 100 > 10 > 1 > 0 e o contador sobe, o processo para quando o número divido for 0!
            numeroParaContar = numeroParaContar / 10;
            contador++;
        }
        System.out.println("Número de digitos: " + contador);
        }
}
