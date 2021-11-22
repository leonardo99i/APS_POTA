package aps;

public class quick {
    public static int contQuick = 0;
    public static void main(String[] args) {
        
        int[] vetor = new int[5];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * 100);
        }

        System.out.println("Desordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        quicksort(vetor, 0, vetor.length - 1);
        
        System.out.println("Vetor Ordenado com QuickSort:");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("Contador: " + contQuick);
    }
    
    static int quicksort(int[] vetor, int esquerda, int direita){
        if (esquerda < direita){
            contQuick++;
            int p = particao(vetor, esquerda, direita);
            quicksort(vetor, esquerda, p);
            quicksort(vetor, p + 1, direita);
        }
        return contQuick;
    }
    
    static int particao(int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while(true){
            do{
                i++;
            }while(vetor[i] > pivo);
            do{
                j--;
            }while(vetor[j] < pivo);
            if (i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
}
