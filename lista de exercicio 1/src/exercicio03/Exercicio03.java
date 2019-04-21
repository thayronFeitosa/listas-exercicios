package exercicio03;

import java.util.Scanner;

public class Exercicio03 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	
	int num, quadrado;
	System.out.println("digite um numero inteiro");
	num = scan.nextInt();
	
	while(num!=0) {
		
		quadrado = num* num;
		num--;
		
		System.out.println("O quadrado de "+(num+1)+" e de "+quadrado);
		System.out.println("digite um numero inteiro");
		num = scan.nextInt();		
	}

	
scan.close();	
}
}
