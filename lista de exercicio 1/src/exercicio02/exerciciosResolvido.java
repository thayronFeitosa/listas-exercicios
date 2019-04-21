package exercicio02;
/**
 * 2) Faça um programa para ler dois números reais e verificar se ambos são maiores que zero.
Caso positivo, informar “Valores são válidos”. Caso contrário, informar “Valores inválidos”.
 */

import java.util.Scanner;

public class exerciciosResolvido {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double a = 0;
		double b = 0;

		System.out.println("digite o numerador");
		a = scan.nextDouble();
		System.out.println("digite o divisor");
		b = scan.nextDouble();

		if (a > 0 && b > 0) {
			System.out.println("vaores validos");
		} else {
			System.out.println("valores invalidos");
		}
		
scan.close();
	}
}
