package exercicio13;

import java.util.Scanner;

import exercicio01.Exercicio01;

public class Main {
	public static void main(String[] args) {

		Exercicio13 a = new Exercicio13();
		Scanner scan = new Scanner(System.in);
		System.out.println("digite a cidade atual");
		int cidade1 = scan.nextInt();
		System.out.println("digite a cidade de destino ");
		int cidade2 = scan.nextInt();

		
		
		scan.close();
	}

}
