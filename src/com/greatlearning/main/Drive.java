package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Drive {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String department = "";

		System.out.println("Inpur firstName : ");
		String firstName = sc.next();

		System.out.println("Inpur lastName : ");
		String lastName = sc.next();

		displayDepartment();
		Employee emp = null;

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			department = "tech";
			break;

		case 2:
			department = "adm";
			break;

		case 3:
			department = "hr";
			break;

		case 4:
			department = "lg";
			break;

		default:
			System.out.println("Wrong choice!");
			return;
		}

		if (department != "") {
			emp = new Employee(firstName, lastName, department);
			CredentialService cs = new CredentialService();
			
			String email = cs.generateEmailAddress(emp);
			String password = cs.generatePassword();
			cs.showCredentials(emp,email,password);

		} else
			System.out.println("Department is null");

	}

	private static void displayDepartment() {
		System.out.println("Please input the choice for department : ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resorces");
		System.out.println("4. Legal");
	}

}
