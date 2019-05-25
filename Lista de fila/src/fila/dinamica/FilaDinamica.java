package fila.dinamica;

import java.util.EmptyStackException;
/**
 * Fila dinamica usando estrutura generica
 * @author thayron
 *
 * @param <T>
 */
public class FilaDinamica<T> {
	private No<T> iniciar;
	private int tamanho;

	public void create() {
		this.iniciar = new No<T>();
		this.tamanho = 0;
	}

	public boolean isEmpty() {
		return this.tamanho == 0;
	}

	public void enfileirar(T valor) {
		No<T> novoNo = new No<T>();
		novoNo.setValor(valor);

		No<T> aux = this.iniciar;
		while (aux.getNoProximo() != null) {
			aux = aux.getNoProximo();
		}
		aux.setNoProximo(novoNo);
		tamanho++;
	}

	public T desenfileirar() throws Exception {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		No<T> aux = this.iniciar.getNoProximo();
		T valor = aux.getValor();
		this.iniciar.setNoProximo(aux.getNoProximo());
		this.tamanho--;
		return valor;
	}


}
