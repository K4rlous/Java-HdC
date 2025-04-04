package secao17;

public class LivroBiblioteca {
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        if(titulo != null && !titulo.isEmpty()){
            this.titulo = titulo;
        } else {
            System.out.println("Título inválido!");
        }
    }

    public boolean verificarDisponibilidade(){
        return disponivel;
    }

    public void pegarEmprestado(){
        if(disponivel){
            disponivel = false;
            System.out.println("Livro: " + titulo + ", pego com sucesso!");
        } else {
            System.out.println("Livro não disponível");
        }
    }

    public void devolver(){
        if(!disponivel){
            disponivel = true;
            System.out.println("Livro: " + titulo + ", devolvido com sucesso!");
        } else {
            System.out.println("Livro já está disponível");
        }
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

   
}
