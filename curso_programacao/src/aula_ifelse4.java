import java.util.Scanner;

public class aula_ifelse4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b;
		int resto;
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();

		if (a > b || a == b) {
			resto = a % b;
			if (resto == 0) {
				System.out.println("São Múltiplos");

			} else {
				System.out.println("Não são múltiplos");
			}

		} else if (b > a) {
			resto = b % a;
			if (resto == 0) {
				System.out.println("São múltiplos");
			} else {
				System.out.println("Não são múltiplos");
			}

		}

	}

}
