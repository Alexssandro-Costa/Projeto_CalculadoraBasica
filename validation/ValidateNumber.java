package validation;

public class ValidateNumber {
	
	
	public static boolean validation(Double operand1, Double operand2) {
		
		/*
		 * Verifica se a expressão é possivel
		 * 
		 */
		
		try {
			DivisionByZeroException.verifyInput(operand1, operand2, "Erro! Não é possivel realizar divisão por zero.");
			return true;
		}
		catch(DivisionByZeroException E) {
			
			System.out.println(E.getMessage());
			return false;
		}
		
		
	}
}
