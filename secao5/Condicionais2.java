package secao5;

import java.util.Scanner;

public class Condicionais2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 - Condicional ternário

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        // Condição x > 5 ? true : false;
        String resultado = (n % 2 == 0) ? "Par" : "Impar";

        System.out.println(resultado);

        // 2 - If encadeado

        int idade = 25;
        boolean cNH = false;

        if (idade >= 18){
            if (cNH) {
                System.out.println("Pode dirigir");
            } else {
                System.out.println("Não tem CNH para poder dirigir");
            }
        } else {
            System.out.println("Nâo tem idade para poder dirigir");
        }

        // 3 - Precedência

        boolean a = true;
        boolean b = false;
        boolean c = true;

        // TRUE AND FALSE -> FALSE OR TRUE -> TRUE
        boolean resultado2 = a && b || c; // true
        System.out.println(resultado2);

        // TRUE OR FALSE -> TRUE AND TRUE
        boolean resultado3 = a || b && c; // true
        System.out.println(resultado3);

        // NOT (TRUE OR FALSE) -> NOT(TRUE) -> FALSE AND TRUE -> FALSE
        boolean resultado4 = !(a || b) && c; // false
        System.out.println(resultado4);

        // (NOT TRUE OR FALSE) AND TRUE
        // (FALSE OR FALSE) AND TRUE
        // FALSE AND TRUE
        // FALSE
        boolean resultado5 = (!a || b) && c; // false
        System.out.println(resultado5);
    }   

}
