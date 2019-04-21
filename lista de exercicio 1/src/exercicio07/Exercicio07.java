package exercicio07;

import java.util.Random;
import java.util.Scanner;

/**
 * 7) Desenvolva um algoritmo que monte um vetor de inteiros de 15 posições,
 * após o vetor pronto, o programa vai pedir um outro número, o programa terá de
 * informar, quantos elementos no vetor são maiores que o número informado,
 * quantos são menores e quantos são iguais.
 * 
 * @author thayron
 *
 */

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vetor[];
		System.out.println("figite o tamaho do vetor");
		int tamanho = scan.nextInt();
		vetor = new int[tamanho];
		System.out.println("digite um numero");
		int valor = scan.nextInt();
		procurarNovetor(vetor, valor);
		scan.close();

	}

	public static void procurarNovetor(int vetor[], int valor) {
		int contMaior = 0, contMenor = 0, contIgual = 0;

		Random r = new Random();

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt(20);
			if (vetor[i] == valor) {
				contIgual++;
			} else if (vetor[i] < valor) {
				contMenor++;
			} else if (vetor[i] > valor) {
				contMaior++;
			}
		}
		System.out
				.println("valores menor " + contMenor + " valores maior " + contMaior + " valores iguais " + contIgual);

	}

}
