import java.util.Scanner;

public class Vetor02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o ano em que estamos: ");
		int ano = input.nextInt();
		
		String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul",
				"Ago", "Set", "Out", "Nov", "Dez"};
		
		if (ano % 4 == 0) {
			System.out.println("Este é um ano bissexto");
			
			int tot[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
			for(int i = 0; i < mes.length; i++) {
				System.out.println("O mês de " + mes[i] + " tem " + 
			tot[i] + " dias ao todo.");
			}
		} else {
			
			int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for(int i = 0; i < mes.length; i++) {
				System.out.println("O mês de " + mes[i] + " tem " + 
			tot[i] + " dias ao todo.");
			}
		
		}
	}
}
