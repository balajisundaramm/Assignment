package com.balaji.assignment.interfaces.iterator;

import java.util.Scanner;
/**
 * 
 * @author spaneos
 *
 */
public class UserClient {
	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		System.out.println("Checking my iterator");
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		int length=0;
		System.out.println("Enter the length of the array");
		if(sc1.hasNextInt()) {
			length=sc1.nextInt();
		}
		else {
			System.out.println("Enter only number");
		}
		String[] name=new String[length];
		System.out.println("The elements of the array are names");
		for (int i = 0; i <length; i++) {
			System.out.println("Enter elemnt "+(i+1));
			name[i]=sc2.nextLine();
		}
		System.out.println("The elements in the array are,");
		UserList list=new UserList(name);
		while (list.hasNext()) {
			System.out.println(list.next());
		}
	}
}
