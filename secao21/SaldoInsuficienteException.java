package secao21;

// Temos de usar 'extends exception'!
// Toda classe que herda de exception tem que enviar
// a mensagem obrigatóriamente! getMessage()
public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}
