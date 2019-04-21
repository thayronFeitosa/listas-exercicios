package exercicio10;

import java.util.Scanner;

/**
 * 10) Criar um vetor de Nomes, um de Notas da primeira prova e outro de notas
 * da segunda prova de 7 alunos. Deve existir um vetor media que contenha a
 * média da prova 1 com a prova 2. Imprimir aprovado se a média for maior que 5
 * e reprovado se média for menor ou igual a 5. Imprimir a quantidade de alunos
 * reprovados e a quantidade de alunos aprovados. Exemplo.: As posições fazem
 * menção a um mesmo aluno. Vide exemplo: nomes: [‘Felipe’, ‘Luciano’, ‘Alex’,
 * ...] prova1: [5.6, 4.8, 8.5, ...] prova2: [6.7, 2.9, 7.8, ...] media: [6.1,
 * 3.8, 8.1] Neste exemplo, a primeira posição refere-se ao Felipe que tem nota
 * de prova1 igual a 5.6, nota de prova2 igual a 6.7 e média igual a 6.1.
 * 
 * @author thayron
 *
 */
public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String []nomes = new String[7];
		double []notasn1 = new double[7];
		double []notasn2 = new double [7];
		double []medias = new double [7];
		int alunos =0;
		int reprovados =0;
		int aprovados =0;
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("digte o nome do aluno "+i);
			nomes[i] = scan.next();
			System.out.println("digite a primera nota do aluno "+i);
			notasn1[i] = scan.nextDouble();
			System.out.println("digite a seguda nota do aluno "+i);
			notasn2[i] = scan.nextDouble();
		}
		System.out.println("digite o numero do aluno");
		alunos = scan.nextInt();
		for (int i = 0; i < medias.length; i++) {
			medias[i] = (notasn1[i] +notasn2[i])/2;
		}
		for (int i = 0; i < medias.length; i++) {
			if (medias[i]>= 5) {
				System.out.print("alunos "+nomes[i]+" esta aprovado");
				
			}else {
				System.out.println(" aluno "+ nomes[i]+" está reprovado ");
			}
			
	
		}
		scan.close();
	}

}
