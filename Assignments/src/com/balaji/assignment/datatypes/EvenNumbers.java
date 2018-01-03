package com.balaji.assignment.datatypes;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		try{
			int ch=1;
			while(ch==1) {
				System.out.println("Enter the number");
				Scanner scanner=new Scanner(System.in);
				if (scanner.hasNextLong()) {
					long num=scanner.nextLong();
					printEven(num);
					System.out.println("Enter 1 to continue 0 to exit");
					scanner=new Scanner(System.in);
					if(scanner.hasNextInt())
						ch=scanner.nextInt();
					else
						throw new IllegalArgumentException("Enter only 1 0r 0");
				}
				else {
					System.out.println("The given input is invalid please enter only numbers");
					ch=1;
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
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
