import java.util.*;

class Grafo2 {
    private Map<Integer, List<Integer>> adjacencias;

    // Construtor vazio
    public Grafo() {
        this.adjacencias = new HashMap<>();
    }

    // Construtor que recebe uma coleção
    public Grafo(Collection<Integer> vertices) {
        this();
        for (int vertice : vertices) {
            insereVertice(vertice);
        }
    }

    // Método para inserir um vértice
    public void insereVertice(int vertice) {
        if (!adjacencias.containsKey(vertice)) {
            adjacencias.put(vertice, new ArrayList<>());
        }
    }

    // Método para inserir uma aresta
    public void insereAresta(int verticeOrigem, int verticeDestino) {
        if (adjacencias.containsKey(verticeOrigem) && adjacencias.containsKey(verticeDestino)) {
            adjacencias.get(verticeOrigem).add(verticeDestino);
        } else {
            System.out.println("Erro: Vértices não existem.");
        }
    }

    // Método para imprimir os vértices
    public void imprimeVertices() {
        System.out.print("{");
        for (int vertice : adjacencias.keySet()) {
            System.out.print(vertice + ", ");
        }
        System.out.println("}");
    }

    // Método para imprimir as arestas
    public void imprimeArestas() {
        System.out.print("{");
        for (int verticeOrigem : adjacencias.keySet()) {
            List<Integer> destinos = adjacencias.get(verticeOrigem);
            for (int destino : destinos) {
                System.out.print("(" + verticeOrigem + ";" + destino + "), ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        grafo.insereVertice(0);
        grafo.insereVertice(1);
        grafo.insereVertice(2);
        grafo.insereVertice(3);
        grafo.insereVertice(4);

        grafo.insereAresta(1, 3);
        grafo.insereAresta(2, 2);
        grafo.insereAresta(0, 5);
        grafo.insereAresta(3, 1);

        System.out.print("Vértices: ");
        grafo.imprimeVertices();

        System.out.print("Arestas: ");
        grafo.imprimeArestas();
    }
}import java.util.*;

class Grafo {
    private Map<Integer, List<Integer>> adjacencias;

    // Construtor vazio
    public Grafo() {
        this.adjacencias = new HashMap<>();
    }

    // Construtor que recebe uma coleção
    public Grafo(Collection<Integer> vertices) {
        this();
        for (int vertice : vertices) {
            insereVertice(vertice);
        }
    }

    // Método para inserir um vértice
    public void insereVertice(int vertice) {
        if (!adjacencias.containsKey(vertice)) {
            adjacencias.put(vertice, new ArrayList<>());
        }
    }

    // Método para inserir uma aresta
    public void insereAresta(int verticeOrigem, int verticeDestino) {
        if (adjacencias.containsKey(verticeOrigem) && adjacencias.containsKey(verticeDestino)) {
            adjacencias.get(verticeOrigem).add(verticeDestino);
        } else {
            System.out.println("Erro: Vértices não existem.");
        }
    }

    // Método para imprimir os vértices
    public void imprimeVertices() {
        System.out.print("{");
        for (int vertice : adjacencias.keySet()) {
            System.out.print(vertice + ", ");
        }
        System.out.println("}");
    }

    // Método para imprimir as arestas
    public void imprimeArestas() {
        System.out.print("{");
        for (int verticeOrigem : adjacencias.keySet()) {
            List<Integer> destinos = adjacencias.get(verticeOrigem);
            for (int destino : destinos) {
                System.out.print("(" + verticeOrigem + ";" + destino + "), ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        grafo.insereVertice(0);
        grafo.insereVertice(1);
        grafo.insereVertice(2);
        grafo.insereVertice(3);
        grafo.insereVertice(4);

        grafo.insereAresta(1, 3);
        grafo.insereAresta(2, 2);
        grafo.insereAresta(0, 5);
        grafo.insereAresta(3, 1);

        System.out.print("Vértices: ");
        grafo.imprimeVertices();

        System.out.print("Arestas: ");
        grafo.imprimeArestas();
    }
}
