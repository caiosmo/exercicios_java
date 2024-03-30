import java.util.Locale;
import java.util.Scanner;

public class exercicio3_for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		for (int i=0; i < n; i++) {
			double x = ler.nextDouble();
			double y = ler.nextDouble();
			double z = ler.nextDouble();
			x = x * 2;
			y = y * 3;
			z = z * 5;
			double media = (x + y + z)/10;
			System.out.printf("%.1f%n" , media);
		}
		ler.close();
	}

	private static void setDefault(Locale uk) {
		// TODO Auto-generated method stub
		
	}

}
