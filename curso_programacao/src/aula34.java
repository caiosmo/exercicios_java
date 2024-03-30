import java.util.Scanner;

public class aula34 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int x;
		System.out.println("Digite o horário do dia nesse momento:");
		x = ler.nextInt();

		if (x > 5 && x < 12) {
			System.out.println("Bom dia");
		}
		if (x > 12 && x < 18) {
			System.out.println("Boa tarde");
		}
		if (x > 18 && x < 24) {
			System.out.println("O horário de agora é " + x + " Boa noite");
		}

	}

}
