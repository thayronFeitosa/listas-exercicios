package exercicio08;

import java.util.Scanner;

/**
 * 8. Escreva uma função que lê um caractere digitado pelo usuário e retorna
 * este caractere somente se ele for igual a 'S' ou 'N'. Se o caractere não for
 * nem 'S' nem 'N', a função imprime a mensagem 'Caractere inválido. Digite
 * novamente'. Use esta função em um programa que fica lendo do usuário um
 * número qualquer e imprime este número ao cubo na tela. O programa deve ficar
 * lendo os números até o usuário responder 'N' à pergunta se ele deseja
 * continuar ou não.
 * 
 * @author thayron_PC
 *
 */
public class Exercicio8 {

	public static void main(String[] args) {
		numeroAoQuadrado();

	}

	public static void numeroAoQuadrado() {
		Scanner scan = new Scanner(System.in);
		double valor, soma;
		int contador = 3;
		String condition = "s";

		do {
			System.out.println("Digite S para continuar ou N para sair");
			condition = scan.next();
			if (condition.equalsIgnoreCase("n")) {
				condition = "n";
				System.out.println("encerrando programa...");
			} else if (!condition.equalsIgnoreCase("s") || condition.equalsIgnoreCase("n")) {
				System.out.println("Caracter inválido. Digite novamente");
				scan.nextLine();
				condition = "s";
			}else {
				soma = 1;
				contador =3;
			System.out.println("Digite um numero");
			valor = scan.nextDouble();
			while (contador > 0) {

				soma *= valor;
				contador--;
			}
			System.out.println("O valor ao cubo e: " + soma);
			}

		} while (condition.equalsIgnoreCase("s"));
System.out.println("programa encerrado");
	}

}
