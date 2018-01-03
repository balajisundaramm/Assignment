package com.balaji.assignment.interfaces;

import java.util.Scanner;

public class CurrencyClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String country=scanner.nextLine();
		Object o=new India();
		if(o instanceof Currency) {
			Currency currency=(Currency)o;
			System.out.println(currency.getCurrency(country));
		}
		
	}
}
class India implements Currency{
	@Override
	public Currency getCurrency(String country) {
		India india=new India();
		return india;
	}

	@Override
	public String toString() {
		return "India";
	}
	
}
class USA implements Currency{
	@Override
	public Currency getCurrency(String country) {
		USA usa=new USA();
		return usa;
	}
	public String toString() {
		return "USA";
	}
}
class UK implements Currency{
	@Override
	public Currency getCurrency(String country) {
		UK uk=new UK();
		return uk;
	}
	public String toString() {
		return "UK";
	}
}
