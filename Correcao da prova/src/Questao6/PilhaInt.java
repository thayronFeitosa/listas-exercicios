package Questao6;

public class PilhaInt{



private int[] stack;
private int top;
private int max;

public PilhaInt(int size) {
	this.stack = new int[size];
	this.top = -1;

}

public void create(int rize) {
	this.top = -1;
	this.stack = new int[rize];
	this.max = rize - 1;
}

/**
 * 
 * @return o valor do topo
 */
public int pop() {
	if (isEnpty()) {
		System.out.println("pilha esta no fim");
		return 0;
	}
	this.top--;
	return this.stack[top];
}

/**
 * 
 * @return true se a pilha estiver vasia
 */
public boolean isEnpty() {
	return this.top == 0;
}

/**
 * 
 * @return true se a pilha estiver cheia
 */
public boolean isFull() {
	return this.top == this.stack.length - 1;
}

/**
 * verifica se a pilha está cheia caso contratio insere o valor na pilha
 * 
 * @param valuer valor a ser inserido na pilha
 */
public void push(int valuer) {
	if (isFull()) {
		System.out.println("Pilha cheia");
		return;
	}
	this.top++;
	this.stack[top] = valuer;
}}