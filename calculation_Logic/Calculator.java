package calculation_Logic;


import java.util.Optional;
import java.util.regex.Matcher;

import validation.ValidateExpression;

public class Calculator {
	
	
	// realiza a operação
	public static Optional<Double> makeCalculation(String input) {
		
		// valida a entrada
		Matcher expression = ValidateExpression.validation(input);
		
		// operação invalida
		if(expression == null) {
			return Optional.empty();
		}
		
		// transforma a entrada em em um padrão valido
		double op1 = Double.parseDouble(expression.group(1));
		String operator = expression.group(2);
		double op2 = Double.parseDouble(expression.group(3));
		
		// realiza o calculo
		Calculation calculation = new Calculation(op1, operator, op2);
		
		
		return Optional.ofNullable(calculation.Operation());
		
	}

}
