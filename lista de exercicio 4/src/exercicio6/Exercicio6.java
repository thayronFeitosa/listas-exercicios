package exercicio6;

import java.util.Scanner;

import exercicio1.Pilha;

/*
 * ultilizando pilha, escreva um metodo um metodo que receba um numeto inteiro positivo no 
 * formato decimal e converta esse numero para o formato binario
 */
public class Exercicio6 {

	public void converterDecinalEmBinario(int numero) throws Exception {
		int valor = +numero;
		Pilha pilha = new Pilha(tamanhoDaPilha(numero));
		boolean status = false;
		while (status == false) {
			int aux = valor / 2;

			int aux2 = valor - (aux * 2);
			valor = aux;

			if (valor == 0) {
				status = true;
			}
			pilha.push(aux2);

		}
		System.out.print("A converçao de " + numero + " para binario é de: ");
		while (!pilha.isEmpty()) {
			int a = pilha.pop();
			System.out.print(a + " ");
		}
	}

	private int tamanhoDaPilha(int tamanho) {
		boolean status = false;

		int cont = 0;
		while (status == false) {
			int aux = tamanho / 2;

			tamanho = aux;

			if (tamanho == 0) {
				status = true;
			}
			cont++;

		}
		return cont;
	}

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite um numero decimal para a converção em binario: ");
		int numero = scan.nextInt();
		Exercicio6 a = new Exercicio6();
		a.converterDecinalEmBinario(numero);
		scan.close();
	}

}
