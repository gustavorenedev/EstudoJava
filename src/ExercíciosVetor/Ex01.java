package ExercíciosVetor;

import java.util.Scanner;

public class Ex01 {
	//Dado um vetor de números reais, fazer um programa que imprime 
	//todos os elementos do vetor. 
	
	public static void main(String[] args) {
		double[] vetor = new double [5];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Total de casas do vetor é: " + vetor.length);
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("vetor[%d]: ", i);
			vetor[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("vetor[%d]:%d ", i, vetor[i]);
		}
	}
}
