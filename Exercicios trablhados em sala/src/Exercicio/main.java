package Exercicio;

import Exercicio2.Matriz;

public class main {

	public static void main(String[] args) {
		Matriz m = new Matriz(3, 3);
		
		m.insertA(2, 0);
		m.insertA(2, 1);
		m.insertA(2, 2);
		
		m.insertB(3, 0);
		m.insertB(2, 1);
		m.insertB(1, 2);
		
		m.intersecao();
		
	}

}
