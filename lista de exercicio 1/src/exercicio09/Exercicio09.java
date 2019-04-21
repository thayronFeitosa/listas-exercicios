package exercicio09;

import java.util.Random;

/**
 * 9) Preencher um vetor de 8 elementos inteiros. Mostrar o vetor e informar
 * quantos números são maior que 30, Somar estes números. Somar todos os
 * números.
 * 
 * @author thayron
 *
 */

public class Exercicio09 {

	public static void main(String[] args) {
		Random r = new Random();

		int vetor[] = new int[8];
		int maior30 = 0;
		int somaMaior30 = 0;
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt(100);
			soma += vetor[i];
			if (vetor[i] > 30) {
				maior30++;
				somaMaior30 += vetor[i];
			}
		}
		System.out.print("Vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " | ");
		}
		System.out.println("\nMaiores que 30: = " + maior30 + "\nSoma dos maiores que 30: = " + somaMaior30
				+ "\nSoma de todos: = " + soma);

	}

}
