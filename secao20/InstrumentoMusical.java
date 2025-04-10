package secao20;

// Definimos ela como 'Abstract class'!
abstract  class InstrumentoMusical {
    protected String nome;

    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }
    
    // Criação de métodos abstratos
    // public abstract 'retorno' 'nome do método()'

    // Abstrato: Todas as subclasses devem implementar esse metódo
    // Utilizando override!
    public abstract void tocar();

    // Concreto: Pode ser herdado
    public void exibirDetalhes(){
        System.out.println("Instrumento: " + nome);
    }
}
