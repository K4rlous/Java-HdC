package secao11;

public class Loops {
    public static void main(String[] args) {
        
        // 1 - For

        // Loop de 1 a 5
        // Variável de inicialização e contador = i, j, k...
        // Condição de até quando ou quantas vezes o loop vai rodar
        // Incremento que aumenta o contador até chegar na condição
        for(int i = 1; i <= 5; i++) {
            System.out.println("Contador: " + i);
        }

        // Mostrar cada caractere de uma String
        // Length em strings = o número de letras!
        // Em arrays e Strings a primeira posição é 0, por isso começamos com o contador em 0 aqui!
        String palavra = "Java";
        for(int i = 0; i < palavra.length(); i++){
            // charAt(i) = o caractere na posição i que é atualizado no loop!
            System.out.println("Caractere: " + palavra.charAt(i));
        }

        // Contagem Regressiva
        for(int i = 5; i > 0; i--){
            System.out.println("Contador: " + i);
        }

        // 2 - While
        // Note que aqui temos de declarar a variável i fora do escopo do loop!
        int i = 1;
        while (i <= 5) { 
            System.out.println("Contador While: " + i);
            i++;
        }

        int valor = 0;
        while(valor != 7){
            // Isso vai gerar um número aleatório até 10!
            // Math sempre gera valores decimais então vamos transformar 'valor' em int com type cast
            valor = (int)(Math.random() * 10);
            System.out.println("Valor aleatório: " + valor);
        }

        // 3 - Loop Infinito
        // while(true){ // A condição nunca muda!
        //     System.out.println("Eita!");
        // }

        //for(int x = 0; x <= 5; x--){ // x nunca vai chegar a 5!
        //    System.out.println(x);
        // }

        // 4 - Do While

        int j = 10;

        do { 
            System.out.println("Contador Do While: " + j);
            j--;
        } while (j > 0);
        // Se 'j' fosse 0 ele rodaria uma vez independentemente da condição, uma vez que ela só é verificada após a execução do código!

        int numero = 0;
        do { 
            numero = (int)(Math.random() * 10);
            System.out.println("Valor aleatório Do While: " + numero);
        } while (numero != 1);

        // 5 - Break

        // Break pode ser utilizado em qualquer estrutura de Loop!

        for(int x = 0; x <= 10; x++){
            System.out.println("O valor de X é: " + x);

            if(x == 5){
                System.out.println("Parando o Loop");
                break;
            }
        }

        // 6 - Continue

        for(int x = 10; x > 0; x--){
            if(x % 2 == 0){
                System.out.println(x + " É Par!");
                continue;
            }
            // Esse trecho não é executado e sim pulado nos números pares!
            System.out.println("Contador de X: " + x);
        }

        // 7 - Nested Loops

        for(int m = 1; m <=3; m++){
            System.out.println("EXTERNO");
            for(int n = 1; n <=3; n++){
                // Note que podemos manipular a variável 'm'
                System.out.println(m + " x " + n + " = " + (m * n));
            }  
        }

        for(int o = 1; o <=10; o++){
            for(int p = 1; p <= o; p++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
