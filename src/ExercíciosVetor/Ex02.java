package ExercíciosVetor;

import java.util.Scanner;

public class Ex02 {
	/* Dado um vetor de números reais, 
	 * fazer um programa que some todos os elementos do vetor e imprima o resultado. 
	 */
	
	public static void main(String[] args) {
		int[] vetor = new int [5];
		
		Scanner input = new Scanner(System.in);
		
		int soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("vetor[%d]: ", i);
			vetor[i] = input.nextInt();
			soma += vetor[i];
		}
		
		System.out.println("Você digitou: ");
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("vetor[%d]: %d \n", i, vetor[i]);
		}
		
		System.out.println("A soma de todos os números dentro do vetor é igual a: " + soma);
	}
	
}
