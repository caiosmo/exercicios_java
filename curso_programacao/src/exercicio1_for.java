import java.util.Scanner;

public class exercicio1_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		System.out.println("Digite na tela um valor menor que 1000: ");
		x = ler.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		ler.close();

	}

}
