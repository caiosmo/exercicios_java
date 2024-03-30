import java.util.Scanner;

public class aula_ifelse2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int hora;
		System.out.println("Digite o horário do dia nesse exato momento: ");
		hora = leitura.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else {
			if (12 <= hora && hora < 18) {
				System.out.println("Boa tarde!");
			} else {
				System.out.println("Boa noite!");
			}
		}
	}
}
