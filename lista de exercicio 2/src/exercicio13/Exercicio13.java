package exercicio13;
import java.util.Random;
import java.util.Scanner;
/**
 * 12. Escreva um programa que crie um vetor de 15 posições e apresente o seguinte
menu:
********************************************************************** *
Opções:
1. Maior elemento
2. Menor elemento
3. Média Aritmética
4. Número de ocorrências
5. Soma de Todos os elementos
6. Multiplicação de todos os elementos
7. Ordenar Vetor crescente
8. Ordenar Vetor decrescente
9. Criar novo vetor
10. Sair do programa
*********************************************************************
Cada item do menu deve chamar uma função diferente, passando um vetor por
parâmetro (exceção item 10 que não precisa de parâmetro). O programa só encerra
se o usuário selecionar o item 10 no menu.
Explicação de cada item do menu:
1. passa vetor por parâmetro e retorna um número inteiro
2. passa vetor por parâmetro e retorna um número inteiro
3. passa vetor por parâmetro e retorna um número inteiro
4. Além de passar o vetor por parâmetro, deverá passar um número inteiro por
parâmetro junto. A função deverá verificar a quantidade de ocorrências que
determinado número (passado por parâmetro) se repete. Retorna a quantidade de
ocorrências encontrado
5. passa vetor por parâmetro e retorna um número inteiro
6. passa vetor por parâmetro e retorna um número inteiro
7. passa vetor por parâmetro e retorna o vetor ordenado
8. passa vetor por parâmetro e retorna o vetor ordenado
9. limpa vetor e cria um novo vetor
10. encerra programa
 * @author thayron
 *
 */

public class Exercicio13 {	
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int numero =0;
	int vetor[] = new int[15];
	do {
		System.out.println("------DIGITE------\n1. Maior elemento\n" + 
				"2. Menor elemento\n" + 
				"3. Média Aritmética\n" + 
				"4. Número de ocorrências\n" + 
				"5. Soma de Todos os elementos\n" + 
				"6. Multiplicação de todos os elementos\n" + 
				"7. Ordenar Vetor crescente\n" + 
				"8. Ordenar Vetor decrescente\n" + 
				"9. Criar novo vetor\n" + 
				"10. Sair do programa");
		numero = scan.nextInt();
		}while(numero!=10);
	
	
	criarVetor(vetor);
	mostarVetorTeste(vetor);
	System.out.println();
	System.out.println("O maior elemento do vetor randomico é: "+maiorElemento(vetor));
	System.out.println("O menor elemento do vetor rancomico é: "+menorElemento(vetor));
	System.out.println("A medias dos valors do vetor e de: "+ media(vetor));
	System.out.println("o numero de vesez que um numero se repete e: "+ocorrencia(3, vetor));
	System.out.println("A soma dos valores do vetor e de: "+somaVetor(vetor));
	System.out.println("A multiplicação de todas as posições do vetor e de: "+multipicacao(vetor));
	System.out.println("o vetor na ordem crescente é: ");ordemCrescente(vetor);
	System.out.println("O vetor na ordem decrescete e: ");ordemDecrescente(vetor);
	
}
public static void mostarVetorTeste(int vetor[]) {
	for (int i = 0; i < vetor.length; i++) {
		System.out.print(vetor[i]+" | ");
	}
}
	
	public static void criarVetor(int vetor[]) {
		Scanner scan = new Scanner (System.in);
		Random r = new Random();
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt(10);
		}
		System.out.println("vetor criado com sucesso no metoso criar");
		
	}
	public static int maiorElemento(int []vetor ){
		int cont =0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]>cont) {
				cont = vetor[i];
			}
			}
		return cont;
		
	}
	public static int menorElemento(int []vetor) {
		int cont =0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]<cont) {
				cont = vetor[i];
			}
		}
		return cont;
	}
	
	public static int media(int []vetor) {
		int cont =0;
		for (int i = 0; i < vetor.length; i++) {
			cont += vetor[i];
		}
		return cont/15;
	}
	public static int ocorrencia(int numero, int vetor[] ){
		int cont =0;
	for (int i = 0; i < vetor.length; i++) {
		if (vetor[i]==numero) {
			cont ++;
		}
	}	
	return cont;
	}
	public static int somaVetor(int vetor[]) {
		 int soma =0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}
	
	public static int multipicacao(int vetor[] ){
		int soma =0;
		for (int i = 0; i < vetor.length; i++) {
			soma +=(vetor[i]*vetor[i]);
			
		}
		return soma;
	}
	public static void ordemCrescente(int vetor[]) {
		int cont =0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i]<vetor[j]) {
					cont = vetor[i];
					vetor[i] = vetor[j];
					vetor[j]= cont;
				}
			}
			
		}
		System.out.println("vetor ordenado na ordem Crescente");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" | ");
		}
	}
	public static void ordemDecrescente(int vetor[]) {
		int cont =0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i]>vetor[j]) {
					cont = vetor[i];
					vetor[i] = vetor[j];
					vetor[j]= cont;
				}
			}
			
		}
		System.out.println("vetor ordenado na ordem Decresente");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" | ");
		}
	}
	
	public static void novoVetor(int vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]!=0) {
				vetor[i] =0;
			}
		}
		int vetorNovo [] = new int [15];
		criarVetor(vetorNovo);
		for (int i = 0; i < vetorNovo.length; i++) {
			System.out.print(vetorNovo[i]+" | ");
		}
	}
	

}
