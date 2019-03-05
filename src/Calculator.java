public class Calculator {
	
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public double subtract(double num1, double num2) {
		return num1 - num2;
	}
	
	public double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public double divide(double num1, double num2) {
		if (num2 == 0) throw new IllegalArgumentException("Cannot divide a number by 0");
		else return num1 / num2;
	}
	
	public double square(double num1) {
		return num1 * num1;
	}
	
	public double sqroot(double num1) {
		return Math.sqrt(num1);
	}
}
