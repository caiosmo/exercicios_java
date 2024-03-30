package curso_programacao;

import java.util.Scanner;

public class aula_ifelse6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x;
		System.out.println("Digite o numero");
		x = ler.nextDouble();
		if (x >= 0 && x <= 25) {
			System.out.println("Intevalo (0,25)");
		} else if (x > 25 && x <= 50) {
			System.out.println("Intervalo (25,50)");
		} else if (x > 50 && x <= 75) {
			System.out.println("Intervalo (50,75)");
		} else if (x > 75 && x <= 100) {
			System.out.println("Intervalo (75,100)");

		} else {
			System.out.println("Fora de intervalo");
		}

	}

}
