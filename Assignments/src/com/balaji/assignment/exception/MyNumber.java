package com.balaji.assignment.exception;
/**
 * 
 * @author spaneos
 *
 */
public class MyNumber {
	
	private int firstNumber;

	private int secondNumber;

	private double result;

	/**
	 * Parameterized Constructor
	 * @param firstNumber Input value
	 * @param secondNumber Input value
	 */
	public MyNumber(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	
	/**
	 * 
	 * @return the result of arithmetic operations
	 */
	public double getResult() {
		return result;
	}

	/**
	 * 
	 * @param firstNumber Input value
	 * @param secondNumber Input value
	 * @return The sum 
	 */
	public double add(int firstNumber, int secondNumber) {
		this.result=firstNumber+secondNumber;
		return result;
	}
	/**
	 * 
	 * @param firstNumber Input value
	 * @param secondNumber Input value
	 * @return Subtracted value
	 */
	public double subtract(int firstNumber, int secondNumber) {
		this.result=firstNumber-secondNumber;
		return result;
	}
	/**
	 * 
	 * @param firstNumber Input value
	 * @param secondNumber Input value
	 * @return Multiplied value
	 */
	public double multiply(int firstNumber, int secondNumber) {
		this.result=firstNumber*secondNumber;
		return result;
	}
	/**
	 * 
	 * @param firstNumber Input value
	 * @param secondNumber Input value
	 * @return the Quotient of two values
	 * @throws ArithmeticException Restrict to get Infinity.
	 */
	public double divide(int firstNumber, int secondNumber) throws ArithmeticException {
		if(secondNumber!=0) {
			this.result=firstNumber/secondNumber;
			return result;
		}
		else {
			throw new ArithmeticException("An integer cannot be divided by 0.");
		}
	}
}
