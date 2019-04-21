package br.com.unialfa.torreDeHanoi;

public class Programa {
	public static void main(String[] args) {
		Pilha p = new Pilha(5);
		p.push(5);
		p.push(4);
		p.push(3);
		p.push(2);
		p.push(1);
		p.push(3);
		
		while(!p.isEmpty()) {
			int elementos = p.pop();
			System.out.println("desenpihei "+elementos);
		}
	}

}
