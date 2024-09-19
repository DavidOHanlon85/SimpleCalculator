/**
 * 
 */
package simpleCalc;

/**
 * Class represents a simple calculator
 */
public class SimpleCalc {
	
	/**
	 * Adds the arguments and outputs result to the screen
	 * @param num1 the first number
	 * @param num2 the second number
	 */
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	/**
	 * Subtracts the second argument from first and outputs result to the screen
	 * @param num1 the first number
	 * @param num2 the second number
	 */
	public void subtract(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
	public void multiply(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public void divide(int num1, int num2) {
		System.out.println(num1 / num2);
	}

}
