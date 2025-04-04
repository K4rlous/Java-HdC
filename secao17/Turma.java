package secao17;

import java.util.Arrays;

public class Turma {

    private String[] alunos;

    public Turma(String[] alunos) {
        // Aqui criamos uma copia de 'alunos' com base na quantidade de alunos, dessa forma não precisamos inserir um valor para definir a quantidade de alunos
        this.alunos = Arrays.copyOf(alunos, alunos.length);
    }

    public String[] getAlunos(){
        // Mais uma vez vamos usar apenas as cópias do array!
        return Arrays.copyOf(alunos, alunos.length);
    }

    public void setAlunos(String[] alunos){
        if(alunos.length > 0){
            this.alunos = Arrays.copyOf(alunos, alunos.length);
        }
    }
    
}
