package secao15_JogoDaForca;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaPalavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String palavraSecreta = "macaco";
        // String[] palavraOculta = new String[palavraSecreta.length()];
        // Arrays.fill(palavraOculta, "_");
        // int tentativas = 3;
        

        // Mk1 (Feito com ajudinha rs)
        // while (tentativas > 0) {
        //     System.out.println("Tente adivinhar a palavra oculta:");
        //     System.out.println(String.join(" ", palavraOculta));
        //     System.out.println("Digite uma letra:");
        //     String letra = scanner.nextLine();

        //     boolean acerto = false;
        //     for (int i = 0; i < palavraSecreta.length(); i++) {
        //         if (palavraSecreta.charAt(i) == letra.charAt(0)) {
        //             palavraOculta[i] = letra;
        //             acerto = true;
        //         }
        //     }
            
        //     if (!acerto) {
        //         tentativas--;
        //         System.out.println("Letra incorreta! Tentativas restantes: " + tentativas);
        //     }

        //     if (String.join("", palavraOculta).equals(palavraSecreta)) {
        //         System.out.println("Parabéns! Você acertou a palavra: " + palavraSecreta);
        //         break;
        //     }

        //     if (tentativas == 0) {
        //         System.out.println("Suas tentativas acabaram! A palavra era: " + palavraSecreta);
        //     }
        // }
        // scanner.close();

        // Mk2 (Versão do professor)
        System.out.println("Digite a palavra secreta:");
        String palavraSecreta = scanner.next().toUpperCase();
        char[] palavraOculta = new char[palavraSecreta.length()];
        Arrays.fill(palavraOculta, '-');

        int tentativas = 5;
        boolean venceu = false;

        while(tentativas > 0){
            // Retorna a representação em string de valores em char
            System.out.println("Palavra: " + String.valueOf(palavraOculta));
            System.out.println("Tentativas: " + tentativas);
            System.out.println("Digite uma letra: ");
            // Dessa forma mesmo se o usuário digitar uma palavra inteira contaremos apenas com a primeira letra e a tornaremos maiuscula!
            char letra = scanner.next().toUpperCase().charAt(0);
            boolean acertou = false;

            for(int i = 0; i < palavraSecreta.length(); i++){
                if(palavraSecreta.charAt(i) == letra){
                    palavraOculta[i] = letra;
                    acertou = true;
                }
            }
            // Se o usuário não acertar
            if(!acertou){
                tentativas--;
                System.out.println("Letra incorreta!");
            } else {
                System.out.println("Letra correta!");
            }

            // Se o usuário acertar a palavra com tentativas restantes
            if(String.valueOf(palavraOculta).equals(palavraSecreta)){
                venceu = true;
                break;
            }
        }

        // Condição de vitória
        if(venceu){
            System.out.println("Parabéns, restavam-lhe apenas " + tentativas + " tentativas!");
        } else {
            System.out.println("Você perdeu!");
        }
        System.out.println("A palavra era: " + palavraSecreta);
        scanner.close();
        

    }
}
