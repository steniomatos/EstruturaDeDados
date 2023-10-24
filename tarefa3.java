import java.util.Stack;
import java.util.HashSet;

/**
 *  Crie um algoritmo (usando o framework de estrutura de dados) em Java que carregue valores inteiros (hardcode) 
 * para dois diferentes objetos do tipo pilha e na sequência cria um novo objeto do tipo pilha com os valores 
 * unificados da Pilha e não duplicados.
 */
public class tarefa3 {
    
    public static void main(String[] args) {
        // Criando duas pilhas e carregando valores (hardcode)
        Stack<Integer> pilha1 = new Stack<>();
        pilha1.push(1);
        pilha1.push(2);
        pilha1.push(3);

        Stack<Integer> pilha2 = new Stack<>();
        pilha2.push(3);
        pilha2.push(4);
        pilha2.push(5);

        // Criando uma terceira pilha com valores unificados e não duplicados
        Stack<Integer> pilhaUnificada = unificarPilhas(pilha1, pilha2);

        // Exibindo a pilha unificada
        System.out.println("Pilha Unificada: " + pilhaUnificada);
    }

    // Método para unificar pilhas sem duplicatas
    private static Stack<Integer> unificarPilhas(Stack<Integer> pilha1, Stack<Integer> pilha2) {
        // Usando HashSet para garantir valores únicos
        HashSet<Integer> conjuntoUnico = new HashSet<>();

        // Adicionando valores da pilha1 ao conjunto
        conjuntoUnico.addAll(pilha1);

        // Adicionando valores da pilha2 ao conjunto (que já exclui duplicatas)
        conjuntoUnico.addAll(pilha2);

        // Criando uma nova pilha com valores do conjunto
        Stack<Integer> pilhaUnificada = new Stack<>();
        pilhaUnificada.addAll(conjuntoUnico);

        return pilhaUnificada;
    }
}