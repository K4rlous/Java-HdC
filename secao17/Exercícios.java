package secao17;

public class Exercícios {
    public static void main(String[] args) {

        // Exercício 01
        Celular meuCelular = new Celular();
        meuCelular.marca = "Samsung";
        meuCelular.modelo = "Pocket";

        meuCelular.ligar(); // O celular Pocket está ligado!
        meuCelular.desligar(); // O celular Pocket está desligado!
        meuCelular.usar(50); // O celular foi usado, bateria em: 50%
        meuCelular.usar(50); // O celular foi usado, bateria em: 0%
        meuCelular.usar(50); // Bateria insuficiente
        

      
        
        
    }
}
