package Questao7;

import java.util.Scanner;


public class Questao7 {
	public static void main(String[] args) {
		String frase = new String();
		Scanner scan = new Scanner (System.in);
		System.out.println("digita ");
		frase = scan.next();
		Pilha pilha1 = new Pilha(frase.length());
		Pilha pilha2 = new Pilha(frase.length());
		char []aux = new char[frase.length()];
		for (int i = 0; i < frase.length(); i++) {
			pilha1.push(frase.charAt(i));
			aux[i] = frase.charAt(i);
		}
		int cont =0;
		System.out.println("pilha1");
		for (int i = 0; i < aux.length; i++) {
		System.out.print(aux[i]);
		}
		System.out.println("\npilha2");
		
		for (int i = 0; i < frase.length(); i++) {
			if (aux[i]==pilha2.pop()) {
				char a = pilha2.pop();
			}
		}
	
		

	}
	

}
