package exercicio04;

import java.util.Random;
import java.util.Scanner;

/**
 * 4. Leia uma matriz 6 x 6, conte e escreva quantos valores maiores que 10 ela
 * possui.
 * 
 * @author thayron
 *
 */
public class Exercicio04 {
	private int matriz[][];
	private final int valor = 10;
	
	public static void main(String[] args) {
		Exercicio04 a = new Exercicio04();
		
	
		a.quantosValoresPossuiNaMatriz();
	}

	public void quantosValoresPossuiNaMatriz() {
	
		Scanner scan = new Scanner(System.in);
		this.matriz = new int[2][2];
		int cont = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println("digite o numero");
				matriz[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+" | ");
				if (matriz[i][j] == this.valor) {
					cont++;
				}
			}
			System.out.println();

		}
		System.out.println("foram encontrados exatamente " + cont + " valores  " + valor);
	}

}
