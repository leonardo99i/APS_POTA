package aps;

public class cont {

    public static int contCount = 0;

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

        countSort(vetor, vetor.length);

        System.out.println("Vetor Ordenado com CountSort:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("Contador: " + contCount);
    }

    // Java implementation of Counting Sort
    public static int countSort(int[] vetor, int length) {
            int n = vetor.length;
    
            int output[] = new int[n];

            int count[] = new int[256];
            for (int i = 0; i < 256; ++i)
                count[i] = 0;
                contCount++;
    
            for (int i = 0; i < n; ++i)
                ++count[vetor[i]];
                contCount++;
    
            for (int i = 1; i <= 255; ++i)
                count[i] += count[i - 1];
                contCount++;
    
            for (int i = n - 1; i >= 0; i--) {
                output[count[vetor[i]] - 1] = vetor[i];
                --count[vetor[i]];
                contCount++;
            }

            for (int i = 0; i < n; ++i)
                vetor[i] = output[i];
                contCount++;
            return contCount;
    }
}
