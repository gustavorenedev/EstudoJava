package ExercíciosVetor;

import java.util.Scanner;

public class Ex08 {
	// Dado um vetor de números inteiros e um número inteiro, fazer um programa que verifique se o 
	// número está presente no vetor. 
	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número para sabermos se ele está na lista: ");
		int num = input.nextInt();
		
		boolean encontrado = false;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Vetor[%d]: ", i);
			vetor[i] = input.nextInt();
			if (vetor[i] == num) {
				encontrado = true;
			}
		}	
		if(encontrado == true) {
			System.out.printf("O número %d está na lista", num);
		} else {
			System.out.printf("O número %d não está na lista", num);
		}
		
	}
}	
