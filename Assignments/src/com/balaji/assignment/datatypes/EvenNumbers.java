package com.balaji.assignment.datatypes;

import java.util.Scanner;

/**
 * @author spaneos
 *
 */
public class EvenNumbers {
	
	// This method is used to run the program
	public static void main(String[] args) {
		// The variable is used to iterate the while loop
		boolean flag=true;
		// The variable is used to control the switch case
		int ch=0;
		
		while (flag) {
			Scanner scanner=new Scanner(System.in);
			Scanner scanner2=new Scanner(System.in);
			System.out.println("Enter 1 to print even numbers");
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
					System.out.println("Enter the number");
					scanner=new Scanner(System.in);
					if (scanner.hasNextLong()) {
						long num=scanner.nextLong();
						printEven(num);
						choice=false;
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
	
	public static void printEven(long num) {
		if(num>=0) {
			for (int i = 0; i <=num; i+=2) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("Enter positive value");
		}
	}

}
