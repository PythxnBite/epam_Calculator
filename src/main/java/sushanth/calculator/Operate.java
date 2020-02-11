package sushanth.calculator;

public class Operate {

	private Double num1, num2;
	private String op;

	public Operate(double num1, double num2, String op) {
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}

	public String resolve() {
		switch (this.op.toCharArray()[0]) {
		case '+':
			return String.valueOf(add());
		case '-':
			return String.valueOf(sub());
		case '*':
			return String.valueOf(mul());
		case '/':
			return String.valueOf(div());
		default:
			return null;
		}

	}

	private double add() {
		return num1 + num2;
	}

	private double sub() {
		return num1 - num2; // abs can be used but -ve sign would be assigned based on order
	}

	private double mul() {
		return num1 * num2;
	}

	private double div() {
		return num1 / num2;
	}
}
