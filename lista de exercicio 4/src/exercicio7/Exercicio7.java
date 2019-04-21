package exercicio7;


/*
 * escreva um programa para verificar se uma expreção matematica tem os parenteses agrupados de forma correta 
 * isto é, (1)se o número de parênteses á esquerda e a direita são iguais e: (2) se todos os parenteses abertos postriormente eseguido 
 * por um fechaamento de parenteses:
 * EX1: as espressoes ((A+B) ou (A+B violam a condição 1
 * EX2: as exprssoes )A+B (-C ou (A+B)) - (C+D violam a condição 2
 */
public class Exercicio7 {
	
	private int max;
	
	public void verificarExeprecaoMatematica(String condicao) {
		
		this.max = condicao.length();
		PilhaDeChare pilha1 = new PilhaDeChare(max);
		PilhaDeChare pilha2 = new PilhaDeChare(max);
		 int aux = this.max;
		 
		 for (int i = 0; i < aux; i++) {
			 while(condicao.charAt(i)=='(') {
					char valor = pilha2.pop();
					if (valor =='(') {
						pilha1.push('(');
					}else if(valor ==')') {
						pilha1.push('(');
					}
				}			 
			
		}
		 
		
		
		
		while (pilha1.top()==')') {
			pilha1.pop();
		}
		
		
		
	}
	


}
