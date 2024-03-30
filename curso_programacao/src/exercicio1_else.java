import java.util.Scanner;

public class exercicio1_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int x;
		System.out.println("Digite um número e vamos verificar se ele é negativo ou positivo: ");
		x = ler.nextInt();
		if (x < 0) {
			System.out.println("Esse número é negativo");

		} else {
			System.out.println("Esse número é positivo");
		}

	}

}
