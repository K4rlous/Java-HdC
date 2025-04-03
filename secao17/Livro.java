package secao17;

public class Livro {
    // Imagine ter que declarar os getters e setters para todas essas propriedades...
    // Agora imagine um objeto com 10 ou mais propriedades....
    private String titulo;
    private String autor;
    private double preco;
    
    // Todos os objetos começarão com estes valores básicos, até que eles sejam definidos!
     public Livro(){
         this.titulo = "Título teste";
         this.autor = "Autor";
         this.preco = 12.99;
     }

    // Ou podemos fazer assim!
    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    // Este código utiliza a sobrecarga de construtores para permitir diferentes formas de inicializar um objeto.
    // O primeiro construtor define valores padrão para os atributos, enquanto o segundo permite que 
    // os valores sejam personalizados pelo desenvolvedor ao passar argumentos específicos.
   
    public void exibirInfo(){
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Preço: " + preco);
    }
}
