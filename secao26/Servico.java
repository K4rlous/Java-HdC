package secao26;

public class Servico {
    @Log
    public void executarTarefa(){
        System.out.println("Tarefa executada com sucesso!");
    }
    
    @Log
    public void processarDados(){
        System.out.println("Dados processados com sucesso!");
    }
}
