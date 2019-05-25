package exercicio4;

import exercicio1.Pilha;

//desenvolva um algoritimo para inverter o posição dos elementos de uma pilha P. voce pode 

//criar pilhas auxiliares, se necessario. mas o resultado devera ser dado na pilha P
/**
 * inverter os valores de uma pilha usando a clase Pilha
 * @author thayron
 *
 */

public class Exercico4 {
	
	public Pilha inverterPosicaoDaPilha(Pilha p1) throws Exception {
		
		Pilha pilhaAux = new Pilha(p1.length());
		
		while(!p1.isEmpty()) {
			pilhaAux.push(p1.pop());
		}
		
		return pilhaAux;
	}	
	
	

}
