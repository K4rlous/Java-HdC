package secao20;

public class Carro {
    private String marca;
    private String modelo;
    // Usando a classe motor, Motor = classe, motor = nome do atributo
    public Motor motor;

    public Carro(String marca, String modelo, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        // Propriedade de object composition
        this.motor = motor;
    }

    public void exibirInfo(){
        System.out.println("Carro com marca: " + marca + ", Modelo: " + modelo);
        // Vamos usar o método exibirInfo() de motor para exibir os dados dele
        motor.exibirInfo();
    }

}
