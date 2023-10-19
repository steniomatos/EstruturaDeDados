package A1;
import java.util.Stack;

/**
 * @author Stenio Matos
 * 
 * Uma pilha é uma coleção de objetos que são inseridos e retirados de acordo com o princípio de que o último que entra é o primeiro que sai (LIFO).

Descreva a saída resultante da seguinte série de operações de pilha : push(6), push(2),pop(),push(2),push(8),pop(),pop()push(9),push(1),pop(),push(7),push(6),pop(),push(4),pop(),pop().

Referência : Goodrich&Tamassio.Estrutura de Dados em Java. 4ed.Bookman,2007.
 */
public class questao2 {

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        // push(6)
        pilha.push(6);
        // push(2)
        pilha.push(2);
        // pop()
        pilha.pop();
        // push(2)
        pilha.push(2);
        // push(8)
        pilha.push(8);
        // pop()
        pilha.pop();
        // pop()
        pilha.pop();
        // push(9)
        pilha.push(9);
        // push(1)
        pilha.push(1);
        // pop()
        pilha.pop();
        // push(7)
        pilha.push(7);
        // push(6)
        pilha.push(6);
        // pop()
        pilha.pop();
        // push(4)
        pilha.push(4);
        // pop()
        pilha.pop();
        // pop()
        pilha.pop();

        // Exibindo a pilha resultante
        System.out.println("Saída resultante da pilha: " + pilha);
    }
}