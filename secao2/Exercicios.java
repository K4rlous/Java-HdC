package secao2;

public class Exercicios {
    public static void main(String[] args) {
        
         // Exercício 01
         int a1 = 10;
         int a2 = a1 * 2;
         System.out.println(a2); // resultado: 20
 
         // Exercício 02
         char b1 = 'B';
         int codigoAscii2 = (int) b1;
         System.out.println(codigoAscii2); // resultado: 66
 
         // Exercício 03
         double c1 = 15.75;
         double c2 = 20.40;
         double c3 = c1 + c2;
         System.out.println(c3); // resultado: 36.15
 
         // Exercício 04
         long d1 = 200_000_0000l;
         int d2 = (int) d1;
         System.out.println(d2); // resultado: 2000000000
 
         // Exercício 05
         String e1 = ("Olá, mundo!");
         String e2 = (e1 + " " + "Bem-vindo ao Java!");
         System.out.println(e2); // resultado: Olá, mundo! Bem-vindo ao Java!
    }
}
