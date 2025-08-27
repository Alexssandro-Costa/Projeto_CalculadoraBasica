package calculation_Logic;

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
	private Double sumOperation() {

		return operand1 + operand2;
	}

	//Operação de Subtração
	private Double subtractOperation() {

		return operand1 - operand2;	
	}

	//Operação de divisão
	private Double divisionOperation() {
		
		// divisão por 0
		if(operand2 == 0) {
			throw new NullPointerException("Erro de divisão por zero");
		}
		return operand1 / operand2;
	}

	//Operação de multiplicação
	private Double multiplicationOperation() {
		
		return operand1 * operand2;
	}


}
