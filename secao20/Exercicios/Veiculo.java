package secao20.Exercicios;

public class Veiculo {
    protected String nome;

    public Veiculo(String nome){
        this.nome = nome;
    }

    public void acelerar(){
        System.out.println("O veículo " + nome + ", está acelerando!");
    }
}
