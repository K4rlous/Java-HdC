package secao20;

public class Gerente extends Funcionario {
    private double bonusAdicional;

    public Gerente(String nome, double salario, double bonusAdicional) {
        super(nome, salario);
        this.bonusAdicional = bonusAdicional;
    }

    // Como o bonûs do gerente é maior, vamos dar um Override na função já criada!
    // Ela retorna a função de calculo de bonus criada em funcionário e 
    // soma ela com o bonus adicional presente aqui na classe
    @Override
    public double calcularBonus(){
        return super.calcularBonus() + bonusAdicional;
    }

    // Podemos retornar quaisquer funções da classe pai
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Bonus adicional de: " + bonusAdicional);
    }
    
}
