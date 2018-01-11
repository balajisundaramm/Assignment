/**
 * 
 */
package com.balaji.assignment.Collection.phonebook;

import com.balaji.assignment.utill.UserInputValidations;

/**
 * @author spaneos
 *
 */
public class PhoneBookClient {
	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		int ch=0;
		boolean flag=true;
		PhoneBook book=null;
		while (flag) {
			System.out.println("Enter 1 to Add phone number to the directory");
			System.out.println("Enter 2 to get details");
			System.out.println("Enter 3 to exit");
			ch=UserInputValidations.validateInteger();
			switch (ch) {
			case 1:
				System.out.println("Enter the Phone number");
				String phno=UserInputValidations.validateString();
				System.out.println("Enter the name");
				String name=UserInputValidations.validateString();
				book=new PhoneBook();
				book.addDetails(phno, name);
				flag=true;
				break;
			case 2:
				if(book!=null) {
					System.out.println("Enter the phone number");
					String ph=UserInputValidations.validateString();
					String contact=book.getName(ph);
					if(contact!=null) {
						System.out.println(contact);
					}
					else {
						System.out.println("Sorry, No person found with the given number");
					}
				}
				else {
					System.out.println("No contacts are there. add first and then search");
				}
				flag=true;
				break;
			case 3:
				System.out.println("Thank you!!!");
				flag=false;
				break;
			default:
				System.out.println("Enter only 1 to 5");
				flag=true;
				break;
			}
		}
	}

}
