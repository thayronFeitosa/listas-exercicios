package exercicio08;

import java.util.Random;
import java.util.Scanner;

/**
 * Leia uma matriz 5 x 5 e faça uma troca deposição dos elementos da diagonal
 * principal e a diagonal secundária.
 * 
 * @author thayron
 *
 */

public class Exercicio08 {
	private int[][]matriz;
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int matriz[][] = new int [5][5];
	Exercicio08 a = new Exercicio08();
	a.trocaDeposicao(matriz);
	scan.close();
}
/**
 * metodo pega uma matriz e inverte os valores da diagonal principal pela secundaria
 * 
 */
public void trocaDeposicao(int [][]matriz) {
	Random r = new Random();
	this.matriz = new int [matriz.length][matriz.length];
	this.matriz = matriz;
	
	
	System.out.println("Matriz original");
	for (int i = 0; i < this.matriz.length; i++) {
		for (int j = 0; j < this.matriz.length; j++) {
			
			this.matriz[i][j] = r.nextInt(10); 
			System.out.print(this.matriz[i][j]+" | ");
		}
		System.out.println();
	}
	/**
	 * função para trocar a posição dos valores da diagonal principal pela secundaria
	 */
	for (int i = 0; i < this.matriz.length; i++) {
		for (int j = 0; j < this.matriz[0].length; j++) {
			if (i>j) {
				
					this.matriz[j][i] = this.matriz[i][j];
			}else if(i<j) {
				this.matriz[i][j] = this.matriz[j][i];

			}else if (i==j) {
				

			}
		}
		
	}
	System.out.println("\nMatriz invertida");
	
	
	for (int i = 0; i < this.matriz.length; i++) {
		for (int j = 0; j < this.matriz.length; j++) {
			System.out.print(this.matriz[i][j]+" | ");
		}
	System.out.println();
	}
}
}
