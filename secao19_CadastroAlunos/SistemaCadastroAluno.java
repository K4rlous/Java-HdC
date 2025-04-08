package secao19_CadastroAlunos;

import java.util.Scanner;

public class SistemaCadastroAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número de alunos a serem cadastrados
        System.out.println("Quantos alunos deseja cadastrar? ");
        int numeroDeAlunos = scanner.nextInt();

        // Criação do array de alunos
        Aluno[] alunos = new Aluno[numeroDeAlunos];

        // Loop de cadastro de alunos
        for(int i = 0; i < numeroDeAlunos; i++){
            System.out.println("Cadastro do aluno " + (i + 1) + ": ");
            
            System.out.println("Nome: ");
            String nome = scanner.next();

            System.out.println("Matrícula: ");
            String matricula = scanner.next();

            System.out.println("Quantidade de notas: ");
            int numeroDeNotas = scanner.nextInt();
            scanner.nextLine();

            Aluno aluno = new Aluno(nome, matricula, numeroDeNotas);

            // Adicionar as notas
            aluno.adicionarNotas(scanner);

            // Armazenar o aluno no array
            alunos[i] = aluno;
        }
        // Exibindo resultados
        System.out.println("Resultado dos alunos: ");
        for(Aluno aluno : alunos){
            aluno.exibirResultado();
            System.out.println();

        }
        scanner.close();

    }
}
