package exercicio03;

import java.util.Scanner;

/**
 * 3. Escreva um programa para ler uma temperatura em graus Fahrenheit. Fa�a uma
 * fun��o chamada celsius para calcular e retornar o valor correspondente em
 * graus Celsius. F�rmula: C = ((F-32)/9)*5
 * 
 * @author thayron_PC
 *
 */

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("digite os Fahrenheit para a conver��o em celsius ");
		double Fahrenheit = scan.nextDouble();
		System.out.println(celsius(Fahrenheit));
	}
	
	
	
	
	public static double celsius(double Fahrenheit) {
		
		double graus =((Fahrenheit-32)/9)*5;
		
		return graus;
	}

}
