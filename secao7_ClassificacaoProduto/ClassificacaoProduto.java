package secao7_ClassificacaoProduto;

import java.util.Scanner;

public class ClassificacaoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Catalogo 
        String produto1 = "Teclado";
        String produto2 = "Mouse";
        String produto3 = "Monitor";

        double preco = 0;

        System.out.println("Digite o nome do produto: ");

        String nomeProduto = scanner.nextLine();

        // Verificação do Catalogo
        if (produto1.equalsIgnoreCase(nomeProduto) || produto2.equalsIgnoreCase(nomeProduto) || produto3.equalsIgnoreCase(nomeProduto)) {
            System.out.println("Produto já existente. Atualizar o preço? | (sim/não)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("sim")){
                System.out.println("Insira o novo preço: ");
                preco = scanner.nextDouble();
            } else {
                System.out.println("Preço inalterado");
                scanner.close();
            }
        } else {
            System.out.println("Insira o preço do produto: ");
            preco = scanner.nextDouble();
        }

        // Classificação

        if (preco < 50){
            System.out.println("Classificação: Barato");
        } else if (preco >= 50 && preco <= 100){
            System.out.println("Classificação: Moderado");
        } else {
            System.out.println("Classificação: Caro");
        }

        // Output

        System.out.println("Produto: " + nomeProduto + " . Preço: " + preco);
    }
}
