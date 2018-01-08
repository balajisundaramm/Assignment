package com.balaji.assignment.datatypes;

import java.util.Scanner;
/**
 * This program is used to print the even numbers.
 * @author spaneos
 *
 */
public class EvenNumbers {
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
		/**
		 * 
		 * @param num is the limit of the even number.
		 */
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
