package secao23;

public class ArmazenamentoTextos implements Armazenamento<String> {
    
    public String texto;

    @Override
    public void salvar(String item) {
        this.texto = item;
    }

    @Override
    public String recuperar() {
        return texto;
    }

    
}
