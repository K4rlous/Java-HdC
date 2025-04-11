package secao20.Exercicios;

public class Cachorro extends Animal{
    private String raca;
    public Cachorro(String nome, String som, String raca) {
        super(nome, som);
        this.raca = raca;
    }
    
    public void exibirDetalhes(){
        System.out.println("Nome do animal: " + nome + ", Som do animal: " + som + ", Raça do Cachorro: " + raca);
    }
}
