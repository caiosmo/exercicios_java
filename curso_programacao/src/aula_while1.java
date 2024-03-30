import java.util.Scanner;

public class aula_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);

		int x = leitura.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x; //Significa soma = soma + x;
			x = leitura.nextInt();
		}
		System.out.println("Oi");
		System.out.println(soma);
		leitura.close();
	}

}
