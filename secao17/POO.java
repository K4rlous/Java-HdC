package secao17;

public class POO {
    // Como vamos executar esse arquivo, precisamos do método MAIN
    public static void main(String[] args) {
        // 1 - Criar classe
    // Criação de Carro.java - FEITO

    // 2 - Instanciar a classe
    // NomeClasse nomeObjeto = new nomeClasse()
    Carro fusca = new Carro();
    
    // Atribuição de propriedades, não definimos que as propriedades são obrigatórias
    // neste caso definimos ela por vontade própria!
    // NOMEOBJETO.PROP e NOMEOBJETO.METODO()
    fusca.marca = "VW";
    fusca.modelo = "Fusca";
    fusca.ano = 1964;

    // Chamando os métodos
    fusca.acelerar();
    fusca.exibirInfo();

    Carro carro2 = new Carro();
    carro2.marca = "FIAT";

    
    // Os valores de propriedades podem ser iguais para diferentes objetos!
    carro2.modelo = "Fusca";
    carro2.acelerar();
    // Se não passarmos as propriedades, serão impressos os valores iniciais 
    // de cada tipo de dado, sendo 0 para tipos numéricos e null para tipos de String
    carro2.exibirInfo();

    // 3 - Métodos
    // Dessa forma alteramos a propriedade do objeto, sendo eles booleans, ints, etc..
    
    // Primeiro precisamos ligar o motor para acelerar
    fusca.aumentarVelocidade(10.0);
    // Tornamos motor ligado 'true'
    fusca.ligarMotor();
    System.out.println(fusca.motorLigado); // true
    // Agora podemos acelerar
    fusca.aumentarVelocidade(20);
    fusca.aumentarVelocidade(50);
    fusca.aumentarVelocidade(30);
    // A velocidade é incrementada 

    // 4 - Criando propriedades
    Pessoa alguem = new Pessoa();

    // Não conseguimos declarar a propriedade de 'alguem' pois o atributo nome é PRIVADO (PROTEGIDO)
    // ERRO -> alguem.nome = "João";
    // Essa atribuição deve ser feito via método, isso é, deve haver um método nessa classe para definir o nome do objeto 'pessoa', os famosos getters e setters
    
    // Usando setter para definir o nome do objeto 'Pessoa'
    alguem.setNome("João");

    // Usando getter para exibir o nome do objeto 'Pessoa'
    System.out.println("O nome de alguem é: " + alguem.getNome());

    // Mesma lógica pra idade!
    alguem.setIdade(24);
    System.out.println("Essa pessoa tem: " + alguem.getIdade() + " anos!");

    // 5 - Setters

    ContaBancaria ContaDaAna = new ContaBancaria();
    ContaDaAna.setTitular(null); // Nome do titular inválido!
    ContaDaAna.setTitular(""); // Nome do titular inválido!
    ContaDaAna.setTitular("Ana"); // Execução correta

    ContaDaAna.setSaldo(-11); // O valor precisa ser positivo!
    ContaDaAna.setSaldo(40); // Execução correta

    ContaDaAna.mostrarDados(); // Titular: Ana / Saldo: 40.0

    System.out.println(ContaDaAna.getTitular()); // Ana
    System.out.println(ContaDaAna.getSaldo()); // R$ 40.0

    // 6 - Lógica em Getters e Setters

    Produto Camisa = new Produto();
    Camisa.setNome("a"); // O nome enviado não atende aos critérios!
    Camisa.setNome("Camisa Polo"); // Execução correta
    System.out.println(Camisa.getNome()); // CAMISA POLO
    Camisa.setPreco(-1); // O produto não pode ter um preço negativo!
    Camisa.setPreco(20.9999); // Execução correta
    System.out.println(Camisa.getPreco()); // R$21,00

    // 7 - Método dentro de método
    System.out.println(Camisa.getProdutoInfo()); // Nome: CAMISA POLO , Preço: R$21,00
    Camisa.aplicarDesconto(10);
    // Desconto de 10.0% aplicado!
    // Nome: CAMISA POLO , Preço: R$18,90

    // 8 - Construtores
    Livro meuLivro = new Livro("A busca onírica por Kadath", "H P Lovecraft", 19.99);
    Livro meuLivro2 = new Livro();
    // SEM O CONSTRUTOR  
    meuLivro2.exibirInfo(); // Título: Título teste, Autor: Autor, Preço: 12.99
    // COM O CONSTRUTOR
    meuLivro.exibirInfo(); // Título: A busca onírica por Kadath, Autor: H P Lovecraft, Preço: 19.99
}}
    
