package secao20;

// Mesmo exemplo de Violao.java
public class Bateria extends InstrumentoMusical{
    public Bateria(String nome){
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Batendo nos tambores da:  " + nome);
    }
    
}
