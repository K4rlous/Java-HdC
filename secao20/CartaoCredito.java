package secao20;

// Ao contrário do 'extends' em herança, nas interfaces
// usamos o termo 'extends'
public class CartaoCredito implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + ", via cartão de crédito.");
    
}
}