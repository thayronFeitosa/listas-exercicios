package exercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1) Faça um programa para ler dois números reais, faça a divisão do primeiro
 * número pelo segundo (se o segundo for diferente de zero).
 * 
 * @author thayron
 *
 */
public class exercicio01 {
	public static void main(String[] args) {
		System.out.println(dividir());
	}

	public static double dividir()  {
		Scanner scan = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double valor = 0;
		boolean status = true;
		do {
		try {
			System.out.println(" digite o um numerador");
			a = scan.nextDouble();
			System.out.println("digite o divisor");
			b = scan.nextDouble();
			if (b<=0) {
				throw new IllegalArgumentException();
			}
			valor = a/b;
			status = true;
			
		}catch(IllegalArgumentException e) {
			System.out.println("voce nao pode dividir um numero por zero!\nTente fazer a peração novamente!");
			scan.nextLine();
			status = false;
		}catch(InputMismatchException e) {
			System.out.println("algo de errado ocorreu! tente novamente");
	scan.nextLine();
	status = false;
			
		}
			} while (status==false);
		scan.close();
		return valor; 

	}

}
