package secao11;

public class LoopsB {
    public static void main(String[] args) {

        // 8 - Loops com Rótulos (Labels loops)

        // Rótulos externos e internos

        externo:
        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){
                // Quando ambos contadores estiverem em 1, o loop externo é interrompido!
                // Usar somente break pararia apenas o loop interno!
                if (i == 1 && j == 1 ){
                    break externo;
                }
                System.out.println("i " + i + " , j " + j);
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.println("Externo " + i);

            interno:
            for(int j = 0; j < 3; j++){

                if (j == 2){
                    System.out.println("Parou interno");
                    break interno; // o break interno é desnecessário, apenas break funcionaria!
                }

                System.out.println("i " + i + " , j " + j);
            }
        }

        // 9 - Off by one
        // Executar 5 vezes
        for(int i = 0; i < 5; i++){
            System.out.println("I: " + i);
        }
        // A omissão do = em '<=' faz o loop chegar apenas no número 4!
        // Ao trabalhar com arrays, errar esse tipo de coisa pode fazer com que o programa seja interrompido, uma vez que podemos tentar acessar índices não existentes!

    }
}
