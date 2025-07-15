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

        // 4 - Avançando em pattern e matcher

        // Correspondência parcial
        regex = "\\d{3}"; // Busca por três dígitos consecutivos
        texto = "123 456 789 10 11";
        pattern = Pattern.compile(regex);   
        matcher = pattern.matcher(texto);
        System.out.println("\nOcorrências de três dígitos consecutivos no texto usando lookingAt :");
        if (matcher.lookingAt()) { // Verifica se a correspondência começa no início do texto
            System.out.println("'" + matcher.group() + "'");
        } else {
            System.out.println("Nenhuma correspondência encontrada.");
        }

        // Contando grupos com groupCount
        regex = "(\\d{3})-(\\d{3})-(\\d{3})";
        texto = "123-456-721";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);
        System.out.println("\nNúmero de grupos na expressão regular: ");
        if (matcher.matches()) {
            System.out.println("Número de grupos: " + matcher.groupCount()); // Exibe o número de grupos capturados
            System.out.println("Grupo 1: '" + matcher.group(1) + "'");
            System.out.println("Grupo 2: '" + matcher.group(2) + "'");
            System.out.println("Grupo 3: '" + matcher.group(3) + "'");
        }

        // Start e end para obter correspondências na string
        regex = "\\d{3}"; // Busca por três dígitos consecutivos
        texto = "O código é 123 e o número é 456.";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);
        System.out.println("\nPosições de correspondência de três dígitos consecutivos no texto:");
        while (matcher.find()) {
            System.out.println("Correspondência: '" + matcher.group() + "'");
            System.out.println("Início: " + matcher.start()); // Posição inicial da correspondência
            System.out.println("Fim: " + matcher.end()); // Posição final da correspondência
        } 

        // Quote para tratar caracteres especiais
        String literalRegex = Pattern.quote("1 + 1 = 2"); // Trata a string como um literal, escapando caracteres especiais
        texto = "1 + 1 = 2 é uma expressão matemática.";
        pattern = Pattern.compile(literalRegex);
        matcher = pattern.matcher(texto);
        if (matcher.find()) {
            System.out.println("\nOcorrência de expressão literal no texto: '" + matcher.group() + "'");
        } else {
            System.out.println("Nenhuma ocorrência encontrada.");
        }

        // 5 - Expressões regulares avançadas
        // lookahead positivo
        String regexLookAhead = "\\d+(?=\\$)"; // Busca por dígitos seguidos de um cifrão, mas não inclui o cifrão na correspondência
        texto = "O preço é 100$ e o desconto é 20$.";
        pattern = Pattern.compile(regexLookAhead);
        matcher = pattern.matcher(texto);
        System.out.println("\nOcorrências de dígitos seguidos de cifrão (lookahead positivo):");
        while (matcher.find()) {
            System.out.println("'" + matcher.group() + "'"); // Exibe os dígitos encontrados
        }

        // Lookbehind positivo
        String regexLookBehind = "(?<=\\$)\\d+"; // Busca por dígitos precedidos por um cifrão, mas não inclui o cifrão na correspondência
        texto = "O preço é $100 e o desconto é $20.";
        pattern = Pattern.compile(regexLookBehind);
        matcher = pattern.matcher(texto);
        System.out.println("\nOcorrências de dígitos precedidos por cifrão (lookbehind positivo):");
        while (matcher.find()) {
            System.out.println("'" + matcher.group() + "'"); // Exibe os dígitos encontrados
        }

        // Lookahead negativo
        // Encontrar palavras que não terminam com ponto final
        // [a-z] != 'é'
        // p{L} == inclui letras acentuadas, unicode no geral
        texto = "Essa é uma frase. e esta é outra";
        String regexLookAheadNegativo = "\\b[\\p{L}]+\\b(?!\\.)"; // Busca por palavras que não terminam com ponto final
        pattern = Pattern.compile(regexLookAheadNegativo);
        matcher = pattern.matcher(texto);
        System.out.println("\nOcorrências de palavras que não terminam com ponto final (lookahead negativo):");
        while (matcher.find()) {
            System.out.println("'" + matcher.group() + "'"); // Exibe as palavras encontradas
        } 

        // Lookbehind negativo
        // Encontrar palavras que não são precedidas por um # 
        String regexLookBehindNegativo = "(?<!#)\\b\\w+\\b"; // Busca por palavras que não são precedidas por um '#'
        texto = "#palavra1 palavra2 #palavra3";
        pattern = Pattern.compile(regexLookBehindNegativo);
        matcher = pattern.matcher(texto);
        System.out.println("\nOcorrências de palavras que não são precedidas por '#':");
        while (matcher.find()) {
            System.out.println("'" + matcher.group() + "'"); // Exibe as palavras encontradas
        }

        // 6 - Validação de data e horario
        String regexData = "^([0-2][0-9]|3[01])-(0[1-9]|1[0-2])-([0-9]{4})$"; // Valida datas no formato dd-mm-aaaa
        String[] datas = {
            "01-01-2020", "31-12-2020", "29-02-2020", // 5 Válidas
            "31-04-2020", "30-02-2020", "32-01-2020"  // 1 Inválidas
        };
        System.out.println("\nValidação de datas:");
        for (String data : datas) {
            if (validarRegex(regexData, data)) {
                System.out.println(data + " é uma data válida.");
            } else {
                System.out.println(data + " não é uma data válida.");
            }
        }

        // Validação de horário
        String regexHorario = "^([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$"; // Valida horários no formato HH:mm
        String[] horarios = {
            "12:30:45", "23:59:59", "00:00:00", // Válidos
            "24:00:00", "12:60:00", "12:30:61"  // Inválidos
        };
        System.out.println("\nValidação de horários:");
        for (String horario : horarios) {
            if (validarRegex(regexHorario, horario)) {
                System.out.println(horario + " é um horário válido.");
            } else {
                System.out.println(horario + " não é um horário válido.");
            }
        }

        // 7 - Flags

        // Case insensitive - ignora diferenças entre maiúsculas e minúsculas
        regex = "java";
        texto = "Java é uma linguagem de programação. JAVA é popular.";
        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // Cria o padrão com a flag CASE_INSENSITIVE
        matcher = pattern.matcher(texto);
        System.out.println("\nOcorrências de 'java' (case insensitive):");
        while (matcher.find()) {
            System.out.println("'" + matcher.group() + "'"); // Exibe as ocorrências encontradas
        }

        // Multiline - trata cada linha como uma string separada
        regex = "^\\d+"; // Busca por números no início de cada linha
        texto = "123\n456\n789\n10\n11"; // Texto com várias linhas
        pattern = Pattern.compile(regex, Pattern.MULTILINE); // Cria o padrão com a flag MULTILINE
        matcher = pattern.matcher(texto);
        System.out.println("\nOcorrências de números no início de cada linha (multiline):");
        while (matcher.find()) {
            System.out.println("'" + matcher.group() + "'"); // Exibe os números encontrados
        }
        


        
  
}
    public static boolean validarRegex(String regex, String texto) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        return matcher.matches(); // Retorna true se a string corresponder à expressão regular
    }
}