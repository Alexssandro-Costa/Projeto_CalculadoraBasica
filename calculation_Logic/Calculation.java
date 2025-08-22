package calculation_Logic;

public class Calculation {
	
	private double operand1;
	private double operand2;
	private String operator;
	
	
	public Calculation(double operand1, String operator, double operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
	}
	
	// determina a operação
	public double Operation() {
		
		switch(operator) {
		case "+":
			return sumOperation();
		case "-":
			return subtractOperation();
		case "*":
			return multiplicationOperation();
		case "/":
		case ":":
			return divisionOperation();
		default:
			return 0;
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
	private double divisionOperation() {
		
		// divisão por 0
		if(operand2 == 0) {
			return 0;
		}
		return operand1 / operand2;
	}

	//Operação de multiplicação
	private double multiplicationOperation() {
		
		return operand1 * operand2;
	}


}
