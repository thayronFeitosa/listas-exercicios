package exercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 10. Faça um programa de calculadora simples, que peça dois números ao usuário
 * e pergunte qual das seguintes operações deseja realizar: adição, subtração,
 * multiplicação ou divisão. O programa inicia apresentando ao usuário um menu
 * de opções como mostrado abaixo: * Calculadora. Digite: 1. Adição 2. Subtração
 * 3. Multiplicação 4. Divisão 5. Sair do programa *
 * 
 * Entre com sua opção: Crie uma função que apresenta o menu inicial acima e
 * retorna a opção do usuário para o programa principal. Esta opção é então
 * analisada e o programa principal chama as funções de adição, subtração,
 * multiplicação e divisão conforme a opção do usuário. Se a opção for inválida,
 * informe ao usuário e peça a ele para entrar com uma opção válida. Após a
 * execução da operação o programa volta a apresentar o menu inicial até que o
 * usuário encerre o programa com a opção 5. OBS.: Não existe número divisível
 * por 0.
 * 
 * @author thayron_PC
 *
 */

public class Exercicio10 {
	public static void main(String[] args) {
		calculadora();
	}

	public static int menu() {

		Scanner scan = new Scanner(System.in);
		int condition;
		boolean status = false;
		
		System.out.println("-----------MENU----------\nDigite: 1 Para Adição\nDigite: 2 Para Subtração\nDigite: 3"
				+ " Multiplicação\nDigite: 4 Para Divisão\nDigite: 5 Sair da calculadora ");

		do {
			condition = scan.nextInt();
			if (condition < 1 || condition > 5) {
				System.out.println("NUMERO INCORRETO. DIGITE NOVAMENTE O NUMERO");
				scan.nextLine();
				status = true;

			} else if (condition >= 1 || condition <= 5) {
				status = false;
			}

		} while (status == true);

		return condition;
	}

	public static double calculadora() {
		Scanner scan = new Scanner(System.in);
		double n1, n2;
		double soma = 0;
		boolean status = true;

		do {

			try {

				int condition = menu();
				/**
				 * A CONDIÇÃO 5 FICA ANTES DAS OUTRAS PQ ELA LANÇA UMA EXEÇÃO QUE ENCERRA O LAÇO
				 * DE REPETIÇÃO E NAO ENTRA NAS VARIAVEIS DO PROGRAMA PRICIPAL POIS ELA LANÇA
				 */

				if (condition == 5) {
					throw new IllegalAccessError();
				}
				System.out.println("digite um numero");
				n1 = scan.nextDouble();
				System.out.println("digite o segundo numero");
				n2 = scan.nextDouble();

				if (condition == 1) {
					soma = n1 + n2;
				} else if (condition == 2) {
					soma = n1 - n2;
				} else if (condition == 3) {
					soma = n1 * n2;
				} else if (condition == 4) {
					soma = n1 / n2;
					if (n2 <= 0) {
						throw new ArithmeticException();

					}

				}
				System.out.println("O VALOR E DE :" + soma);

			} catch (InputMismatchException e) {
				System.out.println("OPÇÃO INVALIDA. TENTE NOVAMENTE COM OS VALORES PERMITIDOS");
				scan.nextLine();
				status = true;
				/**
				 * OBS: USEI ESSA EXESSÃO APENAS PARA QUEBRAR O LAÇO DE REPETIÇÃO
				 */
			} catch (IllegalAccessError e) {
				status = false;
				System.out.println("ENCERRANDO CAUCULADORA....");

				/**
				 * NÃO ENCONTREI NENHUMA SOLUÇÃO APRA O ERRO DE DIVIZÃO POR ZERO! (infinity) FIZ
				 * UMA SOLUÇÃO NÃO MUITO BOA AO MEU VER.
				 */
			} catch (ArithmeticException e) {
				System.out.println(
						"NÃO É POSSIVEL DIVIDIR UM NUMERO POR ZERO\nTENTE NOVAMENTE\nMAS LEMBRE-SE! NÃO E POSSIVEL DIVIDIR UM NUMERO POR ZERO. ");
				status = true;
				soma = 0;

			}

		} while (status == true);
		System.out.println("CALCULADORA ENCERRADA!");

		return soma;
	}

}
