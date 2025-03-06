package secao2;

import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {
        
        // 1 - Testando Scanner
        Scanner scanner = new Scanner(System.in);

        // Mensagem para o usuário
        System.out.println("Digite o seu nome: ");
        // Resgata o valor do terminal
        String nome = scanner.nextLine();
        // Exibe o valor
        System.out.println("Olá, " + nome + "!");

        // nextInt
        System.out.println("Digite um número: ");
        int x = scanner.nextInt();
        System.out.println("O número digitado foi: " + x);

        // 2 - Problema do nextLine
        System.out.println("Digite um número: ");
        int y = scanner.nextInt();

        // Esse nextline vazio impede o erro descrito abaixo de ocorrer!
        scanner.nextLine();

        System.out.println("Digite o um texto: ");
        String txt = scanner.nextLine();

        System.out.println("Os dados são: y = " + y + " e txt = " + txt);
        // resultado: Os dados são: y = 5 e txt =


        // Fecha o Scanner para evitar erros!
        scanner.close();
    }
}
