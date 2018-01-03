package com.balaji.assignment.datatypes;

import java.util.Scanner;

public class ManipulateDigits {

	public static void main(String[] args) {
		System.out.println("Finding the Sum of the digits of the number");
		int num=menu();
		if(num!=-1) {
			System.out.println(sumDigits(num));
		}
		else {
			System.out.println("Enter a 5 digit number");
		}
		System.out.println("Reversing the number");
		num=menu();
		if(num!=-1) {
			System.out.println(reverse(num));
		}
		else {
			System.out.println("Enter a 5 digit number");
		}
		System.out.println("Checking palindrome");
		num=menu();
		if(num!=-1) {
			System.out.println(isPalindrome(num));
		}
		else {
			System.out.println("Enter a 5 digit number");
		}
	}
	public static int sumDigits(int num) {
		int sum=0;
		for (int i :seperateDigits(num) ) {
			sum+=i;
		}
		return sum;
	}

	public static int reverse(int num) {
		int reverse=0;
		for (int i :seperateDigits(num) ) {
			reverse=reverse*10+i;
		}
		return reverse;
	}

	public static boolean isPalindrome(int num) {
		int rev=reverse(num);
		return(num==rev)?true:false;
	}
	public static int[] seperateDigits(int num) {
		int[] digits=new int[String.valueOf(num).length()];
		int index=0;
		while (num>0) {
			int digit=num%10;
			num=num/10;
			digits[index++]=digit;
		}
		return digits;
	}

	public static boolean validateDigit(int num) {
		return (String.valueOf(num).length()==5)?true:false;
	}

	public static int menu() {
		int num=0;
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);
		if (scanner.hasNextInt())
			num=scanner.nextInt();
		return (num>9999 && num<100000)?num:-1;
	}


}
