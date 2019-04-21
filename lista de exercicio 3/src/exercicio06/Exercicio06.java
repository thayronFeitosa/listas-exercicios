package exercicio06;

import java.util.Random;
import java.util.Scanner;

/**
 * Leia uma matriz 4 x 4 e troque os valores da 1a.linha pelos da 4a.coluna,
 * vice-e-versa. Escrever ao final a matriz obtida
 * 
 * @author thayron
 *
 */

public class Exercicio06 {
	private int []linha;
	private int []coluna;
	private int [][]matriz;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
	int matriz[][] = new int [4][4];
	
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz.length; j++) {
			matriz[i][j]= r.nextInt(10);
			System.out.print(matriz[i][j]+" | ");
		}
		System.out.println();
	}
	scan.close();
		
		Exercicio06 a = new Exercicio06();
		a.inverterColunaPorLinha(matriz);
	
	}
	/**
	 *
	 * @param recebe uma matriz e inverte os valores da 1a.linha pelos da 4a.coluna, vice-e-versa. e escreve ao final a matriz obtida,

	 */
	public  void inverterColunaPorLinha(int [][]matrizs) {
		
		this.matriz = new int[matrizs.length][matrizs.length];
		this.matriz = matrizs;
		this.linha = new int [matriz.length];
		this.coluna= new int [matriz[0].length];
		
		for (int i = 0; i < linha.length; i++) {
				linha[i] = this.matriz[0][i];
		}
		for (int i = 0; i < coluna.length; i++) {
			coluna[i] = this.matriz[i][coluna.length-1];
		}
	
		System.out.println("matriz convertida");
		int aux = coluna.length-1;
		int aux2 = coluna.length-1;

		for (int j = 0; j < coluna.length; j++) {
					this.matriz[0][aux] = coluna[j];
					aux--;
					this.matriz[j][coluna.length-1] = linha[aux2];
					aux2--;
						}
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz.length; j++) {
				System.out.print(this.matriz[i][j]+" | ");
			}
			System.out.println();
		}
		
		}
	
		
	

}
