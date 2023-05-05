package ExercíciosVetor;

import java.util.Scanner;

public class Ex05 {
	// Dado um vetor de números reais, fazer um programa que imprima a média dos elementos do vetor
	
	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		int soma = 0;
		int media = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Vetor[%d]: ", i);
			vetor[i] = input.nextInt();
			soma += vetor[i];
		}
		media = soma / vetor.length;
		System.out.println("Média entre os números dados é: " + media);
	}
}
