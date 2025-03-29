package secao16_VerificadorForcaSenha;

import java.util.Scanner;

public class VerificadorForcaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Mk1 
        // System.out.println("Digite a senha para verificação!");
        // String senha = scanner.nextLine();

        // verificarSenha(senha);
        // scanner.close();

        // Mk2 (versão do professor)
        System.out.println("Digite a senha: ");
        String senha = scanner.next();
        int forca = verificarForcaSenha(senha);

        if(forca <= 2){
            System.out.println("A sua senha é FRACA!");
        } else if (forca == 3){
            System.out.println("A sua senha é MEDIA!");
        } else if (forca == 4){
            System.out.println("A sua senha é SEGURA!");
        } else {
            System.out.println("A sua senha é MUITO FORTE!");
        }
        scanner.close();


    }
    // mk1 
    // public static void verificarSenha(String senha){
    //     // Fraca <=5 sem numeros
    //     // Media <=8 com numeros
    //     // Forte > 8 com numeros
    //     if(senha.length() >= 8){
    //         System.out.println("Sua senha é forte!");
    //     } else if (senha.length() < 5){
    //         System.out.println("Sua senha é fraca!");
    //     } else {
    //         System.out.println("Sua senha é mediana!");
    //     }
    // }

    public static int verificarForcaSenha(String senha){
        int forca = 0;

        if(senha.length() > 8){
            forca++;
        }
        // ELE USOU EXPRESSÕES REGULARES!
        // Letras maíusculas de A a Z
        if(senha.matches(".*[A-Z].*")){
            forca++;
        }
        // Letras minúsculas de A a Z
        if(senha.matches(".*[a-z].*")){
            forca++;
        }
        // Numeros!
        if(senha.matches(".*\\d.*")){
            forca++;
        }
        // Caracteres especiais (temos de especificar) os \\ FAZEM ESCAPE (PESQUISE)
        if(senha.matches(".*[!@#$%&*()\\-_.<>].*")){
            forca++;
        }
        return forca;
    }
}
 
