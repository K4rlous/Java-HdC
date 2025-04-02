package secao17;

public class Produto {

    private String nome;
    private double preco;

    public void setNome(String nome){
        // Nome diferente de null, não estar vazio, e ter comprimento maior que 3
        if(nome != null & !nome.isEmpty() && nome.length() > 3){
            this.nome = nome;
        } else {
            System.out.println("O nome enviado não atende aos critérios!");
        }
    }

    public String getNome(){
        // Retorna o nome do produto em maíusculas!
        return nome.toUpperCase();
    }

    public void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        } else {
            System.out.println("O produto não pode ter um preço negativo!");
        }
    }

    public String getPreco(){
        // Vai formatar uma string com o preço em float limitado a 2 casas decimais!
        return String.format("R$%.2f", preco);
    }

}
