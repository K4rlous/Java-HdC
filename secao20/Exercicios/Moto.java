package secao20.Exercicios;

public class Moto extends Veiculo{
    
    public Moto(String nome) {
        super(nome);
    }
    
    @Override
    public void acelerar(){
        System.out.println("A moto " + nome + ", está acelerando!");
    }
}
