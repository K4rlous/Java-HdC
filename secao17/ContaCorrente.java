package secao17;

public class ContaCorrente {
    private String titular;
    private double saldo;
    private double limiteSaque;

    public ContaCorrente(String titular, double saldo, double limiteSaque){
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public void exibirSaldo(){
        System.out.println("Titular: " + titular + ", Saldo: " + saldo);
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Valor depositado com sucesso, Saldo atual: " + saldo);
        } else {
            System.out.println("Valor do depósito inválido!");
        }
    }

    public void sacar(double valor){
        if(valor <= limiteSaque && valor <= saldo){
            saldo -= valor;
            System.out.println("Valor sacado com sucesso, Saldo atual: " + saldo);
        } else if (valor > limiteSaque) {
            System.out.println("O valor inserido supera o limite de saque!");
        } else {
            System.out.println("Você não possui saldo o suficiente!");
        }
    }
}
