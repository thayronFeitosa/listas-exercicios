package exercicio1;

public class PilhaChar {
	private char []pilha;
	private int top;
	private int max;
	
	public PilhaChar(int tamanho) {
		this.pilha = new char[tamanho];
		
		this.top =-1;
		this.max = tamanho;
	}
	public int top() {
		return top;
	}
	public boolean isFull() {
		return this.top ==this.max;
	}
	public boolean isEmpty() {
		return this.top ==-1;
	}
	
	public void push(char valor) {
		if (isFull()) {
			System.out.println("A pilha está cheia");
			return;
		}else {
			System.out.println("topo e" +top);
			this.top++;
			this.pilha[top] = valor;
		}
	}
	
	public int pop() {
		if (isEmpty()) {
			throw new StackOverflowError("PILHA ESTA VAZIA");
		}
		return pilha[top--];
	}
	
	public int length() {
		return max;
	}
	
	

}
