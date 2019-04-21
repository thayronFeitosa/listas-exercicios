package br.com.unialfa.torreDeHanoi;

public class Pilha {
	private int top;
	private int max;
	private int []pilha;
	
	
	public Pilha(int tamanho) {
		this.pilha = new int [tamanho];
		this.top =-1;
		this.max = tamanho;
	}
	
	public boolean isFull() {
		return top == max-1;
	}
	public boolean isEmpty() {
		return top ==-1;
	}
	
	public void push(int valor) {
		if (isFull()) {
			System.out.println("A pilha está cheia ");
			return;
		}else {
			top++;
			this.pilha[top]=valor;
		}
	}
	public int pop() {
		int aux =0;
		if(isEmpty()) {
			System.out.println("a pilha esta vazia");
			return top;
		}else {
			aux = this.pilha[top];
			top--;
		}
		return aux;
	}

}
