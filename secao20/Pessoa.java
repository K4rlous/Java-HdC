package secao20;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Override - Sobrescrita
    // Temos de declarar ela (veremos mais a frente!)
    // NÃO É UMA BOA PRÁTICA FAZER ISSO COM MÉTODOS DO JAVA!
    @Override
    public String toString(){
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
