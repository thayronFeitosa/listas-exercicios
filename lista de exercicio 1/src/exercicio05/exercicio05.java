package exercicio05;

import java.util.Random;

/**
 * 5) Leia um vetor de 40 posições e atribua valor 0 para todos os elementos que
 * possuírem valores negativos.
 * 
 * @author thayron
 *
 */
public class exercicio05 {
	public static void main(String[] args) {
		Random r = new Random();
		
		
		int vetor[] = new int[40];
		System.out.println("testando");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt();
			System.out.print(vetor[i]+" | ");
			if (vetor[i] < 0) {
				vetor[i] = 0;
			}

		}
		/**
		 * vetor de conferencia para ver se deu certo
		 */
		System.out.println("");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" | ");

		}
	}

}
