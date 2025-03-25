package secao13_JogoAdivinhacao;

import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int alvo = (int) (Math.random() * 100) + 1;
        int contagem = 0;
        int palpite;

        do {
            System.out.println("Tente acertar o número de 1 a 100");
            System.out.println("Qual o seu palpite: ");
            palpite = scanner.nextInt();
            contagem++;
            if (alvo < palpite){
                System.out.println("O número aleatório é MENOR que seu palpite!");
            } else if (alvo > palpite){
                System.out.println("O número aleatório é MAIOR que seu palpite!");
            }
        } while (palpite != alvo);
        if (palpite == alvo){
            System.err.println("Você achou o número aleatório! Foram necessárias " + contagem + " tentativas!");
            scanner.close();
        }


    }
}
