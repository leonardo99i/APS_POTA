package aps;

public class bubble{

    public static int contBubble = 0; 
    public static void main(String[] args) {
        int[] vetor = new int[10000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * 100);
        }

        System.out.println("Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        bubbleSort(vetor, vetor.length);

        System.out.println("Vetor Ordenado com BubbleSort:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("Contador: " + contBubble);
        
    }

    public static int bubbleSort(int[] vetor, int length){
        int aux;
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor.length - 1; j++){
                if(vetor[j] < vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                    contBubble++;
                }
            }
        }
        return contBubble;
    }
}
