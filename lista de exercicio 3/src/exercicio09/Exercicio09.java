package exercicio09;

import java.util.Random;

/**
 * Leia uma matriz 8 x 8 e escreva o maior elemento da diagonal principal e a
 * soma dos elementos da diagonal secundaria.
 * 
 * @author thayron
 *
 */

public class Exercicio09 {
	private int [][]matriz;
	private int soma;
	private int cont;
	
	public int maiorNumeroDaMatriz() {
		return cont;
	}
	public int somaDaDiagonaSecundaria(int [][]matriz) {
		this.cont =0;
		this.soma =0;
		Random r = new Random();
		this.matriz = new int[matriz.length][matriz.length];
		this.matriz = matriz;

		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++) {
				this.matriz[i][j] = r.nextInt(30);
				System.out.print(this.matriz[i][j]+" | ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++) {
				if (i + j == this.matriz.length -	1) {
					soma +=this.matriz[j][i];

				}
				if (i==j) {
					if (this.matriz[i][j]>=this.cont) {
						this.cont = this.matriz[i][j];
					}
				}
			}
			
		}
		/*
		 * System.out.println("o maior elemento da diagonal principal é: "+cont
		 * +"\ne a soma dos elemento da diagonal principal é: "+soma);
		 */
	
		
		return soma;
		
	}

	public static void main(String[] args) {
Exercicio09 a = new Exercicio09();
int matriz[][] = new int [4][4];
System.out.println(a.somaDaDiagonaSecundaria(matriz));
		System.out.println(a.maiorNumeroDaMatriz());
		
	}
}
