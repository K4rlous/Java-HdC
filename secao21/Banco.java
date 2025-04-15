package secao21;

public class Banco {
    private double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor > saldo){
            // Exception
            throw new SaldoInsuficienteException("Saldo insuficiente para sacar " + valor);
        }
        saldo -= valor;
        System.out.println("Saque de: " + valor + ", realizado com sucesso, Saldo atual: " + saldo);
    }
}
