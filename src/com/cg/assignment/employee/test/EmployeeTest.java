package com.cg.assignment.employee.test;
/*
 * This is a program which takes the employee details as an input and calls the employee class
 * Employee class calculates the annual salary, tax to be paid and other such details
 * All the calculated results are then printed
 */
import java.util.Scanner;

import com.cg.assignment.employee.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee Name");
		employee.setEmployeeName(scanner.nextLine());

		System.out.println("Enter Employee ID");
		employee.setEmployeeId(scanner.nextInt());

		System.out.println("Enter Monthly salary");
		employee.setMonthlyBasicSalary(scanner.nextDouble());

		System.out.println(employee);
	}

}