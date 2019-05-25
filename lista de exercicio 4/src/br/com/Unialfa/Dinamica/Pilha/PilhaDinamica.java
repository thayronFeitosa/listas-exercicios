package br.com.Unialfa.Dinamica.Pilha;

import java.util.EmptyStackException;

public class PilhaDinamica<T> {
	private No<T> topo;
	private int tamanho;
	
	
	public PilhaDinamica() {
		this.topo = new No<T>();
		this.tamanho =0;
	}
	
	public void push(T valor) {
	No<T> novoNo = new No<T>();
	novoNo.setValor(valor);
	novoNo.setNoProximo(this.topo.getNoProximo());
	this.topo.setNoProximo(novoNo);
	tamanho++;
	}
	
	
	public boolean isEmpty() {
		return tamanho == 0;
	}

	public T pop() throws Exception {
		if (isEmpty()) {
			throw new EmptyStackException();
		}else {
			No<T> noReturn = topo.getNoProximo();
			topo.setNoProximo(noReturn.getNoProximo());
			tamanho--;
			return noReturn.getValor();
		}
	}
	public static void main(String[] args) throws Exception {
		PilhaDinamica<Integer> pilhaD = new PilhaDinamica<Integer>();
		pilhaD.push(5);
		pilhaD.push(4);
		pilhaD.push(3);
		pilhaD.push(2);
		pilhaD.push(1);
		pilhaD.push(9);
		
		while(!pilhaD.isEmpty()) {
			System.out.println(pilhaD.pop());
		}
	
	}

}
