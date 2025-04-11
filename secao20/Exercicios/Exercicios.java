package secao20.Exercicios;

public class Exercicios {
    public static void main(String[] args) {
        
        // Exercício 01
        Endereco adress = new Endereco("In time", "Somewhere", 1700);
        Pessoa2 alguem = new Pessoa2("Fulano", 22, adress);
        alguem.exibirInfo();
        // Nome: Fulano, Idade: 22
        // Rua: In time, Cidade: Somewhere, Número: 
        
        // Exercício 02
        Veiculo v01 = new Veiculo("Algo genérico!");
        v01.acelerar(); // O veículo Algo genérico!, está acelerando!   
        Veiculo v02 = new Moto("PCX");
        v02.acelerar(); // A moto PCX, está acelerando!
        Veiculo v03 = new Carro("Kwid");
        v03.acelerar(); // O carro Kwid, está acelerando!

        // Exercício 03
        Cachorro fureebis = new Cachorro("Fureebis", "auau", "Caramelo");
        fureebis.exibirDetalhes(); // Nome do animal: Fureebis, Som do animal: auau, Raça do Cachorro: Caramelo

        // Exercício 04
        FuncionarioTempoIntegral fti = new FuncionarioTempoIntegral("Fulano", 1000);
        FuncionarioMeioPeriodo fmp = new FuncionarioMeioPeriodo("Beltrano", 50, 5);

        System.out.println("Salário Fulano: " + fti.calcularSalario()); // Salário Fulano: 1000.0
        System.out.println("Salário Beltrano: " + fmp.calcularSalario()); // Salário Beltrano: 250.0

        fti.adicionarBeneficio("Trabalhar até morrer!");
        // Benefício adicionado para tempo integral: Trabalhar até morrer!
        fmp.adicionarBeneficio("Benefício de não ter benefício kkkk");
        // Benefício adicionado para meio-período: Benefício de não ter benefício kkkk

        // Exercício 05
        Pilotavel meuHidroAviao = new Hidroaviao();
        Navegavel meuBarco = new Barco();
        Pilotavel meuAviao = new Aviao();

        meuAviao.pilotar(); // Pilotando o avião!
        meuBarco.navegar(); // Navegando com o barco!
        meuHidroAviao.pilotar(); // Pilotando o hidroavião!

        operarVeiculo(meuAviao); // Este veículo é pilotável
        operarVeiculo(meuHidroAviao); // Este veículo é pilotável e Esse veículo é navegável
        operarVeiculo(meuBarco); // Esse veículo é navegável
    }
    public static  void operarVeiculo(Object veiculo){
        // Usamos instanceof pra saber se ele faz parte de um determinado objeto!
        if(veiculo instanceof Pilotavel){
            System.out.println("Este veículo é pilotável");
        }
        if (veiculo instanceof  Navegavel){
            System.out.println("Esse veículo é navegável");
        }
    }
}
