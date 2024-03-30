import java.util.Scanner;

public class aula_if_else {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		int x;
		x = ler.nextInt();

		if (x < 12) {
			System.out.println("Bom dia");
		}

		else {
			System.out.println("Boa tarde");
			ler.close();
			
		}

	}

}
