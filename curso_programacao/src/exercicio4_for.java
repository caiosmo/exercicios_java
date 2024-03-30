import java.util.Scanner;
public class exercicio4_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o primeiro e o segundo valor:");
			int x = ler.nextInt();
			int y = ler.nextInt();
			double divisao = (double) x / y;
			if (y == 0) {
				System.out.println("Divisão Impossível");
			} else
				System.out.println(divisao);
		}
		ler.close();

	}

}
