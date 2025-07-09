package secao25;

import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
        
        // 1 - Quantificadores em expressões regulares (Regex)
        String regex = "a+"; // O quantificador '+' indica que o caractere 'a' deve aparecer uma ou mais vezes
        String texto = "b aaab aa ba";

        Pattern pattern = Pattern.compile(regex); // Compila a expressão regular
        Matcher matcher = pattern.matcher(texto); // Cria um objeto Matcher para buscar no texto

        // Encontrar todas as ocorrências
        System.out.println("Ocorrências de a+ no texto:");
        while (matcher.find()) {
            System.out.println("'" + matcher.group() + "'"); 
        }

        // 2 - Âncoras e fronteiras
        // O caractere '^' indica o início da string e '$' indica o final da string
        regex = "^c"; // A string deve começar com 'c'
        texto = "casa";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("\nOcorrências de ^c no texto:");
        while (matcher.find()) {
            System.out.println("'" + matcher.group() + "'"); 
        }

        regex = "c$"; // A string deve terminar com 'c'
        texto = "casa";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);
        System.out.println("\nOcorrências de c$ no texto:");
        while (matcher.find()) {
            System.out.println("'" + matcher.group() + "'"); 
        }

        // Fronteiras de palavras com b
        regex = "\\bpalavra\\b"; // A string deve conter 'palavra' como uma palavra isolada
        texto = "Esta é uma palavra isolada, mas não é uma palavraisolada.";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);
        System.out.println("\nOcorrências de \\bpalavra\\b no texto:");
        while (matcher.find()) {
            System.out.println("'" + matcher.group() + "'"); 
        }

        // Fronteiras de palavras com B
        regex = "\\Bpalavra\\B"; // A string não deve conter 'palavra' como uma palavra isolada
        texto = "Esta é uma palavra isolada, mas não é uma palavraisolada.";
        pattern = Pattern.compile(regex);   
        matcher = pattern.matcher(texto);
        System.out.println("\nOcorrências de \\Bpalavra\\B no texto:");
        while (matcher.find()) {
            System.out.println("'" + matcher.group() + "'"); 
        }

        // 3 - Grupos e capturas
        regex = "(\\d{2})-(\\d{2})-(\\d{4})"; // Captura datas no formato dd-mm-aaaa
        texto = "A data de hoje é 09-07-2025 e a data de ontem é 08-07-2025.";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);
        System.out.println("\nDatas encontradas no texto:");
        while (matcher.find()) {
            System.out.println("Dia: '" + matcher.group(1) + "'");
            System.out.println("Mês: '" + matcher.group(2) + "'");
            System.out.println("Ano: '" + matcher.group(3) + "'");
            System.out.println("Todos os grupos: '" + matcher.group(0) + "'"); // O grupo 0 é a correspondência completa
            // Ao contrário dos arrays, os grupos são numerados a partir de 1
        }

        // Backreferences
        String textoSubstituido = texto.replaceAll(regex, "$3-$2-$1"); // Inverte a data para o formato aaaa-mm-dd
        System.out.println("\nTexto com datas invertidas:");
        System.out.println(textoSubstituido);
    }
}
 