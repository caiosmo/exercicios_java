package curso_programacao;

import java.util.Scanner;

public class estrutura_switch_case {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
 String dia;
 int x = ler.nextInt();
 switch (x) {
 case 1:
	 dia = "domingo";
	 break;
 case 2:
	 dia = "segunda";
	 break;
 case 3:
	 dia = "terça";
	 break;
	 default: 
		 dia="esse dia nao existe";
		 break;
		 
	 
 }
 System.out.println(dia);
	}

}
