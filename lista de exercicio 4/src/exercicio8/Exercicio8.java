package exercicio8;


import exercicio1.PilhaString;

/**
 * 8. Considero que um estacionamento da Rua Direita, em Ouro Preto, é composto
 * por uma única alameda que guarda até dez carros. Existe apenas uma
 * entrada/saída no estacionamento, e esta extremidade da alameda dá acesso
 * justamente à Rua Direita. Se chegar um cliente para retirar um carro que não
 * seja o mais próximo da saída, todos os carros bloqueando seu caminho sairão
 * do estacionamento. O carro do cliente será manobrado para fora do
 * estacionamento, e os outros carros voltarão a ocupar a mesma sequência
 * inicial. Escreva um programa que processe um grupo de linhas de entrada. Cada
 * linha de entrada contém um ‘E’, de entrada, ou um ‘S’ de saída, e o número da
 * placa do carro. Presume-se que os carros cheguem e partam na mesma ordem que
 * entraram no estacionamento. O programa deve imprimir uma mensagem sempre que
 * um carro chegar ou sair. Quando um carro chegar, a mensagem deve especificar
 * se existe ou não vaga para o carro no estacionamento. Se não houver vaga, o
 * carro partirá sem entrar no estacionamento. Quando um carro sair do
 * estacionamento, a mensagem deverá incluir o número de vezes em que o carro
 * foi manobrado para fora do estacionamento para permitir que os outros carros
 * saíssem
 * 
 * @author thayron
 *
 */

public class Exercicio8 {
	private String carro;
	private int cont;
	private PilhaString pilha = new PilhaString(10);

	public void setEstacionar(String placa) {
		this.pilha.push(placa);
	}
	
	public String settRetirarCarro(String retirar) {
	PilhaString pilhaAux = new PilhaString(10);
	
	while(!pilha.isEmpty()&&!pilha.topo().equals(retirar)) {
		String aux = pilha.pop();
			pilhaAux.push(aux);
			cont++;
			
		
		
	}
	while(!pilhaAux.isEmpty()) {
		pilha.push(pilhaAux.topo());
		}
	return "pode sair";
	}
	
	public static void main(String[] args) {
		Exercicio8 a = new Exercicio8();
		a.setEstacionar("aa-bb");
		a.setEstacionar("a2-bb");
		a.setEstacionar("aa-b2");
		
		a.settRetirarCarro("a2-bb");
	}
}
