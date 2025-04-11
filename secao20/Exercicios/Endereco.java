package secao20.Exercicios;

public class Endereco {
    private String rua;
    private int numero;
    private String cidade;

    public Endereco(String rua, String cidade, int numero) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
    }

    public String exibirInfo(){
        return "Rua: " + rua + ", Cidade: " + cidade + ", Número: " + numero;
    }
}
