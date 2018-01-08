package com.balaji.assignment.exception;

import com.balaji.assignment.utill.UserInputValidations;
/**
 * 
 * @author spaneos
 *
 */
public class ArithmeticOperations {
	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		try {
			int ch=0;
			boolean flag=true;
			while (flag) {
				System.out.println("Enter 1 to Add two numbers");
				System.out.println("Enter 2 to subtract two numbers");
				System.out.println("Enter 3 to multiply two numbers");
				System.out.println("Enter 4 to divide two numbers");
				System.out.println("Enter 5 to exit");
				System.out.println("Enter your choice");
				ch=UserInputValidations.validateInteger();
				switch (ch) {
				case 1:
					int firstNumber=menu();
					int secondNumber=menu();
					MyNumber number=new MyNumber(firstNumber, secondNumber);
					number.add(firstNumber, secondNumber);
					System.out.println(number.getResult());
					flag=true;
					break;
				case 2:
					firstNumber=menu();
					secondNumber=menu();
					number=new MyNumber(firstNumber, secondNumber);
					number.subtract(firstNumber, secondNumber);
					System.out.println(number.getResult());
					flag=true;
					break;
				case 3:
					firstNumber=menu();
					secondNumber=menu();
					number=new MyNumber(firstNumber, secondNumber);
					number.multiply(firstNumber, secondNumber);
					System.out.println(number.getResult());
					flag=true;
					break;

				case 4:
					firstNumber=menu();
					secondNumber=menu();
					number=new MyNumber(firstNumber, secondNumber);
					number.divide(firstNumber, secondNumber);
					System.out.println(number.getResult());
					flag=true;
					break;
				case 5:
					System.out.println("Thank you!!!");
					flag=false;
					break;
				default:
					System.out.println("Enter only 1 to 5");
					flag=true;
					break;
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Thank you!!!");
		}
	}
	/**
	 * This method displays the menu
	 * @return int
	 */
	public static int menu() {
		System.out.println("Enter the number");
		int a=UserInputValidations.validateInteger();
		return a;
	}

}
