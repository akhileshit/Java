package com.kodnest.DataStructures01i.Arrays01;

import java.util.Scanner;

public class Demo { // Array of Employees (Employee array) 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the #Employees: ");
		Employee emp[] = new Employee[scan.nextInt()]; // Array of type "Employee" which stores "employee objects addresses/reference address" in its indices. 
		
		for(int i=0; i<emp.length; i++) {
			System.out.println("Enter Name, Age and Salary of employee " + i);
			Employee employee = new Employee(scan.next(), scan.nextInt(), scan.nextInt());
			emp[i] = employee;
		}
		
		System.out.println("Employee Objects Addresses stored in Employee-array:");
		for (int i=0; i<emp.length; i++) {
			System.out.println(emp[i]);
		}
		
		System.out.println();
		
		System.out.print("[");
		for(int i=0; i<emp.length; i++) {
			System.out.print(emp[i].name + " " + emp[i].age + " " + emp[i].salary);
			if(i != emp.length-1)
				System.out.print(" || ");
		}
		System.out.print("]");
	}
}
