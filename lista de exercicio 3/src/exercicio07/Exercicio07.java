package exercicio07;

import java.util.Scanner;

/**
 * Leia uma matriz 8 x 8 e a transforme numa matriz triangular inferior,
 * atribuindo zero a todos os elementos acima da diagonal principal,
 * escrevendo-a ao final.
 * 
 * @author thayron
 *
 */

public class Exercicio07 {
	private int[][] matriz;

	public void diagonalSperiorZero(int[][] matriz) {
		Scanner scan = new Scanner(System.in);

		this.matriz = new int[matriz.length][matriz.length];
		this.matriz = matriz;

		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz.length; j++) {
				
					System.out.println("DIgite os numeros da matriz");
				this.matriz[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i < j) {
					this.matriz[i][j] = 0;
				}
				System.out.print(matriz[i][j] + " | ");
			}
			System.out.println();

		}

	}


	public static void main(String[] args) {
	Exercicio07 a = new Exercicio07();
	int [][]matriz = new int [4][4];
	a.diagonalSperiorZero(matriz);
	}
}
