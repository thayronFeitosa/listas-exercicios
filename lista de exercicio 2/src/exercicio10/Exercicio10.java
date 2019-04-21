package exercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 10. Fa�a um programa de calculadora simples, que pe�a dois n�meros ao usu�rio
 * e pergunte qual das seguintes opera��es deseja realizar: adi��o, subtra��o,
 * multiplica��o ou divis�o. O programa inicia apresentando ao usu�rio um menu
 * de op��es como mostrado abaixo: * Calculadora. Digite: 1. Adi��o 2. Subtra��o
 * 3. Multiplica��o 4. Divis�o 5. Sair do programa *
 * 
 * Entre com sua op��o: Crie uma fun��o que apresenta o menu inicial acima e
 * retorna a op��o do usu�rio para o programa principal. Esta op��o � ent�o
 * analisada e o programa principal chama as fun��es de adi��o, subtra��o,
 * multiplica��o e divis�o conforme a op��o do usu�rio. Se a op��o for inv�lida,
 * informe ao usu�rio e pe�a a ele para entrar com uma op��o v�lida. Ap�s a
 * execu��o da opera��o o programa volta a apresentar o menu inicial at� que o
 * usu�rio encerre o programa com a op��o 5. OBS.: N�o existe n�mero divis�vel
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
		
		System.out.println("-----------MENU----------\nDigite: 1 Para Adi��o\nDigite: 2 Para Subtra��o\nDigite: 3"
				+ " Multiplica��o\nDigite: 4 Para Divis�o\nDigite: 5 Sair da calculadora ");

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
				 * A CONDI��O 5 FICA ANTES DAS OUTRAS PQ ELA LAN�A UMA EXE��O QUE ENCERRA O LA�O
				 * DE REPETI��O E NAO ENTRA NAS VARIAVEIS DO PROGRAMA PRICIPAL POIS ELA LAN�A
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
				System.out.println("OP��O INVALIDA. TENTE NOVAMENTE COM OS VALORES PERMITIDOS");
				scan.nextLine();
				status = true;
				/**
				 * OBS: USEI ESSA EXESS�O APENAS PARA QUEBRAR O LA�O DE REPETI��O
				 */
			} catch (IllegalAccessError e) {
				status = false;
				System.out.println("ENCERRANDO CAUCULADORA....");

				/**
				 * N�O ENCONTREI NENHUMA SOLU��O APRA O ERRO DE DIVIZ�O POR ZERO! (infinity) FIZ
				 * UMA SOLU��O N�O MUITO BOA AO MEU VER.
				 */
			} catch (ArithmeticException e) {
				System.out.println(
						"N�O � POSSIVEL DIVIDIR UM NUMERO POR ZERO\nTENTE NOVAMENTE\nMAS LEMBRE-SE! N�O E POSSIVEL DIVIDIR UM NUMERO POR ZERO. ");
				status = true;
				soma = 0;

			}

		} while (status == true);
		System.out.println("CALCULADORA ENCERRADA!");

		return soma;
	}

}
