package exercicio4;

import exercicio1.Pilha;

public class Programa {
	public static void main(String[] args) throws Exception {
		Pilha p1 = new Pilha(4);
		Exercico4 ex = new Exercico4();
		p1.push(1);
		p1.push(2);
		p1.push(3);
		p1.push(4);
		
		p1 = ex.inverterPosicaoDaPilha(p1);
		
		while(!p1.isEmpty()) {
			int a = p1.pop();
			System.out.println(a);
		}
	}
}
