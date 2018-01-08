package com.balaji.assignment.utill;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 * @author spaneos
 *
 */
public class UserInputValidations {
	/**
	 * 
	 * @return
	 */
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
	/**
	 * 
	 * @return
	 */
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
	/**
	 * 
	 * @return
	 */
	public static String validateString() {
		String string="";
		boolean flag=true;
		while (flag) {
			Scanner sc=new Scanner(System.in);
			string=sc.nextLine();
			if(string!=null && !(string.trim().equals(""))) {
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
	/**
	 * 
	 * @return
	 */
	public static char validateChar(){
		char ch=0;
		boolean flag=true;
		while (flag) {
			Scanner sc=new Scanner(System.in);
			if(sc.hasNext()) {
				ch=sc.next().charAt(0);
				flag=false;
			}
			else {
				System.out.println("Enter only numbers");
				System.out.println("Type here");
				flag=true;
				continue;
			}
		}
		return ch;
	}
	/**
	 * 
	 * @return
	 */
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
