package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// verifica se o dado passado é uma expressão
@SuppressWarnings("serial")
public class InvalidExpressionException extends RuntimeException {
	
	// mostra uma mensagem de alerta na tela
	private InvalidExpressionException(String message) {
		super(message);
	}
	
	
	// verifica se a entrada está no padrão desejado
	public static void verifyInput(Matcher matcher, Pattern pattern, String message) throws InvalidExpressionException {
		
		if(matcher.matches() == false)	{
			throw new InvalidExpressionException(message); // mostra a mensagem na tela
		}
		
	}

}
