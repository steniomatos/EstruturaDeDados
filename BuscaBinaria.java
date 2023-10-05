import java.util.Scanner;

public class BuscaBinaria {

    /**
     * busca propriamente dita
     * Return true se o item foi encontrado ou não
     */
    private static boolean busca (int x, int[] array) {
        boolean is=false;
        int low = 0;
        int mid;
        int high = array.length-1;

        while(low <= high) {
            mid=(low+high)/2;

            if(array[mid] == x) {
                is=true;
                return is;
            }

            if(array[mid] < x){
                low = mid+1;
            
            } else if (array[mid] > x) {
                high=mid-1;
            }
        }
        
        return is;
    }

    public static void main (String [] Args) {

        Scanner s = new Scanner(System.in);
        //Consideramos que seja um array de inteiros
        int[] array = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12};

        int x;

        System.out.println ("Digite o número que você quer pesquisar: ");
        x = s.nextInt();
     
        if(busca(x, array) == true) {
            System.out.println("Esta no vetor");
        } else {
            System.out.println("Não esta no vetor");

        }
        

    }
}