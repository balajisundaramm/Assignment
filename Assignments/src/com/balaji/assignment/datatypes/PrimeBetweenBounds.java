package com.balaji.assignment.datatypes;

import java.util.Scanner;

public class PrimeBetweenBounds {

	public static void main(String[] args) {
		// The variable is used to iterate the while loop
		boolean flag=true;
		// The variable is used to control the switch case
		int ch=0;
		int start=0, end=0;
		while (flag) {
			Scanner scanner=new Scanner(System.in);
			Scanner scanner2=new Scanner(System.in);
			System.out.println("Enter 1 to print prime numbers");
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
				while (choice) {
					System.out.println("Enter the lower bound");
					scanner=new Scanner(System.in);
					if (scanner.hasNextInt()) {
						int num=scanner.nextInt();
						start=num;
						choice=false;
					}
					else {
						System.out.println("The given input is invalid please enter only numbers");
						choice=true;
					}
				}
				choice=true;
				while (choice) {
					System.out.println("Enter the upper bound");
					scanner=new Scanner(System.in);
					if (scanner.hasNextInt()) {
						int num=scanner.nextInt();
						end=num;
						choice=false;
					}
					else {
						System.out.println("The given input is invalid please enter only numbers");
						choice=true;
					}
				}
				printPrime(start,end);
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
	public static void printPrime(int start, int end) {
		if (inputValidation(start, end)) {
			if (start<=2 && end>=2) {
				System.out.println("2");
			}
			if (start<=3&& end>=3) {
				System.out.println("3");
			}
			for (int i = start; i <=end; i++) {
				int cond=(int)Math.sqrt(i);
				boolean flag=false;
				for (int j =2; j <=cond; j++) {
					if((i%j)==0) {
						flag=false;
						break;
					}
					else {
						flag=true;
					}
				}
				if(flag)
					System.out.println(i);
			}
		}
		else {
			System.out.println("There is no prime in the limit");
		}
	}
	
	public static boolean inputValidation(int start, int end) {
		return (start>=1 && end>=start)?true:false;
	}

}
