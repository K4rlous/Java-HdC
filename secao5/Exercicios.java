package secao5;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        // Exercício 01

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        if (valor > 100){
            System.out.println("O produto é caro!");
        } else if (valor >= 50 &&  valor <= 100) {
            System.out.println("O produto é médio!");
        } else {
            System.out.println("O produto é barato!");
        }
        
        scanner.nextLine();

        // Exercicio 2

        System.out.println("Digite o login: ");
        String login = scanner.next();
        
        System.out.println("Digite a senha: ");
        String senha = scanner.next();

        if ("admin".equals(login) && "1234".equals(senha)){
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado!");
        }

        scanner.close();
    }
}
