package Questao6;

import java.util.Scanner;

import Questao7.Pilha;

public class Questao6 {
	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt(30);
		Scanner scan = new Scanner(System.in);

		int valor = 0;
		System.out.println("digite");

		for (int i = 0; i < 30; i++) {
			valor = scan.nextInt();
			if (valor % 2 == 0) {
				pilha.push(valor);
			} else {
				pilha.pop();
			}
			
		}
		while (!pilha.isEnpty()) {
		
			int a = pilha.pop();
			System.out.println( "pilha: "+a);
		}

	}

}
