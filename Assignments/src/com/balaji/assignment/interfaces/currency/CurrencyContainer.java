package com.balaji.assignment.interfaces.currency;
/**
 * 
 * @author spaneos
 *
 */
public class CurrencyContainer {
	/**
	 * 
	 * @param country
	 * @return
	 */
	public static Currency getCurrency(String country) throws IllegalArgumentException {
		if(country.equalsIgnoreCase("india")) {
			India india=new India();
			return india.getCurrency(country);
		}
		else if(country.equalsIgnoreCase("usa")) {
			USA usa=new USA();
			return usa.getCurrency(country);
		}
		else if(country.equalsIgnoreCase("uk")) {
			UK uk=new UK();
			return uk.getCurrency(country);
		}
		else 
			throw new IllegalArgumentException("The country is not valid.");
			
	}
}
/**
 * 
 * @author spaneos
 *
 */
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
/**
 * 
 * @author spaneos
 *
 */
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
/**
 * 
 * @author spaneos
 *
 */
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
