package Questao5;

import java.util.Random;

public class Questao5 {
	
	private int[][]matriz;
	
	public Questao5(int[][]matriz) {
		this.matriz = new int [matriz.length][matriz[0].length];
		this.matriz = matriz;
	}
	public double somaDiagonalPricipal() {
		double soma =0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i==j) {
					soma = soma +this.matriz[i][j];
				}
			}
		}
		return soma;
	}
	public int maiorValor() {
		int soma =0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i+j ==this.matriz.length-1) {
					if (soma <this.matriz[j][i]) {
						soma = this.matriz[j][i];

					}
				}
			}
		}
		return soma;
	}
	
	public double menorValor() {
		double soma =0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (soma > this.matriz[i][j]) {
					soma =soma + this.matriz[i][j];
				}
			}
		}
		return soma;
	}
	public void mostrar() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+" | ");
			}
			System.out.println();
		}
	}
	
	
	
	

}
