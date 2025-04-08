package secao18_Loteria;

import java.util.Arrays;
import java.util.Random;

public class Bilhete {

    private int[] numerosEscolhidos;
    private int[] resultadoSorteio;

    public Bilhete(int[] numerosEscolhidos) {
        this.numerosEscolhidos = numerosEscolhidos;
    }

    public void realizarSorteio(){
        Random random = new Random();
        // Atribuimos a variável a um array com 6 posições
        resultadoSorteio = new int[6];
        for(int i = 0; i < resultadoSorteio.length; i++){
            // Atribuimos um número aleatório ao indice i em resultadoSorteio
            resultadoSorteio[i] = random.nextInt(60) + 1;
        }
        Arrays.sort(resultadoSorteio);
}

    public int contarAcertos(){
        // Aqui eu fiz em loops aninhados na minha versão!
        int acertos = 0;
        for(int numerosEscolhido : numerosEscolhidos){
            for(int numeroSorteado : resultadoSorteio){
                if(numerosEscolhido == numeroSorteado){
                    acertos++;
                }
            }
        }
        return acertos;
    }

    public void exibirResultados(){
        System.out.println("Números escolhidos: " + Arrays.toString(numerosEscolhidos));
        System.out.println("Números sorteados: " + Arrays.toString(resultadoSorteio));

        int acertos = contarAcertos();

        System.out.println("Você teve: " + acertos + " acertos!");
        
        System.out.println();
    }
}
