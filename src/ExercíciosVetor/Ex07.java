package ExercíciosVetor;

import java.util.Scanner;

public class Ex07 {
	// Dado um vetor de números reais e um número real, fazer um programa que multiplique todos 
	// os elementos do vetor pelo número real dado e imprima o resultado.
	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número no qual todos multiplicaram nele: ");
		int num = input.nextInt();
		System.out.println("Faremos a soma também :D");
		
		int soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Vetor[%d]: ", i);
			vetor[i] = input.nextInt();
			int multi = num * vetor[i];
			System.out.printf("%d x %d = %d\n", num, vetor[i], multi);
			System.out.println(" ");
			soma += multi;
		}
		System.out.println("O valor total é: " + soma);
	}
}
