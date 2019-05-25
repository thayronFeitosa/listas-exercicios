package exercicio2;


import exercicio1.Pilha;

/**
 * Desenvolva uma operação para transferrir elementos de uma pilha P1 para uma
 * Pilha P2(Copia).
 * 
 * @author thayron
 *
 */
public class Exercicio2 {

	public Pilha transferrirElementosPilha(Pilha pilha1) throws Exception {
		int aux[] = new int[pilha1.length()];
		int a = 0;
		Pilha pilhaCopia = new Pilha(pilha1.length());
		
		
		while (!pilha1.isEmpty()) {
			aux[a++] = pilha1.pop();
		}

		a = aux.length;
		while (a > 0) {
			pilhaCopia.push(aux[--a]);

		}
		a = aux.length;

		while (a > 0) {
			pilha1.push(aux[--a]);
		}

		return pilhaCopia;
	}

	public void VerPilha(Pilha pilha) throws Exception {
		while (!pilha.isEmpty()) {
			int a = pilha.pop();
			System.out.println(+a);
		}
	}

	
}
