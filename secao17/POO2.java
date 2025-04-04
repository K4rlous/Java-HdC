package secao17;

import java.util.Arrays;

public class POO2 {
    public static void main(String[] args) {
        
        // 1 - Níveis de Acesso
        Funcionario funcionario = new Funcionario("Fulano", 2000, "teste123");

        funcionario.exibirDados(); // Nome: Fulano, Salário: 2000.0, Senha: teste123

        // Podemos alterar o nome porque ele é um atributo publico!
        funcionario.nome = "Creuso";
        // Podemos alterar o salário pois estamos usado sua classe e compartilhando o pacote
        funcionario.salario = 3000;
        // Não podemos alterar a senha pois esse atributo é privado e só pode ser manipulado através de getters e setters
        // APENAS ESSE RETORNA ERRO -> funcionario.senha = "teste999";
        funcionario.exibirDados(); // Nome: Creuso, Salário: 3000.0, Senha: teste123

        // O método abaixo é protegido
        funcionario.aumentarSalario(8); // O salário agora é de: 3240.0

        // O método abaixo é privado e retorna um erro (um vez que só pode ser usado na classe em si!)
        // ERRO -> System.out.println(funcionario.verificarSenha());

        // O método abaixo é publico e irá funcionar normalmente, ele usa um outro método privado em sua lógica!
        if(funcionario.autenticar("teste123")){
            System.out.println("Funcionário entrou no sistema");
        } else {
            System.out.println("Senha incorreta!");
        }
        // Funcionário entrou no sistema

        // 2 - Classes Imutáveis
        PessoaImutavel joaquim = new PessoaImutavel("Joaquim", 23);
        System.out.println(joaquim.getNome()); // Joaquim
        System.out.println(joaquim.getIdade()); // 23

        /*
         Se tentarmos usar joaquim.nome = "Teste"; não funcionaria por causa do atributo
         ser private
         Se tentarmos usar this.nome = "Teste"; na classe 'pessoaImutavel' não funcionaria
         porque o atributo nome é declarado como final, logo não pode ser alterado, da mesma forma um setter pro nome e/ou qualquer atributo final não iria funcionar!
        */

        // 3 - Encapsulamento de Arrays
        String[] meusAlunos = {"Fulano", "Sicrano", "Beltrano"};

        // Passamos o array acima como critério para a criação do objeto Turma
        Turma novaTurma = new Turma(meusAlunos);

        // Impressão dos alunos no objeto 'novaTurma'
        System.out.println(Arrays.toString(novaTurma.getAlunos())); // [Fulano, Sicrano, Beltrano]

        // Precisamos colocar os atributos em variáveis obrigatóriamente
        String[] outrosAlunos = {"Ana", "Carlos", "João"};
        // Alteramos TODOS os alunos para os valores do array acima!
        novaTurma.setAlunos(outrosAlunos);
        System.out.println(Arrays.toString(novaTurma.getAlunos())); // [Ana, Carlos, João]


    }
}
