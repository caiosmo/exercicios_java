import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		int diferenca;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		diferenca = (a*b) - (c*d);
		System.out.println(diferenca);
		
		sc.close();
		

	}

}
