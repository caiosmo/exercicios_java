import java.util.Scanner;

public class aula_ifelse5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double cod1, cod2, cod3, cod4, cod5;
		double valor;
		int quant;
		int n_pedido;
		cod1 = 4;
		cod2 = 4.5;
		cod3 = 5;
		cod4 = 2;
		cod5 = 1.5;
		System.out.println("Digite o código do lanche");
		n_pedido = ler.nextInt();
		System.out.println("Agora digite o número de lanches: ");
		quant = ler.nextInt();
		if (n_pedido == 1) {
			valor = cod1 * quant;
			System.out.println(valor);

		} else if (n_pedido == 2) {
			valor = cod2 * quant;
			System.out.println(valor);

		} else if (n_pedido == 3) {
			valor = cod3 * quant;
			System.out.println(valor);

		} else if (n_pedido == 4) {
			valor = cod4 * quant;
			System.out.println(valor);
		} else {
			valor = cod5 * quant;
			System.out.println(valor);

		}

	}

}
