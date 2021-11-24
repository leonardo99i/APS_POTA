package aps;

public class insetion {

    public static int contInsertion = 0;

    public static void main(String[] args) {
        int[] vetor = new int[10000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * 100);
        }

        System.out.println("Desordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        insertionSort(vetor, vetor.length);

        System.out.println("Vetor Ordenado com InsertionSort:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("Contador: " + contInsertion);
    }

    public static int insertionSort(int[] vetor, int length) {
        int a, j;
        for(int i = 1; i < vetor.length; i++){
            a = vetor[i];
            j = i - 1;
            contInsertion++;
            while((j >= 0) && vetor[j] < a){
                vetor[j + 1] = vetor[j];
                j= j - 1;
            }
            vetor[j+1] = a;
        }
        return contInsertion;
    }
}
