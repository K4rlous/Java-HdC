package secao17;

public class Pessoa {

    // Declaramos a visibilidade como 'private' para que o 
    // método da própria classe modifique os dados!
    private String nome;
    private int idade;

    // Setter para definir o nome do objeto
    public void setNome(String nome){
        //this.nomeDaClasse = nomeDoArgumento
        // THIS -> OBJETO
        this.nome = nome;
    }

    // Getter para retornar o nome do objeto (que por sua vez é privado)
    // Note que ele retorna uma string sendo o nome do objeto 'Pessoa'
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }


}
