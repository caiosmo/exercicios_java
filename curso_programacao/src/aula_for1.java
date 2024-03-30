import java.util.Scanner;

public class aula_for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int soma = 0;
		
		for (int i=0; i<n; i++) {
			int x = ler.nextInt();
			soma = soma + x;
			
		}
		System.out.println(soma);
		
		ler.close();
	}
}
