package com.balaji.assignment.datatypes;

import java.util.Scanner;

public class PrimeBetweenBounds {

	public static void main(String[] args) {
		int start=0, end=0;
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);
		if (scanner.hasNextInt()) {
			start=scanner.nextInt();
		}
		System.out.println("Enter the number");
		scanner=new Scanner(System.in);
		if (scanner.hasNextInt()) {
			end=scanner.nextInt();
		}
		printPrime(start,end);
	}
	public static void printPrime(int start, int end) {
		if (inputValidation(start, end)) {
			if (start==2 && end>=2) {
				System.out.println("2");
			}
			if (start==23&& end>=3) {
				System.out.println("3");
			}
			for (int i = start; i <=end; i++) {
				int cond=(int)Math.sqrt(i);
				boolean flag=false;
				for (int j =2; j <=cond; j++) {
					if((i%j)==0) {
						flag=false;
						break;
					}
					else {
						flag=true;
					}
				}
				if(flag)
					System.out.println(i);
			}
		}
	}
	public static boolean inputValidation(int start, int end) {
		return (start>1 && end>=start)?true:false;
	}

}
