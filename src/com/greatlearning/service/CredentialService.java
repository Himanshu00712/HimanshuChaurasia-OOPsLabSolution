package com.greatlearning.service;

import java.security.SecureRandom;

import com.greatlearning.model.Employee;

public class CredentialService {

	public String generateEmailAddress(Employee emp) {

		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + emp.getDepartment()
				+ ".abc.com";

	}

	public String generatePassword() {

		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\\\|;:\\'\\\",<.>/?";

		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 8; i++) {
			int randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}

		return sb.toString();

	}

	public void showCredentials(Employee emp, String email, String password) {

		System.out.println("Dear " + emp.getFirstName() + " - here are your credentials");
		System.out.println("Email Address--> "+email);
		System.out.println("Pasword--> "+password);

	}

}
