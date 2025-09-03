package exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// verifica se o dado passado é uma expressão
@SuppressWarnings("serial")
public class InvalidExpressionException extends RuntimeException {
	
	/*
	 * Verifia se uma entrada é compativel com um determinado padrão de regex.
	 * 
	 * @author Alexssandro Oliveira
	 */
	
	// mostra uma mensagem de alerta na tela
	public InvalidExpressionException() {
		super("EXPRESSÂO INVALIDA!");
	}
	
	
	// verifica se a entrada está no padrão desejado
	public static void verifyInput(Matcher matcher, Pattern pattern) throws InvalidExpressionException {
		
		if(matcher.matches() == false)	{
			throw new InvalidExpressionException(); // mostra a mensagem na tela
		}
		
	}

}
