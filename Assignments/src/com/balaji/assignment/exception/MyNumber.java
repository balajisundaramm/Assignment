package com.balaji.assignment.exception;

public class MyNumber {
	/*
	 * 
	 */
	// the variable, firstNumber is used as a input variable
	private int firstNumber;
	// the variable, secondNumber is used as a input variable
	private int secondNumber;
	// the variable, result is used as a return variable
	private double result;

	// This constructor is used to instantiate the input variables
	public MyNumber(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	

	public double getResult() {
		return result;
	}


	public double add(int firstNumber, int secondNumber) {
		this.result=firstNumber+secondNumber;
		return result;
	}
	public double subtract(int firstNumber, int secondNumber) {
		this.result=firstNumber-secondNumber;
		return result;
	}
	public double multiply(int firstNumber, int secondNumber) {
		this.result=firstNumber*secondNumber;
		return result;
	}
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
