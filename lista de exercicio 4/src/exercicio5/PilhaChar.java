package exercicio5;

public class PilhaChar {
	private char[] stack;
	private int top;
	private int max;

	public PilhaChar(int tamanho) {
		this.stack = new char[tamanho];
		top = -1;
		this.max = tamanho;

	}
	
	public int top() {
		return top;
	}
	public boolean isFull() {
		return top == max;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(char letra) {
		if (isFull()) {
			System.out.println("A pilha está cheia");
			return;
		}
		top++;
		this.stack[top] = letra;
	}

	public char pop() {
		if (isEmpty()) {
			throw new IllegalAccessError("A pilha está vazia");
		}
		char letra = this.stack[top];
		top--;
		return letra;
	}
	public int length() {
		return this.max;
	}
}
