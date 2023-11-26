public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean troca;

        for (int i = 0; i < n - 1; i++) {
            troca = false;

            // Últimos i elementos já estão ordenados, então não precisamos compará-los
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Trocar elementos se estiverem na ordem errada
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    troca = true;
                }
            }

            // Se nenhuma troca foi feita em uma passagem, o array está ordenado
            if (!troca) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Array original:");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nArray ordenado usando Bubble Sort:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}