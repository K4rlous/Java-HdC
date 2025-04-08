package secao20;

public class POO {
    public static void main(String[] args) {
        
        // 1 - Object Composition (Composição de objetos)
        Motor motor1 = new Motor("V8", 450);

        // Note que usamos o motor criado acima para criar o carro abaixo!
        Carro carro1 = new Carro("Ford", "Mustang", motor1);

        carro1.exibirInfo();
        // Carro com marca: Ford, Modelo: Mustang <- ORIUNDO DA CLASSE CARRO
        // Motor: V8, Potência: 450 cavalos <- ORIUNDO DA CLASSE MOTOR

        // Encadeamento de objetos, só é possível porque 'motor' é um atributo publico na classe 'Carro'! (não seria possivel sua execução se fosse 'private')
        carro1.motor.exibirInfo(); // Motor: V8, Potência: 450 cavalos

        // 2 - Herança
        Cachorro bethooven = new Cachorro("Bethooven");

        // Método da classe pai 'animal'
        bethooven.emitirSom(); // Bethooven está emitindo som 

        // Método da subclasse 'cachorro'
        bethooven.latir(); // Bethooven está latindo!

        Animal leao = new Animal("Gato horrivelmente grande");
        leao.emitirSom(); // Gato horrivelmente grande está emitindo som
        // leao.latir(); <- ERRO, leao não é um objeto 'cachorro' então não pode latir!

        // 3 - A classe Object
        Pessoa carlos = new Pessoa("Carlos", 24);
        Pessoa fulano = new Pessoa("Fulano", 20);

        // Hash mostrando o alocamento da classe na memória
        System.out.println(carlos.toString()); // secao20.Pessoa@41629346

        // Comparação direta
        System.out.println(carlos.equals(fulano)); // false

        // Retornar um valor hash pro objeto
        System.out.println(carlos.hashCode()); // 1096979270

        // Fizemos a sobrescrita do método toString na classe 'Pessoa'
        System.out.println(carlos.toString()); // Nome: Carlos, Idade: 24

        // 4 - Override ou Sobrescrita
        // Cada objeto possui uma versão de calcularArea()
        // Porém todas retornam o double obrigatório que 
        // é oriundo da classe pai 'Forma'!
        Quadrado q1 = new Quadrado(4);
        Circulo c1 = new Circulo(3.2);

        System.out.println(q1.calcularArea()); // 16.0
        System.out.println(c1.calcularArea()); // 32.169908772759484
    }
}
