package curso_programacao;

import java.util.Locale;

import java.util.Scanner;

public class Aula_sintaxe1 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
Scanner ler = new Scanner(System.in);
double valor ;
int tempo = ler.nextInt()	;
valor = 50.0;
	if (tempo>100) {
		valor += (tempo - 100) * 2;
		System.out.println(valor);
	} else
		System.out.println(valor);
	
	}

}
