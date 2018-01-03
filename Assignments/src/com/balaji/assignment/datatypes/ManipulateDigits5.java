package com.balaji.assignment.datatypes;

import java.util.Scanner;


public class ManipulateDigits5 {

	public static void main(String[] args) {
		System.out.println("Finding the Occurance of the given digit in the number");
		int num=ManipulateDigits.menu();
		if(num!=-1) {
			System.out.println("Enter the digit");
			Scanner scanner=new Scanner(System.in);
			int digit=0;
			if(scanner.hasNextInt())
				digit=scanner.nextInt();
			System.out.println(findOccurance(num, digit));
		}
		else {
			System.out.println("Enter a 5 digit number");
		}
		System.out.println("Finding the Single digit sum of the given number");
		num=ManipulateDigits.menu();
		if(num!=-1) {
			System.out.println(sumSingleDigit(num));
		}
		else {
			System.out.println("Enter a 5 digit number");
		}
	}
	
	public static int findOccurance(int  num, int digit) {
		int count=0;
		for (int i :ManipulateDigits.seperateDigits(num) ) {
			if(i==digit)
				count++;
		}
		return count;
	}
	
	public static int sumSingleDigit(int num) {
		int sum=0;
		sum=sum+ManipulateDigits.sumDigits(num);
		return (sum<10)?sum:sumSingleDigit(sum);
	}

}
