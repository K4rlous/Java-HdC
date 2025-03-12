package secao5;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        // 8 - And

        int idade = 18;
        boolean cNH = true;
        boolean cnhVencida = true;
        
        System.out.println(idade >= 18 && cNH); // true
        // Tem o mesmo efeito de:
        System.out.println(idade >= 18 && cNH == true); // true

        System.err.println(idade >= 18 && cNH && cnhVencida == false); // false

        int a = 10;
        int b = 20;

        // True && True => True
        if(a > 5 && b > 10){
            System.out.println("Deu certo!");
        }

        // False && True => Curto Circuito!
        if(a > 55 && b > 10){
            System.out.println("Deu certo!");
        }

        // 9 - Or

        boolean estarChuvendo = false;
        boolean temGuardaChuva = true;

        System.out.println(estarChuvendo || temGuardaChuva); // true

        System.out.println(10 > 20 || 100 == 200); // false

        int idade2 = 5;
        boolean membro = true;

        // Precisa ter > 16 anos OU ser membro

        if (idade2 >= 16 || membro){
            System.out.println("Tudo certo");
        } else {
            System.out.println("Tudo errado");
        }

        // 10 - Not

        System.out.println(estarChuvendo); // false
        // ! inverte o booleano!
        System.out.println(!estarChuvendo); // true

        System.out.println(estarChuvendo || !temGuardaChuva); // false (ambos false!)

        // Tal como na matemática o valor entre as () será levando em consideração primeiro, então esse valor será invertido pelo ! que está fora dos colchetes!
        System.out.println(!(estarChuvendo || !temGuardaChuva)); 
        // true (inversão por fora dos () )
    }

}
