package secao20;

interface Imprimivel {
    void imprimir();
}

interface Salvavel  {
void salvar();

// Método default de qualquer interface é opcional na implementação!
default void instrucaoParaSalvar(){
    System.out.println("Instruções!");
}

}


public class Documento implements Imprimivel, Salvavel {
    private String documento;

    public Documento(String documento) {
        this.documento = documento;
    }

    @Override
    public void imprimir(){
        System.out.println("Imprimindo o documento");
    }

    @Override
    public void salvar(){
        System.out.println("Salvando o documento");
    }
}
