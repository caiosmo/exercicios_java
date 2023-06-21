import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int x,y;
		int soma;
	
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros");
		
		x = leitura.nextInt();
		y = leitura.nextInt();
		soma = x + y;
		
		System.out.println("A soma dos dois números inteiros é: " + soma);
	
		leitura.close();
	}

}
