package br.com.Unialfa.Dinamica.Pilha;

public class No {
	
	private int elemento;
	@SuppressWarnings("unused")
	private String elemento1;
	@SuppressWarnings("unused")
	private char elemento2;

	private No proximo;
	
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	public int getElemento() {
		return elemento;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	public No getProximo() {
		return proximo;
	}
	public void setElemento(String elemento) {
		this.elemento1 = elemento;
	}
	public void setElemento(char elemento) {
		this.elemento2 = elemento;
	}
	
	
	

}
