// O Java considera a pasta onde os arquivos são criados como um 'pacote'
// isso facilita a reutilização de classes e métodos dentro do mesmo pacote
// já que o Java organiza os arquivos baseados em sua localização no sistema
package secao17;

// Essa é a estrutura básica de uma classe, porém para ter utilidade ela precisa
// de atributos e propriedades
public class Carro {
    
    // Atributos ou Propriedades
    String marca;
    String modelo;
    int ano;

    // Métodos (funcionam de forma semelhante as funções, temos de definir o retorno, void para não gerar retorno)
    // As funções seguem de exemplo: PUBLIC STATIC VOID NOME (args)
    // os métodos são: VOID NOME (args)
    void acelerar(){
        System.out.println("O " + modelo + " está acelerando!");
    }

    // Acessando os atributos da classe
    void exibirInfo(){
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    // 3 - Métodos
    double velocidadeAtual = 0;
    boolean motorLigado = false;

    void ligarMotor(){
        if(!motorLigado){
            motorLigado = true;
            System.out.println("Ligando motor.....");
        } else {
            System.out.println("O motor já está ligado");
        }
    }

    void aumentarVelocidade(double incremento){
        if(motorLigado){
            velocidadeAtual += incremento;
            System.out.println("A velocidade atual é: " + velocidadeAtual);
        } else {
            System.out.println("Primeiro precisa ligar o motor");
        }
    }
    


}
