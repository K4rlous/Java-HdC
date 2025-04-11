package secao20.Avançando;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void dizerOla(){
        System.out.println("Olá, mundo!");
    }
}
