package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defPasswordLength = 14;
	private String alternateEmail;
	private String companySuffix = "bootsalot.com";
	// Constructor to obtain first name and last name... ("this" refers to the class level variable)
	public Email(String firstName, String lastName) {
		this.firstName = firstName; // passed through firstName parameter 
		this.lastName = lastName; // passed through lastName parameter
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName); // Test Constructor
		
		
		// Call a method that asks for a department, then return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		// Call a method that returns a random password
		this.password = randomPassword(defPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		// Combine elements to generate an email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
		//System.out.println("Your email is: " + email);
		
	}
	
	
	// What department?
	private String setDepartment() {
		System.out.println("Enter department code: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none of the above\n"
				+ "Enter the department code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt(); // Scans next part of input as an "Int"
		if(deptChoice == 1) { return "Sales"; }
		else if (deptChoice == 2) {return "Dev"; }
		else if (deptChoice == 3) {return "Acct"; }
		else { return ""; }
	}
	
	// Generate random password.. Generates a random #, passes it into the array 1 at a time.
	private String randomPassword(int length) {
		String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@$%*()";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	
	// Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change passwords
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Get methods
	public int getMailBoxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; } 
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + " mb";
	}
	
	
}
