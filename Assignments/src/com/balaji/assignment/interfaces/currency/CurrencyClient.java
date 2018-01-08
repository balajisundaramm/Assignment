package com.balaji.assignment.interfaces.currency;

import java.util.Scanner;
/**
 * 
 * @author spaneos
 *
 */
public class CurrencyClient {
	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		try {
			boolean flag=true;
			int ch=0;
			while (flag) {
				Scanner scanner=new Scanner(System.in);
				Scanner scanner2=new Scanner(System.in);
				System.out.println("Enter 1 to continue");
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
					System.out.println("Enter the country name");
					System.out.println("India or USA or UK");
					String country=scanner.nextLine();
					System.out.println(CurrencyContainer.getCurrency(country));
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
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Thank you!!!");
		}

	}
}
