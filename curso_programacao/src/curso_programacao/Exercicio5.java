package curso_programacao;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		int codigo_peca1, codigo_peca2;
		int numero_peca1, numero_peca2;
		double valor_peca1, valor_peca2;
		double valor_total;
		Scanner ler = new Scanner(System.in);
		System.out.println("Codigo peça 1:");
		codigo_peca1 = ler.nextInt();
		System.out.println("Valor peça 1:");
		valor_peca1 = ler.nextDouble();
		System.out.println("Quantas peças dessa você vai levar?");
		numero_peca1 = ler.nextInt();
		System.out.println("Codigo peça 2:");
		codigo_peca2 = ler.nextInt();
		System.out.println("Valor peça 2:");
		valor_peca2 = ler.nextDouble();
		System.out.println("Quantas peças dessa você vai levar?");
		numero_peca2 = ler.nextInt();
		valor_total = (numero_peca1 * valor_peca1) + (numero_peca2 * valor_peca2);
		System.out.println("Valor total é: " + valor_total);
		ler.close();

	}

}
