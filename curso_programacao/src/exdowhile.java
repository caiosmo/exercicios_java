import java.util.Scanner;

public class exdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a temperatura");
		char y;
		do {
			double x = ler.nextDouble();
			double f = ((x * 9) / 5) + 32;
			System.out.println(f);
			System.out.println("Deseja repetir a operação?");
			y = ler.next().charAt(0);
		} while (y != 'n');

	}
}
