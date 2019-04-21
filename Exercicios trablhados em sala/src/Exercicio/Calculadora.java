package Exercicio;

public class Calculadora {
	private double a;
	private double b;
	
	public double adicao(double a ,double b) {
		
		return a + b ;
	}
	public double subtracao(double a , double b ){
		return a -b;
	}
	
	public double multiplicacao(double a, double b) {
		return a * b;
	}
	
	public double divisao(double a, double b) {
		if(b==0) {
			System.out.println("Não e possivel dividir um numero por zero");
			return 0;
		}
		
		return a / b;
	}
	

}
