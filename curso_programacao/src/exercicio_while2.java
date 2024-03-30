import java.util.Scanner;

public class exercicio_while2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x, y;
		System.out.println("Digite o X:");
		x = ler.nextInt();
		System.out.println("Digite o Y");
		y = ler.nextInt();
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");

			} else if (x > 0 && y < 0) {
				System.out.println("Quarto Quadrante");

			} else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
			}
			System.out.println("Digite novamente o valor de X e Y em sequencia:");
			x = ler.nextInt();
			y = ler.nextInt();

		} 
		System.out.println(" ");
		ler.close();
	}
}
