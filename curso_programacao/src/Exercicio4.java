import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {

	public static void main(String[] args) {
		int matricula;
		int horas;
		double valor_hora;
		double salario;
		Locale.setDefault(Locale.US);

		Scanner recebe = new Scanner(System.in);
		matricula = recebe.nextInt();
		horas = recebe.nextInt();
		valor_hora = recebe.nextDouble();
		salario = (horas * valor_hora);
		System.out.println(matricula);
		System.out.printf("%.2f%n", salario);

		recebe.close();

	}

}
