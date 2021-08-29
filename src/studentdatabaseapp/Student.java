package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int courseCost = 600;
	private static int id = 1001; // static is not specific to an object, belongs to class
	
	// Constructor that prompts user name and a year
	public Student() {
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("Enter student class level: "
				+ "\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior");
		this.gradeYear = in.nextLine();
		
		setStudentID();
	}
	
	// Generate an ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Loop, user enters '0' when finished
		do {
			System.out.println("Enter course to enroll (Type 'X' to finish): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("X")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + courseCost;
			}
			else { 
				break; }
		} while (1 != 0); // Forever
		
		System.out.println("ENROLLED IN: " + courses);
	}
	
	
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is : $" + tuitionBalance);
		
	}
	
	
	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Please enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of: $" + payment);
		viewBalance();
	}

	// Show status
	public String toString() {
		return "\nName: " + firstName + " " + lastName +
				"\nGrade Level: "  + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourse(s) Enrolled: " + courses + 
				"\nBalance: $" + tuitionBalance;
				

	}
	
}
