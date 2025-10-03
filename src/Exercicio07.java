
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		// Vetores
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vet = new int[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		
		sc.close();
		
	}

}
