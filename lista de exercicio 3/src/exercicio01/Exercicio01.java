package exercicio01;

import java.util.Scanner;

/**
 * 1. Leia uma matriz 10 x 10 e escreva a localização (linha e a coluna) do maior valor.
 * @author thayron
 *
 */

public class Exercicio01 {
private int [][]matriz;
private int linha, coluna, valor;


public void lerMatriz() {
	this.matriz = new int [2][2];
	Scanner scan = new Scanner(System.in);
	for (int i = 0; i < this.matriz.length; i++) {
		for (int j = 0; j < this.matriz[0].length; j++) {
			System.out.println("digite um numero");
			this.matriz[i][j] = scan.nextInt();
		}
		
	}
	linhaColuna();
	
	
}
	
private void linhaColuna() {
	this.valor =0;
	this.linha =0;
	this.coluna =0;
	for (int i = 0; i < this.matriz.length; i++) {
		for (int j = 0; j < this.matriz[0].length; j++) {
			if (this.matriz[i][j]>valor) {
				valor = this.matriz[i][j];
				linha =i;
				coluna =j;
				
			}
			System.out.print(matriz[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println(valor+"o maior valor se encontra na linha "+ this.linha +" e coluna "+this.coluna);
}
	
	
}
