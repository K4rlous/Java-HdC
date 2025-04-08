package secao19_CadastroAlunos;

import java.util.Scanner;

public class Aluno {
    
    
    private String nome;
    private String matricula;
    private double[] notas;
    
    public Aluno(String nome, String matricula, int numeroDeNotas) {
        this.nome = nome;
        this.matricula = matricula;
        // Criamos um array com base no número de notas que iremos receber 
        this.notas = new double[numeroDeNotas];
    }
    
    // Passando Scanner como argumento
    public void adicionarNotas(Scanner scanner){
        System.out.println("Digite as notas do aluno: " + nome + ": ");
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
    }

    public double calcularMedia(){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        // Retorna a soma das notas dividida pela quantidade de notas
        return soma / notas.length;
    }

    // Critério de sucesso do aluno
    public void exibirResultado(){
        double media = calcularMedia();

        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média das notas: " + media);
        if(media >= 7.0){
            System.out.println("Aluno APROVADO");
        } else {
            System.out.println("Aluno REPROVADO");
        }

    }

    

}
