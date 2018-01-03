package com.balaji.assignment.datatypes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		try{
			int ch=1;
			while(ch==1) {
				System.out.println("Enter the number");
				Scanner scanner=new Scanner(System.in);
				if (scanner.hasNextInt()) {
					int num=scanner.nextInt();
					long result=findFactorial(num);
					System.out.println((result!=-1)?"The factorial is "+result:"Invalid input input should be from 1 to 20");
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

	public static long findFactorial(int num) {
		if(validateFactorial(num)) {
			if(num==0)
				return 0;
			return (num==1)?1:num*findFactorial(num-1);
		}
		return -1;
	}
	public static boolean validateFactorial(int num) {
		return (num>=0 && num<21)?true:false;
	}

}
