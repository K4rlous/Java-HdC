package secao20.Avançando;

// O final vai impedir que ela seja herdada!
public final class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }
    
}
