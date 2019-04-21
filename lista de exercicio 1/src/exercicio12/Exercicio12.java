package exercicio12;

import java.util.Random;

/**
 * 12) Leia um vetor de 15 posições e posteriormente monte este vetor de forma
 * inversa. Exemplo: V1= | 1 | 8 | 9 | 10 | V2= 10 | 9 | 8 | 1 |
 * 
 * @author thayron
 *
 */
public class Exercicio12 {
	public static void main(String[] args) {
		Random r = new Random();

		int vetor[] = new int[15];
		int vetor1[] = new int[15];
		int temp =0;
		System.out.println("vetor normal");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt(11);
			System.out.print(vetor[i] + " | ");
		}
		for (int i = 0; i < vetor1.length/2; i++) {
			temp = vetor[vetor.length -i-1];
			vetor[ vetor.length - i - 1 ] = vetor[ i ];
			vetor[ i ] = temp;

		}
		System.out.println("\nvetor invertido");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print(vetor[i] + " | ");

		}

	}

}
