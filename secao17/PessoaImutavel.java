package secao17;

public class PessoaImutavel {

    private final String nome;
    private final int idade;

    public PessoaImutavel(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    

}
