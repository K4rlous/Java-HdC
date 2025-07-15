package secao26;

public class Cachorro extends Animal {
    
    @Override
    public void emititirSom() {
        System.out.println("O cachorro late.");
    }

    @SuppressWarnings("deprecation") // Suprime o aviso de uso de método deprecated
    // Os warnings não param a compilação, mas é uma boa prática evitá-los
    public void testeMover(){
        mover(); // Chama o método deprecated
    }
    
}
