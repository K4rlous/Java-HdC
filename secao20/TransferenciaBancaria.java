package secao20;

// Mais uma vez, usamos 'implements' ao usar interfaces!
public class TransferenciaBancaria implements Pagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + ", via transferência bancária.");
    }
    
}
