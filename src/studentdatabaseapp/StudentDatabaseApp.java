package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
	
	public static void main(String[] args) {
	
	// Ask how many students we want to add to the system
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		
		// Create i number of new students
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println("\n");
			System.out.println(students[i].toString());
		}
	}
}