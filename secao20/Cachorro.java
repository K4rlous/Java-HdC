package secao20;

// Usamos extends para definir qual é a classe pai!
public class Cachorro extends Animal {
    // Não precisamos definir suas propriedades, pois suas características
    // São obrigatóriamente herdadas da classe pai, podemos até inserir novas
    // características, mas todas as herdadas devem ter 'super' no construtor!
    public Cachorro(String nome){
        // Referência ao nome da classe Animal!
        super(nome);
    }

    public void latir(){
        System.out.println(nome + " está latindo!");
    }
}
