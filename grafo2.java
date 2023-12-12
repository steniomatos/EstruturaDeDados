import java.util.*;

class Aresta {
    private int destino;
    private int peso;

    public Aresta(int destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }

    public int getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }
}

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

    public List<Integer> caminhoMinimo(int origem, int destino) {
    Map<Integer, Integer> distancias = new HashMap<>();
    Map<Integer, Integer> predecessores = new HashMap<>();
    PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(distancias::get));

    // Inicialização
    for (int vertice : adjacencias.keySet()) {
        distancias.put(vertice, Integer.MAX_VALUE);
        predecessores.put(vertice, null);
    }
    distancias.put(origem, 0);
    filaPrioridade.add(origem);

    // Algoritmo de Dijkstra
    while (!filaPrioridade.isEmpty()) {
        int u = filaPrioridade.poll();
        for (Aresta aresta : adjacencias.get(u)) {
            int v = aresta.getDestino();
            int pesoUV = aresta.getPeso();
            int novaDistancia = distancias.get(u) + pesoUV;
            if (novaDistancia < distancias.get(v)) {
                distancias.put(v, novaDistancia);
                predecessores.put(v, u);
                filaPrioridade.add(v);
            }
        }
    }

    // Reconstruir o caminho mínimo
    List<Integer> caminho = new ArrayList<>();
    int atual = destino;
    while (atual != null) {
        caminho.add(atual);
        atual = predecessores.get(atual);
    }
    Collections.reverse(caminho);

    return caminho;
}


    public int grauDoVertice(int vertice) {
    if (adjacencias.containsKey(vertice)) {
        return adjacencias.get(vertice).size();
    } else {
        return 0;
    }
}

public int grauDoGrafo() {
    int grauTotal = 0;
    for (List<Aresta> arestas : adjacencias.values()) {
        grauTotal += arestas.size();
    }
    return grauTotal;
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
        long startTime = System.currentTimeMillis();
        List<Integer> caminhoMinimo = grafo.caminhoMinimo(verticeOrigem, verticeDestino);
        long endTime = System.currentTimeMillis();
        long tempoDeExecucao = endTime - startTime;
        System.out.println("Tempo de execução: " + tempoDeExecucao + " milissegundos");

    }
