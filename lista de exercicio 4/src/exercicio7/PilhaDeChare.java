package exercicio7;

public class PilhaDeChare {
	private int top;
	private int max;
	private char []pilha;
	
	public PilhaDeChare(int tamanho) {
		this.pilha = new char[tamanho];
		top =-1;
		this.max = tamanho;
	}
	
	public boolean isEmpty() {
		return top ==-1;
	}
	
	public boolean isFull() {
		return top ==this.max;
	}
	public void push(char valor) {
		if (isFull()) {
			System.out.println("A pilha está cheia");
			return;
		}
		top++;
		this.pilha[top] = valor;
	}
	public char top() {
		char aux = this.pilha[top];
		return aux;
	}
public char pop() {
	char valor;
	if (isEmpty()) {
		System.out.println("A pilha está vazia");
		throw new IllegalAccessError();
	}
	valor = pilha[top];
	top --;
	
	return valor;
}
}
