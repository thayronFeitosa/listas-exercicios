package exercicio3;

import exercicio1.Pilha;

public class Porgrama {
	public static void main(String[] args) throws Exception {
		Pilha P1 = new Pilha(2);
		Pilha P2 = new Pilha(2);
		P1.push(2);
		P1.push(1);
		P2.push(2);
		P2.push(1);

		Exercicio3 compara = new Exercicio3();
		System.out.println(compara.PilhaEquals(P1, P2));
	}
}
