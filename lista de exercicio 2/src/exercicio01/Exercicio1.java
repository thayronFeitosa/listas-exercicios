package exercicio01;

import java.util.Scanner;

/**
 * 1. Fa�a uma fun��o que recebe um n�mero inteiro por par�metro e retorna
 * verdadeiro se ele for par e falso se for �mpar.
 * 
 * @author thayron_PC
 *
 */

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("digite um numero");
		int numero = scan.nextInt();
		System.out.println(inparOrPar(numero));
	}

	public static boolean inparOrPar(int numero) {
		return numero % 2 == 0;
	}

}
