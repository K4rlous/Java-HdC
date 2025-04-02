package secao17;

public class ContaBancaria {
    
    private String titular;
    private double saldo;

    public void setTitular(String titular){

        // Lógica para validar ou manipular
        // Se titular é diferente de 'null' e NÃO está vazio...
        if(titular != null && !titular.isEmpty()){
            this.titular = titular;
        } else {
            System.out.println("Nome do titular inválido!");
        }
    }

    public void setSaldo(double saldo){
        // O saldo não pode ser negativo!
        if(saldo >= 0){
            this.saldo = saldo;
        } else {
            System.out.println("O valor precisa ser positivo!");
        }
    }

    public void mostrarDados(){
        System.out.println("Titular: " + titular + " / Saldo: " + saldo);
    }

    public String getTitular(){
        return titular;
    }

    // Manipulação do getter (retorno)
    public String getSaldo(){
        return "R$ " + saldo;
    }
}
