package secao23;
// Note o uso de <T> para definir a interface como genérica!
public interface Armazenamento<T> {
    
    void salvar(T item);
    T recuperar();
}
