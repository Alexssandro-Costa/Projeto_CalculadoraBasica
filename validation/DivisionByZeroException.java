package validation;

@SuppressWarnings("serial")
public class DivisionByZeroException extends RuntimeException {
	
	/*
	 * Verifica Se uma expressão está sendo dividida por zero
	 */
	
	public DivisionByZeroException(String message) {
		super(message);
	}
	
	public static void verifyInput(Double op1, Double op2, String message) throws DivisionByZeroException {
		
		if(op2.equals(0.0)) {
			throw new DivisionByZeroException(message);
		
		}
	
	}
}
