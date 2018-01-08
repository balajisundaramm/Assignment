package com.balaji.assignment.datatypes;

import java.util.Scanner;

import com.balaji.assignment.utill.UserInputValidations;
/**
 * 
 * @author spaneos
 *
 */
public class ManipulateDigits {
	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		int ch=0;
		boolean flag=true;
		while (flag) {
			System.out.println("Enter 1 to find the sum of digits");
			System.out.println("Enter 2 to reverse the given number");
			System.out.println("Enter 3 to find the given number is palidrome");
			System.out.println("Enter 4 to exit");
			ch=UserInputValidations.validateInteger();
			switch (ch) {
			case 1:
				System.out.println("Finding the Sum of the digits of the number");
				int num=menu();
				if(num!=-1) {
					System.out.println("Sum of the number, "+num+" is "+sumDigits(num));
				}
				else {
					System.out.println("Enter a 5 digit number");
				}
				flag=true;
				break;
			case 2:
				System.out.println("Reversing the number");
				num=menu();
				if(num!=-1) {
					System.out.println("Reverse : "+reverse(num));
				}
				else {
					System.out.println("Enter a 5 digit number");
				}
				flag=true;
				break;
			case 3:

				System.out.println("Checking palindrome");
				num=menu();
				if(num!=-1) {
					System.out.println("The given number, "+num+((isPalindrome(num))?" is Palindrome.":" is not Palindrome"));
				}
				else {
					System.out.println("Enter a 5 digit number");
				}
				flag=true;
				break;
			case 4:
				System.out.println("Thank you!!!");
				flag=false;
				break;
			default:
				System.out.println("Enter only 1 to 4");
				flag=true;
				break;
			}
		}
	}
	/**
	 * This method is used to find the sum of digits of a number
	 * @param num input to find the sum of it's digits.
	 * @return the sum
	 */
	public static int sumDigits(int num) {
		int sum=0;
		for (int i :separateDigits(num) ) {
			sum+=i;
		}
		return sum;
	}
	/**
	 * This method is used to reverse a number
	 * @param num input value
	 * @return int
	 */
	public static int reverse(int num) {
		int reverse=0;
		for (int i :separateDigits(num) ) {
			reverse=reverse*10+i;
		}
		return reverse;
	}
	/**
	 * This method is used to find whether the number is Palindrome or not.
	 * @param num input value
	 * @return boolean
	 */
	public static boolean isPalindrome(int num) {
		int rev=reverse(num);
		return(num==rev)?true:false;
	}
	/**
	 *  Sub method- used to separate the digits of the number.
	 * @param num input value
	 * @return an array of digits.
	 */
	public static int[] separateDigits(int num) {
		int[] digits=new int[String.valueOf(num).length()];
		int index=0;
		while (num>0) {
			int digit=num%10;
			num=num/10;
			digits[index++]=digit;
		}
		return digits;
	}
	/**
	 *  This method id used to validate whether the number is a five digit number.
	 * @param num input value
	 * @return boolean
	 */
	public static boolean validateDigit(int num) {
		return (String.valueOf(num).length()==5)?true:false;
	}
	/**
	 * This method is used to display the sub menu.
	 * @return int
	 */
	public static int menu() {
		int num=0;
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);
		if (scanner.hasNextInt())
			num=scanner.nextInt();
		return (num>9999 && num<100000)?num:-1;
	}


}
