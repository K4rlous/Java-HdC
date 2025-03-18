package secao8;

public class FuncoesB {
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
}


