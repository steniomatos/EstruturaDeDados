import java.util.Scanner;
import java.util.Stack;

/**
 * 1.  A Startup mineira Canastra Tecnologia, é uma grande desenvolvedora de soluções embarcadas para o mercado de telecomunicações. Recentemente eles descobriram uma falha nos conversores digitais do seu produto de maior distribuição no mercado o Pumpkin toadle.
Uma parte crítica do Pumpkin toadle recebe dados numéricos decimais dos clientes via EndPoint e os converte em dados numéricos binários, para que as operações dos conversores digitais possam ser realizadas em conformidade.

Até então essa operação era realizada por uma API de terceiro do qual a Canastra Tecnologia pagava pela quantidade de requisições mensais.

Diante do problema o time de Engenharia de Sistemas da Canastra Tecnologia, propôs uma solução para interromper o uso da API do terceiro e criarem uma solução própria.

O corpo gestor da Canastra Tecnologia autorizou o desenvolvimento de uma PoC (Proof of Concept – Prova de Conceito) para validação da nova API.

O Líder de desenvolvimento do time de engenharia de sistemas, se reunião com a equipe e acordaram o desenvolvimento da seguinte PoC:

+ Etapa 1: Criar um algoritmo que dada uma entrada (via terminal) numérica decimal, converta esse número em binário.

+ Etapa 2: Para cada entrada recebida deverá ser registrado o valor de entrada (número decimal) e o valor de saída (número binário).

A PoC visa comprovar ao corpo gestor que a solução é viável, através da etapa 1 com as transformações e da etapa 2 com o log de registros das conversões sendo realizadas de maneira correta.

Obs: Sua implementação deve usar o conceito de pilha (Stack da Framework Collection) para o desenvolvimento das duas etapas acordadas pelo time de engenharia de sistemas.
 */
public class tarefa4 {
    public static void main(String[] args) {
        // Etapa 1: Converter número decimal para binário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número decimal: ");
        int numeroDecimal = scanner.nextInt();
        String numeroBinario = converterParaBinario(numeroDecimal);
        System.out.println("Número Binário: " + numeroBinario);

        // Etapa 2: Registrar o valor de entrada e o valor de saída
        registrarConversao(numeroDecimal, numeroBinario);
    }

    // Método para converter número decimal para binário usando uma pilha
    private static String converterParaBinario(int numeroDecimal) {
        Stack<Integer> pilhaBinaria = new Stack<>();

        // Convertendo para binário usando pilha
        while (numeroDecimal > 0) {
            pilhaBinaria.push(numeroDecimal % 2);
            numeroDecimal /= 2;
        }

        // Construindo a representação binária a partir da pilha
        StringBuilder binario = new StringBuilder();
        while (!pilhaBinaria.isEmpty()) {
            binario.append(pilhaBinaria.pop());
        }

        return binario.toString();
    }

    // Método para registrar a conversão
    private static void registrarConversao(int numeroDecimal, String numeroBinario) {
        System.out.println("Registro da Conversão:");
        System.out.println("Número Decimal: " + numeroDecimal);
        System.out.println("Número Binário: " + numeroBinario);
        // Aqui você pode adicionar lógica para registrar os valores em um sistema de log, banco de dados, etc.
    }
}