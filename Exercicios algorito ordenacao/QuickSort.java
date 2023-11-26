public class QuickSort {

    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indiceParticao = particionar(array, inicio, fim);

            // Recursivamente ordenar os elementos à esquerda e à direita da partição
            quickSort(array, inicio, indiceParticao - 1);
            quickSort(array, indiceParticao + 1, fim);
        }
    }

    public static int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;
                trocar(array, i, j);
            }
        }

        trocar(array, i + 1, fim);
        return i + 1;
    }

    public static void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Array original:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nArray ordenado usando Quick Sort:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
