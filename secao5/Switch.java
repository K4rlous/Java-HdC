package secao5;

public class Switch {
    public static void main(String[] args) {
        
        // 11 - Switch Case e Break

        // Dias da semana baseado em número
        // 1 = Domingo, 7 = Sábado

        int diaSemana = 4;

        switch(diaSemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
    }


        // 12 - Default

        int n = 10;

        switch (n) {
            case 1 -> System.out.println("É 1");
            case 2 -> System.out.println("É 2");
            case 3 -> System.out.println("É 3");
            default -> System.out.println("Valor não encontrado!");
        }

        // 13 - Switch sem break (inútil!)

        switch (1) {
            case 1:
                System.out.println("Executou 1");
            case 2:
                System.out.println("Executou 2");
            case 3:
                System.out.println("Executou 3");
            default:
                System.out.println("Executou 4");
        }
        // Todos os resultados incluindo o default são exibidos!
}
}

