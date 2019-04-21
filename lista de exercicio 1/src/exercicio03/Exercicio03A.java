package exercicio03;

import java.util.Scanner;

public class Exercicio03A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont, num;
		float media, soma;
		
	System.out.println("digite um numero");
		num = scan.nextInt();
		cont = 0;
		soma =0;
		
		while(num !=0) {
				cont = cont +1;
				soma = soma +num;
				System.out.println("digite um numero inteiro");
				num = scan.nextInt();
				
				
		}
		media = soma/cont;
		System.out.println("madia: "+media);
		scan.close();
	}

}
