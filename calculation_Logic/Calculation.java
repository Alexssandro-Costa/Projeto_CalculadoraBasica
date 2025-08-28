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
			return sumOperation();
		case "-":
			return subtractOperation();
		case "*":
		case ".":
			return multiplicationOperation();
		case "/":
		case ":":
			return divisionOperation();
		default:
			return null;
		}
	}
	

	//Operação de soma
	private double sumOperation() {

		return operand1 + operand2;
	}

	//Operação de Subtração
	private double subtractOperation() {

		return operand1 - operand2;	
	}

	//Operação de divisão
	private Double divisionOperation() {
		
		if(ValidateNumber.validation(operand1, operand2) == true) {
			return operand1 / operand2;
		}
		else {
			return null;
		}
	}

	//Operação de multiplicação
	private double multiplicationOperation() {
		
		return operand1 * operand2;
	}


}
