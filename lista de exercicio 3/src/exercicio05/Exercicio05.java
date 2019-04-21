package exercicio05;

import java.util.Random;
import java.util.Scanner;

/**
 * Leia uma matriz 20 x 20. Leia tambÃ©m um valor X. O programa deverÃ¡ fazer uma
 * busca desse valor na matriz e, ao final escrever a localizaÃ§Ã£o (linha e
 * coluna) ou uma mensagem de â€œnÃ£o encontradoâ€�.
 * 
 * @author thayron
 *
 */

public class Exercicio05 {
	private int [][]matriz;
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("digite o numero que dezeja encontra");
		Exercicio05 a = new Exercicio05();
		int valor = scan.nextInt();
		a.encontrarValor(valor);
		scan.close();
		
	}
	
	
	
	public void encontrarValor(int valor) {
		Random r = new Random();
		
		this.matriz = new int [20][20];
		 
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++) {
				this.matriz[i][j] = r.nextInt(16);
			}
		}
		int cont =0;
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++) {
				if (this.matriz[i][j] == valor) {
					cont ++;
					System.out.println("foi encontar o valor "+valor+" na linha "+i+" e coluna "+j);

				}
			}
		}
		if (cont ==0) {
			System.out.println("valor nÃ£o encontrado");
		}
	}

}
