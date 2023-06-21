import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double pi;
		double area;
		double raio;

		Scanner leitura = new Scanner(System.in);
		pi = 3.14159;
		System.out.println("Digite o valor do raio:");
		raio = leitura.nextDouble();
		area = Math.pow(raio, 2.0) * pi;
		System.out.printf("O valor da área é %.4f%n", area);

		leitura.close();

	}

}
