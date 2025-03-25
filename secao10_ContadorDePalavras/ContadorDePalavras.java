package secao10_ContadorDePalavras;

import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) { 
            contarPalavras();
            System.out.println("Deseja continuar? (s/n)");
            continuar = scanner.nextLine();
        }
        System.out.println("Aplicação encerrada");
        scanner.close();
       
    }

    public static void contarPalavras(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Transformar a frase em um Array de Strings
        // trim para não contar os espaços em branco como palavras
        // split para dividir a frase em palavras a cada regex
        // regex = expressão regular / \\s+ é o simbolo de espaço
        // logo as palavras são divididas a cada
        String[] palavras = frase.trim().split("\\s+");

        // Java is cursed
        // ['Java', 'is', 'cursed'] = 3

        // Usar lenght para saber quantas palavras tem no array
        int numerosPalavras = palavras.length;

        System.out.println("A frase contém: " + numerosPalavras + " palavras");
    }
}
