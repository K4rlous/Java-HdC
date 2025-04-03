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

    public String getProdutoInfo(){
        // Note que usamos os métodos getters e setters que fizemos
        return "Nome: " + this.getNome() + " , Preço: " + this.getPreco();
    }

    public void aplicarDesconto(double porcentagem){
        if(porcentagem > 0 && porcentagem <= 100){
            // Usamos o método abaixo para saber quantos reais equivalem o desconto dado. e subtraimos esse valor do preço do objeto!
            double desconto = calcularDesconto(porcentagem);
            double precoFinal = this.preco - desconto;
            this.setPreco(precoFinal);
            System.out.println("Desconto de " + porcentagem + "% aplicado!");
            System.out.println(this.getProdutoInfo());
        } else {
            System.out.println("Porcentagem Inválida!");
        }
    }
    // Método privado para somente ser usado aqui na classe!
    private double calcularDesconto(double porcentagem){
        // O preço do objeto * porcentagem / por 100
        // Então se o produto custa 50 reais com desconto de 15% ele perde 7,5 reais de valor!
        return (this.preco * porcentagem) / 100;
    }

}
