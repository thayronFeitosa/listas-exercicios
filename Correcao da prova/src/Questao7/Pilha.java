package Questao7;

public class Pilha{



private char[] stack;
private int top;
private int max;

public Pilha(int size) {
	this.stack = new char[size];
	this.top = -1;

}

public void create(int rize) {
	this.top = -1;
	this.stack = new char[rize];
	this.max = rize - 1;
}

/**
 * 
 * @return o valor do topo
 */
public char pop() {
	if (isEnpty()) {
		return 'a';
	}
	this.top--;
	return this.stack[top];
	
}

/**
 * 
 * @return true se a pilha estiver vasia
 */
public boolean isEnpty() {
	return this.top == -1;
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
public void push(char valuer) {
	if (isFull()) {
		System.out.println("Pilha cheia");
		return;
	}
	this.top++;
	this.stack[top] = valuer;
}}