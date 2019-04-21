package exercicio11;

import java.util.Scanner;

/**
 * 11) Leia um vetor de 12 posições e em seguida ler também dois valores X e Y
 * quaisquer correspondentes a duas posições no vetor. Ao final seu programa
 * deverá escrever a soma dos valores encontrados nas respectivas posições X e
 * Y. Se os valores de X e Y estiver fora da faixa de 0 a 11 deverá informar que
 * a posição está errada.
 * 
 * @author thayron
 *
 */
public class Exercicio11 {
	public static void main (String [] argrs) {
		Scanner scan = new Scanner(System.in);
		int vetor[] = new int [12];
		int a, b;
		double soma =0;
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("digite o valor da posição do vetor "+(i));
			vetor[i]=scan.nextInt();

		}
		
		
		System.out.println("digite o primeiro numero");
		a = scan.nextInt();
		System.out.println("digite o segundo numero");
		b = scan.nextInt();
		
		if (a < 0 || b < 0 || a > 11 || b > 11) {
			System.out.println("Você digitou uma posição que não existe no vetor");
			
			return;
		}
		
		soma = vetor[a]+vetor[b];
		System.out.println("soma dos valores encontrados: "+soma);
		scan.close();
		
	}

	private static void extracted() {
		return ;
	}

}
