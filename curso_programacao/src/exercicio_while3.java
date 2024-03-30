import java.util.Scanner;

public class exercicio_while3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a opção desejada");
		int x = ler.nextInt();
		while (x < 1 || x > 4) {
			System.out.println("Número Invalido! Digite novamente o número:");
			x = ler.nextInt();
		}
		if (x == 1) {
			System.out.println("Opção Desejada: 1- Álcool");
		} else if (x == 2) {
			System.out.println("Opção Desejada: 2- Gasolina");
		} else if (x == 3) {
			System.out.println("Opção Desejada: 3- Diesel");
		} else if (x == 4) {
			System.out.println("Muito Obrigado");
		}
		// TODO Auto-generated method stub
		ler.close();
	}

}
