package exercicio2;


import exercicio1.Pilha;

public class Programa {
	public static void main(String[] args) throws Exception {
		
		Exercicio2 exercicio2 = new Exercicio2();
		Pilha pilha1 = new Pilha(5);
		Pilha pilha2 = new Pilha(5);
		pilha1.push(4);
		pilha1.push(3);
		pilha1.push(6);
		pilha1.push(2);
		pilha1.push(3);
		pilha1.pop();

		pilha2 = exercicio2.transferrirElementosPilha(pilha1);

		System.out.println("pilha1");
		while (!pilha1.isEmpty()) {
			System.out.println(pilha1.pop());
		}
		System.out.println("pilha2");
		while (!pilha2.isEmpty()) {
			System.out.println(pilha2.pop());
		}
	}


}
