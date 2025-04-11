package secao20.Avançando;

// Importação para Reflection API

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class POO2 {
    public static void main(String[] args) {
        
        // 1 - Classes com Final
        ContaBancaria conta = new ContaBancaria(500);
        System.out.println("Saldo: " + conta.getSaldo());

        // 2 - Reflection API
        // Envelopamos ele num try-catch para ele retornar o erro caso haja algum
        // Usamos <?> Porque não sabemos o tipo de classe!
        try {
            Class<?> classePessoa = Class.forName("secao20.Avançando.Pessoa");
            // No construtor passamos o tipo de dados que temos nos parâmetros

            Constructor<?> construtor = classePessoa.getConstructor(String.class, int.class);

            // Aqui instanciamos o objeto pessoa com os parâmetros 'joão' e '25'
            Object pessoa = construtor.newInstance("João", 25);

            // Aqui atribuimos o método 'dizerOla' em uma variável
            Method metodoDizerOla = classePessoa.getMethod("dizerOla");

            // Aqui chamamos o método usando o objeto 'pessoa' que criamos antes!
            metodoDizerOla.invoke(pessoa);

            // Podemos pegar campos também (campo nome)
            Field campoNome = classePessoa.getDeclaredField("nome");

            // E mudar sua acessibilidade também!
            campoNome.setAccessible(true);

            // E seus dados também, aqui mudamos de 'João' para 'Maria'
            campoNome.set(pessoa, "Maria");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
