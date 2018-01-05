package com.balaji.assignment.exception;

import com.balaji.assignment.utill.UserInputValidations;
/**
 * 
 * @author spaneos
 *
 */
public class TestDbConnection {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		int ch=0;
		boolean flag=true;
		while (flag) {
			System.out.println("Enter 1 to creat object");
			System.out.println("Enter 2 to exit");
			ch=UserInputValidations.validateInteger();
			switch (ch) {
			case 1:
				try {
					DbConnection connection=DbConnection.getObject();
					System.out.println(connection);
				} catch (MultipleObjectCreationRestrictedException e) {
					System.out.println(e.getMessage());
				}
				flag=true;
				break;
			case 2:
				System.out.println("Thank you!!!!");
				flag=false;
				break;
			default:
				System.out.println("Enter only 1 or 2");
				flag=true;
				break;
			}
		}
		
	}

}
