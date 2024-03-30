import java.util.Scanner;

public class exercicio_while1 {

	public static void main(String[] args) {

		Scanner ler_senha = new Scanner(System.in);
		System.out.println("Digite a senha");
		int senha = ler_senha.nextInt();
		while (senha != 2002) {
			System.out.println("Senha Invalida! Digite novamente:");
			senha = ler_senha.nextInt();
		}
		System.out.println("Senha Correta! Acesso liberado! Parabéns.");

		ler_senha.close();
	}

}
