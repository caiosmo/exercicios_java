import java.util.Scanner;

public class aula_ifelse3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int resto;
		int x;
		System.out.println("Digite o número: ");
		x = ler.nextInt();
		resto = x % 2;
		if (resto == 1) {
			System.out.println("O número é impar");
		} else {
			System.out.println("O número é par");
		}

		ler.close();

	}

}
