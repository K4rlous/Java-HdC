package secao23;
// Note que aqui omitimos o implements e colocamos um & em seu lugar!
public class CriaturaGenerica<T extends Animal & Nadador & Voador>{
    
    private T criatura;

    public CriaturaGenerica(T criatura){
        this.criatura = criatura;
    }

    public void usarHabilidades(){
        criatura.mover();
        criatura.voar();
        criatura.nadar();
    }
}
