package ExercíciosVetor;

import java.util.Scanner;

public class Ex03e04 {
	// Dado um vetor de números reais, fazer um programa que imprima o maior e o menor 
	// elemento do vetor.  
	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		int maior = 0;
		int menor = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Vetor[%d]: ", i);
			vetor[i] = input.nextInt();
			if(i == 0) {
				maior = vetor[i];
				menor = vetor[i];
			}
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		System.out.println("O maior números dentre os " + vetor.length + " números é: " + 
		maior + " e o menor é: " + menor);
		
		
	}
}
