package aps;

public class bucket {

    public static int contBucket = 0;

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

        bucketSort(vetor, vetor.length);

        System.out.println("Vetor Ordenado com BucketSort:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("Contador: " + contBucket);
    }

    public static int bucketSort(int[] vetor, int length) {
        int n = vetor.length;
		if(n <= 0) return n;
		int minimo = vetor[0];
		int maximo = minimo;
		for(int i = 1; i < n; i++){
			if(vetor[i] > maximo) maximo = vetor[i];
			if(vetor[i] < minimo) minimo = vetor[i];
		}
		
		int bucket[] = new int[maximo - minimo + 1];
		for(int i = 0; i < n; i++){
			bucket[vetor[i] - minimo]++;
		}
		
		int i = 0;
		for(int b = 0, len = bucket.length; b < len; b++){
			for(int j = 0; j < bucket[b]; j++){
                vetor[i++] = b + minimo;
                contBucket++;
            }
		}
        return contBucket;
    }
}
