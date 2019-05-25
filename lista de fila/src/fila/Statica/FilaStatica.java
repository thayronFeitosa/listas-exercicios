package fila.Statica;

import java.util.EmptyStackException;

public class FilaStatica {
	private int[] fila;
	private int primeiro;
	private int ultimo;
	private int quantidade;

	public void create(int tamanho) {
		this.fila = new int[tamanho];
		this.primeiro = 0;
		this.ultimo = 0;
		this.quantidade = 0;
	}

	public boolean isFull() {
		return this.quantidade == fila.length;
	}

	public boolean isEmpty() {
		return this.quantidade == 0;
	}

	public void enfileirar(int valor) throws Exception {
		if (isFull()) {
			throw new Exception("the stack is full");
		}
		if (this.quantidade == 0) {
			this.fila[primeiro] = valor;
			this.quantidade++;
			return;
		}
		this.ultimo++;
		if (this.ultimo == this.fila.length) {
			this.ultimo = 0;
		}
		this.fila[ultimo] = valor;
		this.quantidade++;
	}

	public int desenfileirar() throws Exception {
		if (isEmpty()) {
			System.err.println("the stack is Empty");
			throw new EmptyStackException();
		}
		int aux = this.fila[this.primeiro];
		if (this.quantidade == 1) {
			this.quantidade--;
			return aux;
		}
		this.primeiro++;
		if (this.primeiro == this.fila.length) {
			this.primeiro = 0;
		}
		this.quantidade--;
		return aux;
	}

	public int length() {
		return this.fila.length;
	}
	
	

	
}
