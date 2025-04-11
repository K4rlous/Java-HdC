package secao20;

interface Calculadora {
    
    int somar(int a, int b);

    // Pode ser utilizado sem implementação
    default int multiplicar(int a, int b){
        return a * b;
    }

}
