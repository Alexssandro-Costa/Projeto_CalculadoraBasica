package calculation_Logic;

import validation.ValidateNumber;

public class Calculation {
	
	private Double operand1;
	private Double operand2;
	private String operator;
	
	
	public Calculation(double operand1, String operator, double operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
	}
	
	// determina a operação
	public Double Operation() {
		
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
	private double sum() {

		return operand1 + operand2;
	}

	//Operação de Subtração
	private double subtraction() {

		return operand1 - operand2;	
	}

	//Operação de divisão
	private Double division() {
		
		
		if(ValidateNumber.validation(operand1, operand2) == true) {
			/*
			 * @exception Verifica se um numero está sendo divido por 0
			 */
			return operand1 / operand2;
		}
		else {
			return null;
		}
	}

	//Operação de multiplicação
	private double multiplication() {
		
		return operand1 * operand2;
	}


}
