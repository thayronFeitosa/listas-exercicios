package exercicio09;
import java.util.Scanner;

/**
 * 9. Escreva uma fun��o que recebe 2 n�meros inteiros n1 e n2 como entrada e
 * retorna a soma de todos os n�meros inteiros contidos no intervalo [n1,n2].
 * Use esta fun��o em um programa que l� n1 e n2 do usu�rio e imprime a soma.
 * 
 * @author thayron_PC
 *
 */

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sigite o primeriro numero");
		int n1 = scan.nextInt();
		System.out.println("digite o segundo numero");
		int n2 = scan.nextInt();
		System.out.println(somarIntervaloDosNumeros(n1, n2));

	}

	public static int somarIntervaloDosNumeros(int n1, int n2) {
		int soma = 0;
		if (n1 > n2) {
			while (n1 > n2) {
				soma += n1;
				n1--;
			}
		} else if (n2 > n1) {
			while (n2 > n1) {
				soma += n2;
				n2--;
			}
		}
		return soma;
	}

}
