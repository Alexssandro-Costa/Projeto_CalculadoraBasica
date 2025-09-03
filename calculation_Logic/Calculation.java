package calculation_Logic;

import exceptions.DivisionByZeroException;

public class Calculation {
	
	/*
	 * Realiza as operações matematicas.
	 * 
	 * @Author Alexssandro Oliveira
	 * 
	 * @param operand1: primeiro operando
	 * @param operator: operador
	 * @param operand2: Segundo operando
	 * 
	 */
	
	private double operand1;
	private double operand2;
	private String operator;
	
	
	public Calculation(double operand1, String operator, double operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
	}
	
	// determina a operação
	public String Operation() {
		
		switch(operator) {
		case "+":
			return sum();
		case "-":
			return subtraction();
		case "*":
		case ".":
			return multiplication();
		case "/":
		case ":":
			return division();
		default:
			return null;
			
		}
	}
	

	//Operação de soma
	private String sum() {

		return String.format("" + ( (double) operand1 + operand2));
	}

	//Operação de Subtração
	private String subtraction() {

		return String.format("" + ( (double) operand1 - operand2));	
	}

	//Operação de divisão
	private String division() {
		
		try {
			
			DivisionByZeroException.verifyInput(operand1, operand2);
			return String.format("" + operand1 / operand2);
			
		}
		catch(DivisionByZeroException D) {
			return D.getMessage();
		}
		
	}

	//Operação de multiplicação
	private String multiplication() {
		
		 return String.format("" + (double) operand1 * operand2);
	}


}
