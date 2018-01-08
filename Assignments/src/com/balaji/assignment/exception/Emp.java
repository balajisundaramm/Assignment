package com.balaji.assignment.exception;

import com.balaji.assignment.customexception.LowSalException;

/**
 * 
 * @author spaneos
 *
 */
public class Emp {
	private String name;
	private int id;
	private String designation;
	private double basic;
	private double hra;
	/**
	 * Parameterized Constructor to create employee object
	 * @param name Input value-String-Employee name
	 * @param id Input value-Integer-Employee id
	 * @param designation Input value-String
	 * @param basic Input value-double
	 */
	public Emp(String name, int id, String designation, double basic) {
		super();
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.basic = basic;
	}
	
	/**
	 * @return the hra double
	 */
	public double getHra() {
		return hra;
	}
	/**
	 * @param hra the hra to set
	 */
	public void setHra(double hra) {
		this.hra = hra;
	}

	/**
	 * @return the name Input value-String
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @return the basic
	 */
	public double getBasic() {
		return basic;
	}
	
	public void printDEP() throws LowSalException {
		double hra=0;
		hra=(this.basic>=500)?calculateHRA():hra;
		
		this.setHra(hra);
		System.out.println(this);
	}
	/**
	 * @return the hra
	 * @throws LowSalException To maintain minimum balance
	 */
	public double calculateHRA() throws LowSalException {
		String designation=this.getDesignation();
		double basic=this.getBasic();
		double hra=0;
		if(basic>500) {
			if(designation.toLowerCase().equals("manager")) {
				hra=((basic/100)*10);
				return hra;
			}
			else if(designation.toLowerCase().equals("officer")) {
				hra=((basic/100)*12);
				return hra;
			}
			else if(designation.toLowerCase().equals("clerk")) {
				hra=((basic/100)*5);
				return hra;
			}
		}
		else {
			throw new LowSalException("Minimum salary should be 500 to calculate hra");
		}

		return hra;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", designation=" + designation + ", basic=" + basic + ", hra=" + hra
				+ "]";
	}
	

}
