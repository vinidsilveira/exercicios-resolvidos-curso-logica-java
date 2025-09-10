
public class Funcoes {

	public static void main(String[] args) {
		
		double x = 9.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		// Funções raiz quadrada
		
		System.out.println("Funções Raiz Quadrada:");
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de: " + x + " = " + A);
		System.out.println("Raiz quadrada de: " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		System.out.println();
		
		// Funções potência
		
		System.out.println("Funções Potência:");
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " é = " + A);
		System.out.println(x + " elevado ao quadrado é = " + B);
		System.out.println("5 elevado ao quadrado é = " + C);
		
		System.out.println();

		// Funções potência
		
		System.out.println("Funções Valor Absoluto:");
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " é igual a " + A);
		System.out.println("Valor absoluto de " + z + " é igual a " + B);
		

	}

}
