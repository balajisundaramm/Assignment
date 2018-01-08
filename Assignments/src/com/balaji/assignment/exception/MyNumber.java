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
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 */
	public MyNumber(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public double getResult() {
		return result;
	}

	/**
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
	public double add(int firstNumber, int secondNumber) {
		this.result=firstNumber+secondNumber;
		return result;
	}
	/**
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
	public double subtract(int firstNumber, int secondNumber) {
		this.result=firstNumber-secondNumber;
		return result;
	}
	/**
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
	public double multiply(int firstNumber, int secondNumber) {
		this.result=firstNumber*secondNumber;
		return result;
	}
	/**
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 * @throws ArithmeticException
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
