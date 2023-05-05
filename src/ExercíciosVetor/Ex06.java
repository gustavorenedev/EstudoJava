package ExercíciosVetor;

import java.util.Scanner;

public class Ex06 {
	// Dado um vetor de números reais, fazer um programa que imprima o produto dos elementos do vetor.
	
	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		int produto = 1;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Vetor[%d]: ", i);
			vetor[i] = input.nextInt();
			produto *= vetor[i];
		}
		System.out.println("O resultado do produto entre os números é: " + produto);
	}
}
