package com.balaji.assignment.exception;

import com.balaji.assignment.utill.UserInputValidations;
/**
 * 
 * @author spaneos
 *
 */
public class Employee {
	private String empName;
	private int empNumber;
	private float experience;

	/**
	 * 
	 * @param empName
	 * @param empNumber
	 * @param experience
	 */
	public Employee(String empName, int empNumber, float experience) {
		super();
		this.empName = empName;
		this.empNumber = empNumber;
		this.experience = experience;
	}
	
	

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empNumber=" + empNumber + ", experience=" + experience + "]";
	}


	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		int ch=0;
		boolean flag=true;
		while (flag) {
			System.out.println("Enter 1 to create employee");
			System.out.println("enter 2 to exit");
			ch=UserInputValidations.validateInteger();
			switch (ch) {
			case 1:
				System.out.println("Enter employee's name");
				String empName=UserInputValidations.validateString();
				System.out.println("Enter employee's id ex:123");
				int empNumber=UserInputValidations.validateInteger();
				System.out.println("Enter employee's experience");
				float experience=UserInputValidations.validateFloat();

				if(experience>2.5 && experience<3.6) {
					Employee employee=new Employee(empName, empNumber, experience);
					System.out.println(employee);
				}
				else {
					throw new IllegalArgumentException("To become an employee, Experience should be 2.6 to 3.5");
				}
				flag=true;
				break;
			case 2:
				System.out.println("Thank you!!!");
				flag=false;
				break;
			default:
				System.out.println("Enter only 1 to 2");
				flag=true;
				break;
			}

		}
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Thank you!!!");
		}
	}


}
