package secao20;

public class Animal {
    // Usamos protect porque poderemos alterar esse valor através das subclasses 
    // (classes geradas usando essa como 'pai')
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println(nome + " está emitindo som");
    }


}
