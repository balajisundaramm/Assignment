/**
 * 
 */
package com.balaji.assignment.Collection;

import java.util.Set;

import com.balaji.assignment.utill.UserInputValidations;

/**
 * @author spaneos
 *
 */
public class MemberClient {
	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		int ch=0;
		boolean flag=true;
		MemberContainer container=null;
		while (flag) {
			System.out.println("Enter 1 to Add member");
			System.out.println("Enter 2 to delete member");
			System.out.println("Enter 3 to search by id");
			System.out.println("Enter 4 to search by name");
			System.out.println("Enter 5 to display sorting order");
			System.out.println("Enter 6 to exit");
			System.out.println("Enter your choice");
			ch=UserInputValidations.validateInteger();
			switch (ch) {
			case 1:
				if(container==null) {
					container=new MemberContainer();
				}
				container.addMember();
				flag=true;
				break;
			case 2:
				if (container != null) {
					System.out.println("Enter the id");
					String id=UserInputValidations.validateString();
					Member member=container.serachById(id);
					container.deleteMember(member);
				}
				else {
					System.out.println("No members are found. First add member and then delete");
				}
				flag=true;
				break;
			case 3:
				if (container != null) {
					System.out.println("Enter the id");
					String id=UserInputValidations.validateString();
					Member member=container.serachById(id);
					if(member!=null) {
						System.out.println(member);
					}
					else {
						System.out.println("Sorry, No matches found!!!");
					}
				}
				else {
					System.out.println("No members are found. First add member and then search");
				}
				flag=true;
				break;
			case 4:
				if (container != null) {
					System.out.println("Enter the name");
					String name=UserInputValidations.validateString();
					System.out.println("Enter the id");
					String id=UserInputValidations.validateString();
					Member member=container.searchByName(id,name);
					if(member!=null) {
						System.out.println(member);
					}
					else {
						System.out.println("Sorry, No matches found!!!");
					}
				}
				else {
					System.out.println("No members are found. First add member and then search");
				}
				flag=true;
				break;
			case 5:
				if (container != null) {
					System.out.println("Enter the order (ex:aesc/desc)");
					String order=UserInputValidations.validateString();
					Set<Member> set=container.displaySortingOrder(order);
					if(set!=null) {
						for (Member member : set) {
							System.out.println(member);
						}
					}
					else {
						System.out.println("Sorry, No matches found!!!");
					}
				}
				else {
					System.out.println("No members are found. First add member and then search");
				}
				flag=true;
				break;
			case 6:
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
