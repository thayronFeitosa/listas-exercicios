package exercicio04;

import java.util.Scanner;

/**
 * 5. Faça um programa que leia a altura e o sexo (codificado da seguinte forma:
 * 1:feminino 2:masculino) de uma pessoa. Depois faça uma função chamada
 * pesoideal que receba a altura e o sexo via parâmetro e que calcule e retorne
 * seu peso ideal, utilizando as seguintes fórmulas: - para homens : (72.7 * h)
 * – 58 - para mulheres : (62.1 * h) – 44.7 Observação: Altura = h (na fórmula
 * acima).
 * 
 * @author thayron
 *
 */

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite sua altura");
		double altura = scan.nextDouble();
		System.out.println("digite seu sexo");
		String sexo = scan.next();
		System.out.println(pesoIdeal(altura, sexo));
		scan.close();

	}

	public static double pesoIdeal(double altura, String sexo) {
		

		if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("homem") || sexo.equalsIgnoreCase("masculino")) {
			return (72.7 * altura) - 58;

		} else if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("mulher") || sexo.equalsIgnoreCase("feminino")) {
			return (62.1 * altura) - 44.7;
		}
		return 0;
	}

}
