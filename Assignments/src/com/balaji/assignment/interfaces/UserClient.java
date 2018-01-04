package com.balaji.assignment.interfaces;

import java.util.Scanner;

public class UserClient {
	public static void main(String[] args) {
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
		for (int i = 0; i <length; i++) {
			System.out.println("Enter elemnt "+(i+1));
			name[i]=sc2.nextLine();
		}
		for (String string : name) {
			System.out.println(string);
		}
		UserList list=new UserList(name);
		while (list.hasNext()) {
			System.out.println(list.next());
		}
	}
}
