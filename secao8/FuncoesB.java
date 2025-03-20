package secao8;

public class FuncoesB {

    // Escopo global
    // Static permite que o valor seja utilizado independente da classe ter sido instanciada ou não!
    static int globalVar = 20;

    public static void main(String[] args) {
        
        // 5 - Funções com Condicionais
        String r1 = verificarAcesso(19, true, true);
        System.out.println(r1);

        String r2 = verificarAcesso(25,false, true);
        System.out.println(r2);

        // 6 - Funções com Switch

        System.out.println(obterDiaDaSemana(5));
        System.out.println(obterDiaDaSemana(3));
        System.out.println(obterDiaDaSemana(1));
        System.out.println(obterDiaDaSemana(10));

        // 7 - System.exit

        verificarAutenticacao("admin", "SenhaSegura");

        // Oi não será executado se os dados estiverem incorretos, pois a função irá retornar o System.exit(1)
        System.out.println("Oi");

        // 8 - Documentação de Funções

        System.out.println(calcularMedia(5, 6, 7));

        // 9 - Escopos

        // Escopo local
        int localVar = 10;

        if (true) {
            System.out.println(localVar);
        }

        // Ainda podemos manipular a variável global!
        System.out.println(globalVar);

        escopoLocal();

        // Não podemos acessar essa variável, pois ela está no escopo da função que criamos!
        // System.out.println(testeFuncao); <- ERRO

    }

    public static String verificarAcesso(
        int idade, 
        boolean temCarteira, 
        boolean temHistoricoNegativo){
            
            // Note o ! para se referir ao estado negativo do boolean no if!
            if(idade >= 18 && temCarteira && !temHistoricoNegativo){
                return "Acesso permitido, critérios atendidos";
            } else if (idade >= 18 && temCarteira && temHistoricoNegativo) {
                return "Acesso negado, histórico negativo detectado!";
            } else {
                return "Acesso negado, critérios não atendidos";
            }
    }

    public static String obterDiaDaSemana (int dia){
        switch (dia) {
            case 1 -> {
                return "Segunda-feira";
            }
            case 2 -> {
                return "Terça-feira";
            }
            case 3 -> {
                return "Quarta-feira";
            }
            case 4 -> {
                return "Quinta-feira";
            }
            case 5 -> {
                return "Sexta-feira";
            }
            case 6 -> {
                return "Sábado";
            }
            case 7 -> {
                return "Domingo";
            }
            default -> {
                return "Número Inválido!";
        }
    }
}

    public static void verificarAutenticacao(String usuario, String senha){
        // Se usuário for diferente de 'admin' e senha de 'SenhaSegura'
        if (!usuario.equals("admin") && !senha.equals("SenhaSegura")) {
            System.out.println("Autenticação falhou");
            System.exit(1);
        } else {
            System.out.println("Autenticação bem sucedida");
        }
    }

    /**
     *  Calcula a média de três números inteiros
     * 
     * @param num1 O primeiro número/nota a ser enviado
     * @param num2 O segundo número/nota a ser enviado
     * @param num3 O terceiro número/nota a ser enviado
     * @return A média dos três números
     */
    public static double calcularMedia(int num1, int num2, int num3){
        return (num1 + num2 + num3) / 3;
    }

    public static int escopoLocal() {
        // As variáveis globais também podem ser utilizadas dentro de funções!
        System.out.println(globalVar);
        // Entretanto as variáveis locais não podem ser acessadas!
        // System.out.println(localVar); <- ERRO
        // Se passassemos a variável local como parâmetro para a função, tal como: escopoLocal(localVar) poderiamos acessa-la!

        int testeFuncao = 1;
        return testeFuncao;
    }


}


