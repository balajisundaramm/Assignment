package com.balaji.assignment.exception.emp;


import com.balaji.assignment.customexception.LowSalException;
import com.balaji.assignment.utill.UserInputValidations;
/**
 * 
 * @author spaneos
 *
 */
public class EmpDetails {
	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		int ch=0;
		boolean flag=true;
		Emp emp=null;
		while (flag) {
			System.out.println("Enter 1 to create employee");
			System.out.println("Enter 2 to print employee details");
			System.out.println("Enter 3 to calculate HRA");
			System.out.println("Enter 4 to exit");
			ch=UserInputValidations.validateInteger();
			switch (ch) {
			case 1:
				System.out.println("Creating Employee");
				System.out.println("Enter the name of the employee");
				String name=UserInputValidations.validateString();
				System.out.println("Enter employee's id");
				int id=UserInputValidations.validateInteger();
				System.out.println("Employee's designation");
				System.out.println("Enter 1 to choose manager");
				System.out.println("Enter 2 to choose officer");
				System.out.println("Enter 3 to choose clerk");
				boolean b=true;
				String designation="";
				while(b) {
					int option=UserInputValidations.validateInteger();
					switch (option) {
					case 1:
						designation="manager";
						b=false;
						break;
					case 2:
						designation="officer";
						b=false;
						break;
					case 3:
						designation="clerk";
						b=false;
						break;

					default:
						System.out.println("Enter only 1 to 3");
						b=true;
						break;
					}
				}
				System.out.println("Enter employee's salary");
				double basic=UserInputValidations.validateDouble();
				emp=new Emp(name, id, designation, basic);
				System.out.println("The employee has been created successfully!!!");
				flag=true;
				break;
			case 2:
				System.out.println("Printing employee details");
				if(emp!=null) {
					try {
						emp.printDEP();
					} catch (LowSalException e) {
						e.printStackTrace();
					}
				}
				else {
					System.out.println("Create employee first and then print deatils");
				}
				flag=true;
				break;
			case 3:
				System.out.println("Calculating HRA");
				if(emp!=null) {
					double hra=0;
					try {
						hra = emp.calculateHRA();
						System.out.println("The hra of the employee "+emp.getName()+" is : "+hra);
					} catch (LowSalException e) {
						System.out.println(e.getMessage());
					}
				}
				else {
					System.out.println("Create employee first and then calculate hra");
				}
				flag=true;
				break;
			case 4:
				System.out.println("Thank you!!!");
				flag=false;
				break;
			default:
				System.out.println("Enter only 1 to 4");
				flag=true;
				break;

			}

		}
	}
}
