package exercicio1;

public class StackErro extends StackOverflowError{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public StackErro() {
		System.err.println("erro na pilha");
	}
}
