package exercicio03;

import java.util.Random;
import java.util.Scanner;

/**
 * 3. Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores elementos
 * entre as primeiras
 * 
 * @author thayron
 *
 */

public class Exercicio03 {
	private int matriz1[][];
	private int matriz2[][];
	private int matriz3[][];

	public static void main(String[] args) {
	Exercicio03 a = new Exercicio03();
		a.escreveraMatriz();
	;
	}

	public void escreveraMatriz() {
		Random r = new Random();
		this.matriz1 = new int[4][4];
		this.matriz2= new int[4][4];
		this.matriz3= new int[4][4];

		for (int i = 0; i < this.matriz1.length; i++) {
			for (int j = 0; j < this.matriz1[0].length; j++) {

				this.matriz1[i][j] = r.nextInt(10);
				this.matriz2[i][j] = r.nextInt(10);

				this.matriz3[i][j] = this.matriz1[i][j];

				if (this.matriz2[i][j] >= this.matriz1[i][j]) {
					this.matriz3[i][j] = this.matriz2[i][j];
				}
			}
		}

		System.out.println("matriz 1");
		for (int i = 0; i < this.matriz1.length; i++) {
			for (int j = 0; j < this.matriz1[0].length; j++) {
				System.out.print(this.matriz1[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.println("\nmatriz 2");
		for (int i = 0; i < this.matriz2.length; i++) {
			for (int j = 0; j < this.matriz2[0].length; j++) {
				System.out.print(this.matriz2[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("\nmatriz 3");
		for (int i = 0; i < this.matriz3.length; i++) {
			for (int j = 0; j < this.matriz3[0].length; j++) {
				System.out.print(this.matriz3[i][j] + " | ");
			}
			System.out.println();
		}

	}

}
