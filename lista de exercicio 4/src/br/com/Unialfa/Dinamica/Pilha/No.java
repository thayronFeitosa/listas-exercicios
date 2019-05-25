package br.com.Unialfa.Dinamica.Pilha;



public class No<T> {
	private No<T> proximo;
	private T valor;

	public void create(T valor) {
		this.valor = valor;
		this.proximo = new No<T>();
	}

	public void setNoProximo(No<T> proximo) {
		this.proximo = proximo;
	}

	public No<T> getNoProximo() {
		return proximo;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

}
