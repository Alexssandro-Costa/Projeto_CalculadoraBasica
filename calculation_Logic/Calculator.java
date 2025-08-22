package calculation_Logic;


import java.util.regex.Matcher;

import validation.ValidateExpression;

public class Calculator {
	
	
	// realiza a operação
	public static double makeCalculation(String input) {
		
		double op1, op2;
		String operator;
		
		// valida a entrada
		Matcher expression = ValidateExpression.validation(input);
		
		// operação invalida
		if(expression == null) {
			return 0;
		}
		
		// transforma a entrada em em um padrão valido
		op1 = Double.parseDouble(expression.group(1));
		operator = expression.group(2);
		op2 = Double.parseDouble(expression.group(3));
		
		// realiza o calculo
		Calculation calculation = new Calculation(op1, operator, op2);
		
		return calculation.Operation();
		
	}

}
