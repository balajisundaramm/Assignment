package com.balaji.assignment.datatypes;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author spaneos
 *
 */
public class Factorial {
	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		/**
		 * flag is used to control the while loop.
		 * 
		 */
		boolean flag=true;
		/**
		 * ch is used to execute the chosen option.  
		 */
		int ch=0;
		/**
		 * This loop displays the menu to the user. 
		 */
		while (flag) {
			Scanner scanner=new Scanner(System.in);
			Scanner scanner2=new Scanner(System.in);
			System.out.println("Enter 1 to get Factorial");
			System.out.println("Enter 2 to exit");
			if(scanner2.hasNextInt()) {
				ch=scanner2.nextInt();
			}
			else {
				System.out.println("Enter only numbers");
				flag=true;
				continue;
			}
			switch (ch) {
			case 1:
				boolean choice=true;
				while(choice) {
					System.out.println("Enter the number");
					scanner=new Scanner(System.in);
					if (scanner.hasNextInt()) {
						int num=scanner.nextInt();
						BigDecimal result=findFactorial(BigDecimal.valueOf(num));
						if(result.intValue()!=-1) {
							System.out.println("The factorial is "+result);
							choice=false;
						}
						else {
							System.out.println("Invalid input input should be from 0 to 5400");
							choice=true;
						}
					}
					else {
						System.out.println("The given input is invalid please enter only numbers");
						choice=true;
					}
				}
				flag=true;
				break;
			case 2:
				System.out.println("Thank you!!!");
				flag=false;
				break;
			default:
				System.out.println("Enter only 1 or 2");
				flag=true;
				break;
			}
		}
	}
	/**
	 * 
	 * @param num input value to find factorial
	 * @return the factorial value.
	 */
	public static BigDecimal findFactorial(BigDecimal num) {
		if(validateFactorial(num.intValue())) {
			if(num.intValue()==0)
				return BigDecimal.valueOf(0);
			return (num.intValue()==1)?BigDecimal.valueOf(1):num.multiply(findFactorial(num.subtract(BigDecimal.valueOf(1))));
		}
		return BigDecimal.valueOf(-1);
	}
	/**
	 * This method is used to validate the given number for factorial
	 * @param num input value to validate.
	 * @return boolean based on the validation
	 */
	public static boolean validateFactorial(int num) {
		return (num>=0 && num<=5400)?true:false;
	}

}
