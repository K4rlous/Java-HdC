package secao20;

// Não tem herança propriamente dita
// Mas precisa de extends!
public class Violao extends InstrumentoMusical{
    public Violao(String nome){
        super(nome);
    }


    // Implementação de métodos abstratos, sempre com OVERRIDE!
    @Override
    public void tocar() {
       System.out.println("Tocando as cordas do: " + nome);
    }
}
