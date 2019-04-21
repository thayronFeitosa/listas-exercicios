package exercicio1;

public class PilhaString {
	private String []pilha;
	private int top;
	private int max;
	
	public PilhaString(int tamanho) {
		this.pilha = new String[tamanho];
		this.top =-1;
		this.max = tamanho;
	}
	
	public boolean isEmpty() {
		return this.top == -1;
	}
	public boolean isFull() {
		return top == max;
	}
	
	public void push(String novo) {
		if (isFull()) {
			System.out.println("pilha cheia");
			throw new StackErro();
		}
		top++;
		this.pilha[top] = novo;
		
	}
	public String pop() {
		String a;
		if (isEmpty()) {
			System.out.println("Pilha está vasia");
			throw new StackErro();
		}
		a = pilha[top];
		top--; 
		return a;
	}
	public String topo() {

		return pilha[top];
	}

}
