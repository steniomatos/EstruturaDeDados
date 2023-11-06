import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
TEORIA DA COMPUTAÇÃO E COMPILADORES
ATIVIDADE PRÁTICA
Prof. Carlos Augusto dos Santos Pinheiro

Atividade: Analisador Léxico para uma Linguagem de Comandos Básicos
Linguagem: C/C++, Python, Java
Tamanho máximo dos grupos: 03 (três) alunos
Prazo de entrega: 07/11/2023

Objetivo: Desenvolver um analisador léxico para reconhecer comandos simples de uma linguagem fictícia.

Linguagem de Comandos:
• PRINT: seguido de um texto entre aspas para exibir.
• ADD: seguido de dois números inteiros para adição.
• SUB: seguido de dois números inteiros para subtração.

Especificação dos Tokens:

• COMMAND: (PRINT, ADD, SUB)
• STRING: sequência de caracteres entre aspas (por simplicidade, assuma que não há aspas no texto).
• NUMBER: um número inteiro.
• WHITESPACE: espaços, que podem ser ignorados.

Exemplos de comandos válidos:

• PRINT "Hello, World!"
• ADD 5 10
• SUB 15 4

Tarefa:
Desenvolva um analisador léxico que transforme esses comandos em uma lista de tokens.

Passos:
1. Defina as expressões regulares para os tokens.
2. Implemente uma função que percorra a string de entrada e gere os tokens correspondentes.

Saída Esperada:

1. Para o comando PRINT "Hello, World!", a saída esperada é:
[('COMMAND', 'PRINT'), ('STRING', 'Hello, World!')]

2. Para o comando SUB 15 4, a saída esperada é:
[('COMMAND', 'SUB'), ('NUMBER', '15'), ('NUMBER', '4')]

3. Para o comando ADD 5 10, a saída esperada é:
[('COMMAND', 'ADD'), ('NUMBER', '5'), ('NUMBER', '10')]
*/

public class AnalisadorLexico {

    public static ArrayList<Token> analyze(String input) {
        ArrayList<Token> tokens = new ArrayList<>();

        String commandPattern = "(PRINT|ADD|SUB)";
        String stringPattern = "\"([^\"]*)\"";
        String numberPattern = "\\b\\d+\\b";
        String whitespacePattern = "\\s+";

        String combinedPattern = String.format("(%s)|(%s)|(%s)|(%s)", commandPattern, stringPattern, numberPattern, whitespacePattern);

        Pattern pattern = Pattern.compile(combinedPattern);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            if (matcher.group(1) != null) {
                tokens.add(new Token("COMMAND", matcher.group(1)));
            } else if (matcher.group(2) != null) {
                tokens.add(new Token("STRING", matcher.group(2)));
            } else if (matcher.group(3) != null) {
                tokens.add(new Token("NUMBER", matcher.group(3)));
            } else if (matcher.group(4) != null) {
                // Ignore whitespace
            }
        }

        return tokens;
    }

    public static void main(String[] args) {
        String input1 = "PRINT \"Hello, World!\"";
        String input2 = "SUB 15 4";
        String input3 = "ADD 5 10";

        System.out.println(analyze(input1));
        System.out.println(analyze(input2));
        System.out.println(analyze(input3));
    }
}

class Token {
    private String type;
    private String value;

    public Token(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", type, value);
    }
}
