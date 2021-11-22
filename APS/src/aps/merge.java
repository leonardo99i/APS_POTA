package aps;

public class merge {

    public static int contMerge = 0; 
    public static void main(String[] args) {
        int[] vetor = new int[50];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * 100);
        }

        System.out.println("Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        mergeSort(vetor, vetor.length);

        System.out.println("Vetor Ordenado com MergeSort:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("Contador: " + contMerge);
    }

    public static int merge(int[] esquerda, int[] direita, int[] vet, int lado_esquerdo, int lado_direito) {
        int i = 0, e = 0, d = 0;
        while (e < lado_esquerdo && d < lado_direito) {
            if (esquerda[e] > direita[d]) {
                vet[i++] = esquerda[e++];
                //contMerge++;
            } else {
                vet[i++] = direita[d++];
                //contMerge++;
            }
        }
        while (e < lado_esquerdo) {
            vet[i++] = esquerda[e++];
        }
        while (d < lado_direito) {
            vet[i++] = direita[d++];
        }
        return 0; //contMerge;
    }

    public static int mergeSort(int[] vet, int tam) {
        if (tam < 2) {
            return tam;
        }
        int meio = tam / 2;
        int[] esquerda = new int[meio];
        int[] direita = new int[tam - meio];
        int k = 0;
        for (int i = 0; i < tam; i++) {
            if (i < meio) {
                contMerge++;
                esquerda[i] = vet[i];
            } else {
                contMerge++;
                direita[k] = vet[i];
                k = k + 1;
            }
        }
        mergeSort(esquerda, meio);
        mergeSort(direita, tam - meio);
        merge(esquerda, direita, vet, meio, tam - meio);
        return contMerge;
    }
}
