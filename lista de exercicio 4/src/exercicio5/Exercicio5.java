package exercicio5;

import java.util.Scanner;

/*
 * Escreva um programa solicite ao usuario uma sequencia de caracteres sem limite de maximo de tamanho e realise as seguintes operações usando uma pilha.:
 * A: imprimir o texto na ordem inversa 
 * B: verificar se o texto e um polindromo, seja se a string e escreita da mesma maneira de trás para frente. ignotando os espações e pontos
 */

/**
 * Método Polidromo verifica se qualquer frase e polidromo (são desconsiderados
 * os espaços, vírgulas, pontos e as cachas altas)
 * 
 * @author thayron
 *
 */
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite uma frase com espaços, pontos e virgulas");

		String string = scan.nextLine();

		Exercicio5 a = new Exercicio5();
		System.out.println(a.polidromo(string));
		scan.close();

	}

	public boolean polidromo(String palavra) {
		String tirarPontos = palavra.replace(".", "");
		String tirarVirgulas = tirarPontos.replace(",", "");
		String tirarEspacos = tirarVirgulas.replace(" ", "");
		String frasechar = tirarEspacos.toLowerCase();
		int tamanhoDaPilha = tirarEspacos.length();

		PilhaChar pilhaChar = new PilhaChar(tamanhoDaPilha);
		PilhaChar pilhaCharAux = new PilhaChar(tamanhoDaPilha);
		PilhaChar pilhaCharCoChar = new PilhaChar(tamanhoDaPilha);

		for (int i = 0; i < tamanhoDaPilha; i++) {
			pilhaChar.push(frasechar.charAt(i));
			pilhaCharCoChar.push(frasechar.charAt(i));

		}

		while (!pilhaChar.isEmpty()) {
			pilhaCharAux.push(pilhaChar.pop());
		}
		int valida = 0;
		while (!pilhaCharAux.isEmpty()) {
			if (pilhaCharAux.pop() == pilhaCharCoChar.pop()) {
				valida++;
			}
		}

		return valida == tamanhoDaPilha;

	}

}
