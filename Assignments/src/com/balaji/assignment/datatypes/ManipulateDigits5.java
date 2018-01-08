package com.balaji.assignment.datatypes;

import java.util.Scanner;

import com.balaji.assignment.utill.UserInputValidations;

/**
 * 
 * @author spaneos
 *
 */
public class ManipulateDigits5 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int ch=0;
		boolean flag=true;
		while (flag) {
			System.out.println("Enter 1 to find occurance of a digit in the number");
			System.out.println("Enter 2 to find single digit sum of the number");
			System.out.println("Enter 3 to exit");
			ch=UserInputValidations.validateInteger();
			switch (ch) {
			case 1:
				System.out.println("Finding the Occurance of the given digit in the number");
				int num=ManipulateDigits.menu();
				if(num!=-1) {
					System.out.println("Enter the digit");
					Scanner scanner=new Scanner(System.in);
					int digit=0;
					if(scanner.hasNextInt())
						digit=scanner.nextInt();
					System.out.print("The occurance of the digit, "+digit+" in the number, "+num+" is :");
					System.out.println(findOccurance(num, digit));
				}
				else {
					System.out.println("Enter a 5 digit number");
				}
				flag=true;
				break;
			case 2:
				System.out.println("Finding the Single digit sum of the given number");
				num=ManipulateDigits.menu();
				if(num!=-1) {
					System.out.print("Single digit sum of the number, "+num+" is :");
					System.out.println(sumSingleDigit(num));
				}
				else {
					System.out.println("Enter a 5 digit number");
				}
				flag=true;
				break;
			case 3:
				System.out.println("Thank you!!!");
				flag=false;
				break;
			default:
				System.out.println("Enter only 1 to 3");
				flag=true;
				break;
			}
		}
	}
	/**
	 * 
	 * @param num
	 * @param digit
	 * @return
	 */
	public static int findOccurance(int  num, int digit) {
		int count=0;
		for (int i :ManipulateDigits.seperateDigits(num) ) {
			if(i==digit)
				count++;
		}
		return count;
	}
	/**
	 * 
	 * @param num
	 * @return
	 */
	public static int sumSingleDigit(int num) {
		int sum=0;
		sum=sum+ManipulateDigits.sumDigits(num);
		return (sum<10)?sum:sumSingleDigit(sum);
	}

}
