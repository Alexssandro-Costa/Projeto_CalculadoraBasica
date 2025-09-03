package exceptions;

@SuppressWarnings("serial")
public class DivisionByZeroException extends RuntimeException {
	
	/*
	 * Verifica Se uma expressão está sendo dividida por zero.
	 * 
	 * @author Alexssandro Oliveira
	 */
	
	public DivisionByZeroException() {
		super("ERRO! IMPOSSIVEL DIVIDIR POR ZERO!");
	}
	
	public static void verifyInput(double op1, double op2) throws DivisionByZeroException {
		
		if(op2 == 0.0) {
			throw new DivisionByZeroException();
		
		}
	
	}
}
