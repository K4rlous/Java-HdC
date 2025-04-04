package secao17;

public class Aluno {
    private String nome;
    private int matricula;
    private double notaFinal;

    public Aluno(String nome, int matricula, double notaFinal){
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public double getNotaFinal(){
        return notaFinal;
    }

    public void setNotafinal(double notaFinal){
        if(notaFinal >= 0 && notaFinal <= 100){
            this.notaFinal = notaFinal;
        } else {
            System.out.println("Nota inválida!");
        }
    }

    public void exibirInfo(){
        System.out.println("Aluno " + nome + ", Matrícula: " + matricula + ", Nota Final: " + notaFinal);
    }
}
