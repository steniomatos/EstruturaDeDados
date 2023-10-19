package A1;

/**
 * @author Stenio Matos 
 */
public class questao1 {

/*
 * O método que busca e retorna o índice do vetor em que o número passado por parametro se encontra
 * 
 * @param int[] vetor de inteiros
 * @param int numero inteiro
 * 
 * @return int intem encontrado
 */
public static int retornaIndice (int[] array, int x) { 
        for(int i=0; i<array.length; i++) {
            if(array[i] == x) 
                return x;
        }
    return -1;
}
public static void main(String[] args){
    //declaracao do array
    int[] array = {3, 2, 5, 1, 4, 8, 10, 12, 15}; 

    //chamada para o metodo retornaIndice()
    //melhor caso: quando o item a ser buscado se encontra na primeira posicao do array:
    retornaIndice(array, 3);

    //pior caso: quando o item a ser buscado não se encontra no array.
    retornaIndice(array, 9);

}
}
