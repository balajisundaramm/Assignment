package com.balaji.assignment.interfaces.currency;

public class CurrencyContainer {
	public static Currency getCurrency(String country) {
		country=country.toLowerCase();
		if(country.equals("india")) {
			India india=new India();
			return india.getCurrency(country);
		}
		else if(country.equals("usa")) {
			USA usa=new USA();
			return usa.getCurrency(country);
		}
		else if(country.equals("uk")) {
			UK uk=new UK();
			return uk.getCurrency(country);
		}
		else 
			throw new IllegalArgumentException("The country is not valid.");
			
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
