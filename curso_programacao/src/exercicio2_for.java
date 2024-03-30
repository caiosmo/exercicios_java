import java.util.Scanner;

public class exercicio2_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		System.out.println("Digite um valor: ");
		n = ler.nextInt();
		int soma_in = 0, soma_out = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Digite outro valor: ");
			int y = ler.nextInt();
			if (y >= 10 && y <= 20) {
				soma_in += 1;

			} else {
				soma_out += 1;
			}
		} 
		System.out.println(soma_in + " in");
		System.out.println(soma_out + " out");
	}

}
