import java.util.Scanner;

public class exercicio6_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				
			}
			else if (n%i == 0  ) {
				System.out.println(i);
			}
		}
	}

}
