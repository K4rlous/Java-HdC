package secao17;

public class Funcionario {
    
    public String nome;
    protected double salario;
    private String senha;

    // O constructor pode fazer as atribuições independentemente da visibilidade
    public Funcionario(String nome, double salario, String senha) {
        this.nome = nome;
        this.salario = salario;
        this.senha = senha;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome + ", Salário: " + salario + ", Senha: " + senha);
    }

    // Métodos protegidos funcionam como as propriedades protegidas
    protected void aumentarSalario(double porcentagem){
        this.salario += ((this.salario * porcentagem) / 100);
        System.out.println("O salário agora é de: " + salario);
    }

    private boolean verificarSenha(String tentativaSenha){
        // Vai verificar se a senha do objeto é igual a tentativaSenha
        return this.senha.equals((tentativaSenha));
    }
    
    public boolean autenticar(String tentativaSenha){
        // LÓGICA E BLABLABLABLA
        return verificarSenha(tentativaSenha);
    }
}


