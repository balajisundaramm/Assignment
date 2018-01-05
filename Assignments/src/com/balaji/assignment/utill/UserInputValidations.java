package com.balaji.assignment.utill;

import java.util.Scanner;

public class UserInputValidations {

	public static int validateInteger() {
		int num=0;
		boolean flag=true;
		while (flag) {
			Scanner sc=new Scanner(System.in);
			if(sc.hasNextInt()) {
				num=sc.nextInt();
				flag=false;
			}
			else {
				System.out.println("Enter only numbers");
				System.out.println("Enter the number");
				flag=true;
				continue;
			}
		}
		return num;
	}
	
	public static double validateDouble() {
		double num=0;
		boolean flag=true;
		while (flag) {
			Scanner sc=new Scanner(System.in);
			if(sc.hasNextDouble()) {
				num=sc.nextDouble();
				flag=false;
			}
			else {
				System.out.println("Enter only numbers");
				System.out.println("Enter the number");
				flag=true;
				continue;
			}
		}
		return num;
	}

	public static String validateString() {
		String string="";
		boolean flag=true;
		while (flag) {
			Scanner sc=new Scanner(System.in);
			if(sc.hasNextLine()) {
				string=sc.nextLine();
				flag=false;
			}
			else {
				System.out.println("Type something. It cannot be empty.");
				flag=true;
				continue;
			}
		}
		return string;
	}
	
	public static float validateFloat() {
		float f=0.0f;
		boolean flag=true;
		while (flag) {
			System.out.println("Enter the number");
			Scanner sc=new Scanner(System.in);
			if(sc.hasNextFloat()) {
				f=sc.nextFloat();
				flag=false;
			}
			else {
				System.out.println("Enter only numbers");
				flag=true;
				continue;
			}
		}
		return f;
	}
}
