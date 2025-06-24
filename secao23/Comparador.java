package secao23;
// Dessa forma T só poderá ser tipos númericos!
public class Comparador<T extends Number> {
    
    public T obterMaior(T numero1, T numero2){ 
        // O Double é o tipo numero mais bem 'aceito', usando esse simples 'parse' resolve o problema em tempo de compilação que a linha geraria, note que esse parse não substitui a declaração de tipo na inicialização do método!
        if(numero1.doubleValue() > numero2.doubleValue()){
            return numero1;
        } else {
            return numero2;
        }
    }
}
