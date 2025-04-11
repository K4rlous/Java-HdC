package secao20.Exercicios;

public class Carro extends Veiculo{
    
    public Carro(String nome) {
        super(nome);
    }
    
    @Override
    public void acelerar(){
        System.out.println("O carro " + nome + ", está acelerando!");
    }
}
