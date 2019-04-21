package exercicio10;

import java.util.Random;

public class Exercicio10 {
	private int [][]matriz;
	
	
	
	
	public static void main(String[] args) {
		Random r = new Random();

		int[][] matriz = new int[6][6];
for (int i = 0; i < matriz.length; i++) {
	for (int j = 0; j < matriz[0].length; j++) {
		matriz[i][j] = r.nextInt(10);
	}
}
		

		matriz[4][4] = -2;
		matriz[3][3] = -6;
		matriz[0][0] = -2;
		matriz[0][1] = -6;
		matriz[0][1] = -6;
		matriz[0][1] = -6;

		Exercicio10 a = new Exercicio10();
		a.zerarValoresNegativos(matriz);
		

	}

	/**
	 * 
	 * @param matriz recebe uma matriz e atribui 0 aos valores negativos
	 */
	public void zerarValoresNegativos(int matriz[][]) {
		this.matriz = new int [matriz.length][matriz.length];
		this.matriz = matriz;

		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++) {
				if (this.matriz[i][j] < 0) {
					this.matriz[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++) {
				System.out.print(this.matriz[i][j]+" | ");

			}
			System.out.println();

		}
	}

}
