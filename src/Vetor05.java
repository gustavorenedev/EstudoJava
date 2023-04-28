import java.util.Arrays;

public class Vetor05 {
	public static void main(String[] args) {
		int v[] = new int[20];
		// .fill = faz com que todos os números dentro do vetor sejam 0
		// v = o vetor, 0 = qual número quer atribuir para todos
		Arrays.fill(v, 0);
		for (int valor: v) {
			System.out.println(valor + " ");
		}
	}
}
