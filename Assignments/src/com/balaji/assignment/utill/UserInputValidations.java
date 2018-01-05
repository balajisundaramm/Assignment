package com.balaji.assignment.utill;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	/*public static String validatePhoneNo(){
		String string="";
		boolean flag=true;
		while (flag) {
			Scanner sc=new Scanner(System.in);
			Scanner sc2=new Scanner(System.in);
			if(sc.hasNextLine()) {
				string=sc2.nextLine();
				final Pattern VALIDATE_NAME =Pattern.compile("^[0-9]{10,12}$",Pattern.CASE_INSENSITIVE);
		        Matcher matcher = VALIDATE_NAME.matcher(string);
		        String msg="Name should contain only letters whose characters shuold be 2 to 30";
		        if(matcher.find()) {
		                return "SUCCESS";
		            else
		                msg="Catagory name is already exist. Enter the new name.";
		        }
		        return msg;
				flag=false;
			}
			else {
				System.out.println("Type something. It cannot be empty.");
				flag=true;
				continue;
			}
		}
		return string;
	}*/
	
	
}
