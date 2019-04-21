package exercicio3;

import exercicio1.Pilha;
// * Desenlvova um algoritimo para testar de duas pilhas P1 e P2 são iguas. Duas pilhas são iguais se possuirem os mesmos elementos nas mesma ordem

/**
 * 
 * obs: se as pilhas não forem do mesmo tamanho logo será false. caso elas sejam
 * do mesmo tamanho será comparado posição a posição e retornará true se forem
 * todas as posiçõaes iguais
 * 
 * @author thayron
 *
 */
public class Exercicio3 {

	public boolean PilhaEquals(Pilha P1, Pilha P2) {

		int[] P1Aux = new int[P1.length()];
		int[] P2Aux = new int[P2.length()];
		int cont = P1.length();

		if (P1.length() > P2.length() || P1.length() < P2.length())
			return false;
		cont = 0;
		while (!P1.isEmpty()) {
			P1Aux[cont] = P1.pop();
			cont++;
		}
		cont = 0;
		while (!P2.isEmpty()) {
			P2Aux[cont] = P2.pop();
			cont++;
		}
		cont = 0;
		for (int i = 0; i < P2Aux.length; i++) {
			if (P1Aux[i] == P2Aux[i]) {
				cont++;
			}
		}
		if (cont == P1.length())
			return true;

		else
			return false;

	}

}
