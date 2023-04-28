import java.util.Arrays;

public class Vetor03 {
	public static void main(String[] args) {
		double v[] = {3.5, 2.75, 9, -4.5};
		//			para cada valor de v, mostre um sysout
		for (double valor: v) {
			// está importação coloca todo os números do vetor em ordem crescente
			Arrays.sort(v);
			System.out.println(valor + " ");
		}
	}
}
