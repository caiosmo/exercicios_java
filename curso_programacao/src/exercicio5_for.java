import java.util.Scanner;

public class exercicio5_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n = ler.nextInt();
		int fatorial = 1;
		for (int i=1;i<=n;i++) {
			fatorial = fatorial * i;
			
		} System.out.println(fatorial);

	}

}
