
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("====================================");
		System.out.println("	CALCULO DE TERRENO");
		System.out.println("====================================");

		System.out.print("Digite a largura do terreno (m): ");
		double largura = sc.nextDouble();

		System.out.print("Digite o comprimento do terreno (m): ");
		double comprimento = sc.nextDouble();

		System.out.print("Digite o valor do metro quadrado (R$): ");
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.println("\n----------- RESULTADO -----------");
		System.out.printf("AREA: %.2f%n", area);
		System.out.printf("PRECO: %.2f%n", preco);
		System.out.println("---------------------------------");

		sc.close();
	}

}
