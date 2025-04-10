package secao20;

// Declaramos ela como 'interface'
interface Pagamento {
    
    // Nela temos métodos abstratos e default

    // Métodos abstratos - OBRIGATÓRIOS PARA IMPLEMENTAR
    void processarPagamento(double valor);

    // Métodos default - IMPLEMENTAÇÃO OPCIONAL!
    default void exibirRecibo(double valor){
        System.out.println("Recibo do pagamento com valor de R$" + valor);
    }
}
