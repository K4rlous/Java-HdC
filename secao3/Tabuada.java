package secao3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = scanner.nextInt();

        System.out.println(x + " x 1 = " + (x*1));
        System.out.println(x + " x 2 = " + (x*2));
        System.out.println(x + " x 3 = " + (x*3));
        System.out.println(x + " x 4 = " + (x*4));
        System.out.println(x + " x 5 = " + (x*5));
        System.out.println(x + " x 6 = " + (x*6));
        System.out.println(x + " x 7 = " + (x*7));
        System.out.println(x + " x 8 = " + (x*8));
        System.out.println(x + " x 9 = " + (x*9));
        System.out.println(x + " x 10 = " + (x*10));

        scanner.close();

    }
}
