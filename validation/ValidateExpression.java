package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.InvalidExpressionException;

public class ValidateExpression {
	
	/*
	 * Verifica se a entrada passada é compativel com o padrão de uma expressão.
	 * 
	 * @author Alexssandro Oliveira
	 */
	
	
	// verifica se uma entrada é valida como expressão numerica
	public static Object validation(String input) {
		
		// define o padrão de entrada para: operador operando operador
		Pattern pattern = Pattern.compile("\\s*(-?\\d+(?:\\.\\d+)?)\\s*([-+*/:.])\\s*(-?\\d+(?:\\.\\d+)?)\\s*");
		
		// define a entrada
		Matcher matcher = pattern.matcher(input);
					
		// verifica se a entrada é compativel com o padrão
		try {
			
			InvalidExpressionException.verifyInput(matcher, pattern);	
			
			String[] expression = {matcher.group(1), matcher.group(2), matcher.group(3)};
			return expression;
			
		}
		catch(InvalidExpressionException ex) {
			
				
				String result = ex.getMessage();
				return result;
			}
	}

}
