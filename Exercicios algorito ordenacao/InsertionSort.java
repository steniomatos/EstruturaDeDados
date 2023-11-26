public class InsertionSort {

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int chave = array[i];
            int j = i - 1;

            // Mover os elementos do array[0..i-1] que são maiores que a chave
            // para uma posição à frente de sua posição atual
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        
        System.out.println("Array original:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nArray ordenado usando Insertion Sort:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}