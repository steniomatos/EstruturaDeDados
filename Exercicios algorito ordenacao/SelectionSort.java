
public class SelectionSort {

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
    
        // Encontrar o índice do menor elemento no restante do array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                minIndex = j;
                }
            }
        
            // Trocar o menor elemento encontrado com o primeiro elemento não ordenado
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Array original:");
        printArray(array);
    
        selectionSort(array);
    
        System.out.println("\nArray ordenado:");
        printArray(array);
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        }
}
    
