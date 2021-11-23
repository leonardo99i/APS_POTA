package aps;

public class selection {

    public static int contSelection = 0;
    public static void main(String[] args) {
        int[] vetor = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * 100);
        }

        System.out.println("Desordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        selectionSort(vetor, vetor.length);

        System.out.println("Vetor Ordenado com SelectionSort:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("Contador: " + contSelection);
        
    }

    public static int selectionSort(int[] vetor, int length){
        for(int i = 0; i < vetor.length; i++){
            int menor = i;
            for(int j = i+1; j < vetor.length; j++){
                contSelection++;
                if(vetor[j] > vetor[menor]){
                    menor = j;
                }
            }
            mudar(vetor, i, menor);
        }
        return contSelection;
    }

    public static void mudar(int[] vetor, int i, int menor) {
        int aux = vetor[i];
        vetor[i] = vetor[menor];
        vetor[menor] = aux;
    }
}
