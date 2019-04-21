package exercicio04;

import java.util.Random;

/**
 * definir a medias das notas de 50 alunos
 * @author thayron
 *
 */

public class exercicio04 {
	
	public static void main(String [] args) {
		double []notas = new double[50];
		double media =0;
		
		Random r = new Random();
		
		for (int n = 0; n < notas.length; n++) {
			notas[n]= r.nextInt(100);
			media += notas[n];
			
		}
		
		System.out.println("A medias dos 50 alunos e de: "+media/50);
	}


}
