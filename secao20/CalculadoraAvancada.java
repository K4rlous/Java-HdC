package secao20;

public class CalculadoraAvancada implements Calculadora{

    @Override
    public int somar(int a, int b) {
       return a + b;
    }

    // Se quisermos podemos sobrescrever métodos DEFAULT também!
    @Override
    public int multiplicar(int a, int b){
        System.out.println("pipipipopopo");
        return a * b;
    }
    
}
