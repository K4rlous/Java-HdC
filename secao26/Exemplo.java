package secao26;

public class Exemplo {
    
    @Executar(vezes = 3) // Anotação personalizada aplicada ao método
    public void mostrarMensagem(){
        System.out.println("Executando o método mostrarMensagem");
    }
}
