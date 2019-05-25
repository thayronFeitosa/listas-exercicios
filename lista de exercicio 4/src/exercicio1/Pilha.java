package exercicio1;

public class Pilha {
	private int[] stack;
	private int top;

	public Pilha(int size) {
		this.stack = new int[size];
		this.top = -1;
	}

	public boolean isfull() {
		return this.top == this.stack.length - 1;
	}

	public boolean isEmpty() {
		return this.top == -1;
	}

	public void push(int value) throws Exception {
		if (isfull()) {
			throw new Exception("the stack is full");
		}
		if (isEmpty()) {
			this.top++;
			this.stack[top] = value;
		} else {
			this.top++;
			this.stack[top] = value;
		}
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("the stack is empty");
		} else {
			int aux = stack[top];
			top--;
			return aux;
		}
	}

	public void order() {
		int aux = 0;
		for (int i = 0; i < stack.length; i++) {
			for (int j = 0; j < stack.length; j++) {
				if (stack[i] < stack[j]) {

					aux = stack[i];
					stack[i] = stack[j];
					stack[j] = aux;
				}
			}
		}

	}

	public int length() {
		return this.stack.length;
	}

	public static void main(String[] args) throws Exception {
	}

}
