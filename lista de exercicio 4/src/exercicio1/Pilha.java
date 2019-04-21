package exercicio1;

public class Pilha {
	private int []pilha;
	private int top;
	private int max;
	
	public Pilha(int tamanho) {
		this.pilha = new int[tamanho];
		
		this.top =-1;
		this.max = tamanho;
	}
	public boolean isFull() {
		return this.top ==this.max;
	}
	public boolean isEmpty() {
		return this.top ==-1;
	}
	
	public void push(int valor) {
		if (isFull()) {
			System.out.println("A pilha está cheia");
			return;
		}else {
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
