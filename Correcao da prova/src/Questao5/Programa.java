package Questao5;

import java.util.Random;

public class Programa {
	public static void main(String[] args) {
		int [][]matriz = new int [5][5];
		Random r = new Random();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = r.nextInt(10);
			}
		}
		Questao5 a = new Questao5(matriz);
		a.mostrar();
		System.out.println();
		System.out.println(a.maiorValor());

	}

}
