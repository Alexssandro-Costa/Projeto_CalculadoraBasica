package calculation_Logic;


import validation.ValidateExpression;

public class Calculator {
	
	/*
	 * Verifica se a entrada passada é uma expressão valida.
	 * 
	 * @author Alexssandro Oliveira
	 * 
	 */
	
	
	// realiza a operação
	public String makeCalculation(String input) {
		
		String[] expression;
		
		// verifica se a entrada é valida
		if(ValidateExpression.validation(input) instanceof String) {
			return (String) ValidateExpression.validation(input);
		}
		else {
			expression = (String[]) ValidateExpression.validation(input);	
		}
		
		
		// transforma a entrada em em um padrão valido
		double op1 = Double.parseDouble(expression[0]);
		String operator = expression[1];
		double op2 = Double.parseDouble(expression[2]);
		
		// Criar 
		Calculation calculation = new Calculation(op1, operator, op2);
		
		
		return calculation.Operation();
		
	}

}
