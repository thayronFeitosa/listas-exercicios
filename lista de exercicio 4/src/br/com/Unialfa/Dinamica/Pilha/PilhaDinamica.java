package br.com.Unialfa.Dinamica.Pilha;

public class PilhaDinamica {
	private No top;
	
	
	public PilhaDinamica() {
		top =null;
	}
	
	public void push(int elemento) {
		No newPilha = new No();
		newPilha.setElemento(elemento);
		newPilha.setProximo(top);
		
		top = newPilha;
	}
	
	public int pop() {
		int elemento = top.getElemento();
		top = top.getProximo();
		return elemento;
		
	}
	public boolean isEmpty() {
		return top == null;
	}
	public void push(String elemento) {
		No newPilha = new No();
		newPilha.setElemento(elemento);
		newPilha.setProximo(top);
		
		top = newPilha;
	}
	public void push(char elemento) {
		No newPilha = new No();
		newPilha.setElemento(elemento);
		newPilha.setProximo(top);
		
		top = newPilha;
	}
}
