package secao23;

public class Pato extends Animal implements Voador, Nadador{

    @Override
    public void nadar() {
        System.out.println("O pato está nadando");
    }

    @Override
    public void voar() {
        System.out.println("O pato está voando");
    }
    
}
