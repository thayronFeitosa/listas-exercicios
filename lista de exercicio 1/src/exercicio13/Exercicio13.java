package exercicio13;

import java.util.Scanner;
import java.util.Random;

/**
 * 13) Crie um programa que o usuário informa 50 valores a ser adicionado em um
 * vetor de 50 posições. Ao final seu programa deve informar: a)O maior elemento
 * b)A posição do menor elemento c)A média de valores d)A Quantidade de valores
 * pares
 * 
 * @author thayron
 *
 */

public class Exercicio13 {
	public static void main(String[] args) {
		int vetor[] = new int[50];
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int maiorElemento = 0;
		int menorElemento = 0;
		double mediaValores = 0;
		int qtdPates = 0;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt(31);
			if (vetor[i] == 0) {
				vetor[i] = 1;
			}
			System.out.print(vetor[i] + " | ");
		}
		System.out.println();
		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > maiorElemento) {
				maiorElemento = vetor[i];
			} else if (vetor[i] < menorElemento) {
				menorElemento = vetor[i];
			} else if (vetor[i] % 2 == 0) {
				qtdPates++;
			}
		}

		for (int i = 0; i < vetor.length; i++) {

			mediaValores += vetor[i];
		}
		System.out.println("Valor do maior elemento: " + maiorElemento + "\nValor do menor elemento: " + menorElemento
				+ "\nMedia dos valores: " + (mediaValores / 50) + "\nQuantidade de numeros pares: " + qtdPates);
	scan.close();

	}
}
