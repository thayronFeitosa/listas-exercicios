package Questao4;

import java.util.Scanner;

public class Questao4 {

	private int[] vetor;
	private int x;
	private int y;
	private double soma;

	public double somaVetor(int[] vetor, int x, int y) {

		this.vetor = new int[vetor.length];
		this.vetor = vetor;
		this.x = x;
		this.y = y;

		for (int i = 0; i < vetor.length; i++) {
			if (this.x == 0 || this.equals(y == 0)) {
				System.out.println("O valor x ou o valor y sao 0");
				return 0;
			}
			if (this.x == this.vetor[i] || this.y == this.vetor[i]) {
				soma = soma + this.vetor[i];
				System.out.println("valor" + soma + " na posição " + this.vetor[i]);
			}

		}
		return soma;
	}

	public static void main(String[] args) {
		int[] vetor = new int[12];
		Questao4 a = new Questao4();
		for (int i = 0; i < vetor.length; i++) {
		}

		vetor[0] = 1;
		vetor[1] = 2;
		vetor[2] = 2;
		Scanner scan = new Scanner(System.in);

		System.out.println("digite o numero do valor");
		int x = scan.nextInt();
		System.out.println("digite o valor de y");
		int y = scan.nextInt();
		a.somaVetor(vetor, x, y);
	}
}
