package calculation_Logic;


import java.util.Optional;
import java.util.regex.Matcher;

import validation.ValidateExpression;

public class Calculator {
	
	/*
	 * Verifica se a entrada passada é uma expressão valida.
	 * 
	 * @author Alexssandro Oliveira
	 * 
	 */
	
	
	// realiza a operação
	public Double makeCalculation(String input) {
		
		// valida a entrada
		Matcher expression = ValidateExpression.validation(input);
		
		// padrão invalido
		if(expression == null) {
			return null;
		}
		
		// transforma a entrada em em um padrão valido
		double op1 = Double.parseDouble(expression.group(1));
		String operator = expression.group(2);
		double op2 = Double.parseDouble(expression.group(3));
		
		// Criar 
		Calculation calculation = new Calculation(op1, operator, op2);
		
		
		return calculation.Operation();
		
	}

}
