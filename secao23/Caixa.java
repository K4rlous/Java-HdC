package secao23;
// Usamos o <T> para declarar a classe como genérica
public class Caixa<T> {
    
    // Conteudo pode ser qualquer tipo de dado!
    private T conteudo;

    // Um setter usando T
    public void adicionar(T conteudo){
        this.conteudo = conteudo;
    }

    // Um getter usando T
    public T obter(){
        return conteudo;
    }
}
