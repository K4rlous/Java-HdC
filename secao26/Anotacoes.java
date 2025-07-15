package secao26;

import java.lang.reflect.Field;

public class Anotacoes {
    public static void main(String[] args) {
        
        // 1 - Annotations (anotações) pré-definidas
        Cachorro cachorro = new Cachorro();
        cachorro.emititirSom(); // Chama o método sobrescrito
        cachorro.testeMover(); // Chama o método deprecated, mas suprimido o aviso
        cachorro.mover(); // Chama o método sobrescrito 

        // 2 - Annotations (anotações) personalizadas
        Exemplo exemplo = new Exemplo();

        // Anotações normalmente precisam de try-ctch para serem acessadas
       for(var metodo : exemplo.getClass().getDeclaredMethods()) { // Itera sobre os métodos da classe Exemplo
            System.out.println(metodo);
            if (metodo.isAnnotationPresent(Executar.class)) { // Verifica se o método possui a anotação @Executar
                Executar anotacao = metodo.getAnnotation(Executar.class); // Obtém a anotação @Executar do método
                for (int i = 0; i < anotacao.vezes(); i++) { // Executa o método o número de vezes especificado na anotação
                    // Imprime o nome do método e a quantidade de vezes que será executado
                    System.out.println("Executando método: " + metodo.getName() + " - " + (i + 1) + " vez(es)");
                    try { // Invoca o método anotado
                        metodo.invoke(exemplo); // Invoca o método anotado
                    } catch (Exception e) {
                        e.printStackTrace();
                        // Tudo isso para execucar o método mostrarMensagem 3 vezes :O
                    }
                }
            }
        }

        // 3 - Annotations (anotações) de validação de campos
        Usuario usuario = new Usuario("carlos", "carlosteste@gmail.com");
        validarCampos(usuario); // Chama o método para validar os campos do usuário
    }

    // Método para validar os campos do usuário
    public static void validarCampos(Object objeto) throws IllegalArgumentException {
        // Temos de pegar a classe, pegar os campos e verificar se eles possuem a anotação @NotEmpty
        Class<?> classe = objeto.getClass(); // Obtém a classe do objeto
        for(Field campo : classe.getDeclaredFields()) {
            if (campo.isAnnotationPresent(NotEmpty.class)) { // Verifica se o campo possui a anotação @NotEmpty
                NotEmpty anotacao = campo.getAnnotation(NotEmpty.class); // Obtém a anotação @NotEmpty do campo
                campo.setAccessible(true); // Torna o campo acessível, mesmo que seja privado
                try {
                    String valor = (String) campo.get(objeto); // Obtém o valor do campo do objeto
                    if (valor == null || valor.trim().isEmpty()) { // Verifica se o valor é nulo ou vazio
                        throw new IllegalArgumentException(anotacao.message()); // Lança exceção com a mensagem da anotação
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace(); // Trata exceção caso não consiga acessar o campo
                }
            }
        }

        // 4 - Annotations (anotações) de log com processador
        Servico servico = new Servico();
        try {
            LogProcessor.processarLog(servico); // Processa o log dos métodos anotados com @Log
            servico.executarTarefa(); // Executa o método anotado com @Log
            servico.processarDados(); // Executa outro método anotado com @Log
        } catch (Exception e) {
            e.printStackTrace(); // Trata exceção caso ocorra algum erro no processamento do log
        }
    }
 
}
