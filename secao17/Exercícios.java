package secao17;

public class Exercícios {
    public static void main(String[] args) {

        // Exercício 01
        Celular meuCelular = new Celular();
        meuCelular.marca = "Samsung";
        meuCelular.modelo = "Pocket";

        meuCelular.ligar(); // O celular Pocket está ligado!
        meuCelular.desligar(); // O celular Pocket está desligado!
        meuCelular.usar(50); // O celular foi usado, bateria em: 50%
        meuCelular.usar(50); // O celular foi usado, bateria em: 0%
        meuCelular.usar(50); // Bateria insuficiente
        

        // Exercício 02
        Aluno aluno = new Aluno("Fulano", 88775, 80);
        Aluno aluno2 = new Aluno("Beltrano", 87456, 100);

        System.out.println(aluno.getNome()); // Fulano
        System.out.println(aluno2.getNome()); // Beltrano

        System.out.println(aluno.getNotaFinal()); // 80.0
        System.out.println(aluno2.getNotaFinal()); // 100.0

        aluno.setNotafinal(100);

        aluno.exibirInfo(); // Aluno Fulano, Matrícula: 88775, Nota Final: 100.0
        aluno2.exibirInfo(); // Aluno Beltrano, Matrícula: 87456, Nota Final: 100.0

       // Exercício 03
        ContaCorrente conta = new ContaCorrente("Ana", 100, 200);
        conta.exibirSaldo(); // Titular: Ana, Saldo: 100.0
        conta.depositar(140); // Valor depositado com sucesso, Saldo atual: 240.0
        conta.depositar(0); // Valor do depósito inválido
        conta.exibirSaldo(); // Titular: Ana, Saldo: 240.0

        conta.sacar(500); // O valor inserido supera o limite de saque!
        conta.sacar(100); // Valor sacado com sucesso, Saldo atual: 140.0
        conta.exibirSaldo(); // Titular: Ana, Saldo: 140.0
        conta.sacar(200); // Você não possui saldo o suficiente!
        
        // Exercício 04
        ProdutoEletronico produto = new ProdutoEletronico("Bateria", 200, 12);
        produto.aplicarDesconto(40); // Desconto aplicado, o preço agora é: 120.0
        produto.exibirInfo(); // Produto: Bateria, Preço: 120.0, Garantia (em meses): 12

        // Exercício 05
       LivroBiblioteca livro = new LivroBiblioteca();
       livro.setTitulo("A busca onírica por Kadath");
       livro.devolver(); // Livro já está disponível
       livro.pegarEmprestado(); // Livro: A busca onírica por Kadath, pego com sucesso!
       livro.pegarEmprestado(); // Livro não disponível
       livro.devolver(); // Livro: A busca onírica por Kadath, devolvido com sucesso!


        
    }
}
