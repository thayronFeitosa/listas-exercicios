package exercicio02;

import java.util.Scanner;

/**
 * 2. Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os
 * demais elementos. Escreva ao final a matriz obtida.
 * 
 * @author thayron
 *
 */

public class Exercicio02 {
	public static void main(String[] args) {
	
		matriz();
		
	}
	
	public static void matriz() {
		int matriz[][] = new int [5][5];
		System.out.println("matriz original");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+" | ");
			}
			System.out.println();
		}
		System.out.println("matriz com 1 na diagonal");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i==j) {
					matriz[i][j] =1;
				}
				System.out.print(matriz[i][j]+" | ");
			}
			System.out.println();
		}
		
		
		
	}

}
