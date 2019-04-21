package Exercicio2;

public class Matriz {

	private int vetorA[];
	private int vetorB[];

	public Matriz(int a, int b) {
		this.vetorA = new int[a];
		this.vetorB = new int[b];
	}

	public int[] uniao() {
		int[] vetorUniao = new int[this.vetorA.length + this.vetorB.length];

		for (int i = 0; i < vetorUniao.length; i++) {
			if (vetorA[i] == i) {
				vetorUniao[i] = vetorA[i];
			}
			if (vetorA[i] > i) {
				vetorUniao[i] = vetorB[i];
			}

		}
		return vetorUniao;

	}

	public void insertA(int valor, int posicao) {
		this.vetorA[posicao] = valor;
	}

	public void insertB(int valor, int posicao) {
		this.vetorB[posicao] = valor;
	}

	public void removeA(int posicao) {
		this.vetorA[posicao] = 0;
	}

	public void removeB(int posicao) {
		this.vetorB[posicao] = 0;
	}

	public void intersecao() {
		int vetor[] = null;

		if (this.vetorA.length >= this.vetorB.length) {
			vetor = new int[vetorB.length];
		} else if (this.vetorA.length <= this.vetorB.length) {
			vetor = new int[vetorA.length];
		}
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if (this.vetorA[i] == this.vetorB[j] && vetor[i]!=vetorA[i] && vetor[j]!= vetorB[j]) {
					vetor[i] = vetorB[i];
				}
			}

		}
		System.out.println("\nvetor");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " | ");
		}
		System.out.println("\nvetor A");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " | ");
		}System.out.println("\nVetor B");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+" | ");
		}

	}
}
