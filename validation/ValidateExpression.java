package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateExpression {
	
	
	// verifica se uma entrada é valida como expressão numerica
	public static Matcher validation(String input) {
		
		// define o padrão de entrada para: operador operando operador
		Pattern pattern = Pattern.compile("\\s*(-?\\d+(?:\\.\\d+)?)\\s*([-+*/:])\\s*(-?\\d+(?:\\.\\d+)?)\\s*");
		
		// define a entrada
		Matcher matcher = pattern.matcher(input);
					
		// verifica se a entrada é compativel com o padrão
		try {
			
			InvalidExpressionException.verifyInput(matcher, pattern, "Expressão Invalida!");	
			return matcher; // entrada valida
		}
		catch(InvalidExpressionException I) {
				System.out.println(I.getMessage());
				return null; // não valida
			}
		
		
	}

}
