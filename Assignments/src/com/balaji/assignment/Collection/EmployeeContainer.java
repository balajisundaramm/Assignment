package com.balaji.assignment.Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * 
 * @author spaneos
 *
 */
public class EmployeeContainer {
	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		Set<Employee> employees= new HashSet<Employee>();
		Scanner sc2=new Scanner(System.in);
		Employee e1=null;

		int ch=0;
		boolean flag=true;
		while(flag) {
			System.out.println("Enter 1 to add employee");
			System.out.println("Enter 2 to delete employee");
			System.out.println("Enter 3 to view employee");
			System.out.println("Enter 4 to view employees");
			System.out.println("Enter 5 to exit");
			Scanner sc=new Scanner(System.in);

			if(sc.hasNextInt()) {
				ch=sc.nextInt();
				flag=false;
			}
			else {
				System.err.println("Enter only numbers");
				flag=true;
				continue;
			}

			switch (ch) {
			case 1:
				System.out.println("Adding Employess to the container");
				System.out.println("Enter the employee name");
				String name=sc2.nextLine();
				boolean choice=true;
				int id=0;
				while(choice) {
					System.out.println("Enter the employee id (ex:101)");
					sc=new Scanner(System.in);
					if(sc.hasNextInt()) {
						id=sc.nextInt();
						choice=false;
					}
					else {
						System.out.println("Enter only numbers");
						choice=true;
					}
				}
				System.out.println("Enter the employee job");
				String job=sc2.nextLine();
				//Creating Employee object
				e1=new Employee(name, id, job);
				// adding the employee to the set
				if(employees.add(e1)) {
					System.out.println("Employee has been added successfully!!!");
				}
				else {
					System.out.println("The employee already exists");
				}
				flag=true;
				break;
			case 2:
				System.out.println("Removing the employee");
				if(e1!=null) {
					choice=true;
					while(choice) {
						if(employees.size()!=0) {
							System.out.println("Enter the employee id");
							sc=new Scanner(System.in);
							if(sc.hasNextInt()) {
								id=sc.nextInt();
								for (Employee employee : employees) {
									if(id==employee.getEno()) {
										employees.remove(employee);
										System.out.println("The employee has been removed successfully!!!");
										choice=false;
										break;
									}
									else {
										System.out.println("Sorry, Employee is not found.");
										choice=false;
										break;
									}
								}
							}
							else {
								System.out.println("Enter only numbers");
								choice=true;
							}
						}
						else {
							System.out.println("there are no employees");
							break;
						}
					}
				}
				else {
					System.out.println("There are no employees...");
				}
				flag=true;
				break;
			case 3:
				System.out.println("View the employee");
				if(e1!=null) {
					id=0;
					choice=true;
					while(choice) {
						if(employees.size()!=0) {
							System.out.println("Enter the employee id");
							sc=new Scanner(System.in);
							if(sc.hasNextInt()) {
								id=sc.nextInt();
								choice=false;
							}
							else {
								System.out.println("Enter only numbers");
								choice=true;
							}
							for (Employee employee : employees) {
								if(id==employee.getEno()) {
									System.err.println("Employee details:");
									System.out.println(employee);
									choice=false;
								}
								else {
									System.out.println("Sorry, Employee is not found.");
									choice=false;
								}
							}
						}
						else {
							System.out.println("There are no employees");
							break;
						}
					}
				}
				else {
					System.out.println("There are no employees");
					break;
				}
				flag=true;
				break;
			case 4:
				System.out.println("View all employees");
				if(employees.size()!=0){
					System.out.println(employees);
				}
				else {
					System.out.println("There are no employeess");
					break;
				}
				flag=true;
				break;
			case 5:
				System.out.println("Thank you!!!");
				flag=false;
				break;
			default:
				System.err.println("Enter only 1 to 5");
				flag=true;
				break;
			}
		}
	}

}
