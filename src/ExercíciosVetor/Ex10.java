package ExercíciosVetor;

import java.util.Scanner;

public class Ex10 {
	// Dado um vetor de números reais e um número real, fazer um programa que multiplique os 
	// elementos de posição impar do vetor pelo número real dado e imprima o resultado.
	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número para multiplicarmos pela lista: ");
		int num = input.nextInt();
		
		int soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Vetor[%d]: ", i);
			vetor[i] = input.nextInt();
			if (vetor[i] % 2 == 1) {
				int multi = num * vetor[i];
				System.out.printf("%d x %d = %d\n", num, vetor[i], multi);
				System.out.println(" ");
				soma += multi;
			} else if (vetor[i] % 2 == 0) {
				System.out.println("O número precisa ser ímpar");
				System.out.println(" ");
			}
			System.out.println("O valor total é: " + soma);
		}
	}
}
