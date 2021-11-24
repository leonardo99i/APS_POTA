package aps;

import java.util.Arrays;
import java.util.Scanner;

class HeapSort {

    public static int contHeap = 0;

	private static Scanner sc;

	public static void main(String args[]) {
		sc = new Scanner(System.in);

		System.out.println("Digite o numero de termos");
		int n = sc.nextInt();

		System.out.println("Digite os termos");
		int vetor[] = new int[n];
		for (int i = 0; i < n; i++)
            vetor[i] = sc.nextInt();

		System.out.println("O vetor desordenado é:");
		System.out.println(Arrays.toString(vetor));

		heap(vetor);

		System.out.println("O vetor ordenado é:");
		System.out.println(Arrays.toString(vetor));
        System.out.println("Contador: " + contHeap);
	}

	static int heapify(int vetor[], int n, int i) {
		int max, child;
		child = 2 * i + 1;
		max = i;
		if (child < n)
			if (vetor[child] > vetor[max])
				max = child;
		if (child + 1 < n)
			if (vetor[child + 1] > vetor[max])
				max = child + 1;
		if (max != i) {
			int temp = vetor[i];
			vetor[i] = vetor[max];
			vetor[max] = temp;
            contHeap++;
			heapify(vetor, n, max);
		}
        return contHeap;
	}

	static void buildheap(int vetor[]) {
		for (int i = vetor.length / 2 - 1; i >= 0; i--)
			heapify(vetor, vetor.length, i);
	}

	static int heap(int vetor[]) {
		buildheap(vetor);
		for (int i = vetor.length - 1; i >= 1; i--) {
			int temp = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = temp;
            contHeap++;
			heapify(vetor, i, 0);
		}
        return contHeap;
	}
}
