package exercise;

import java.util.Scanner;

public class grade {
	public static void main(String[] args) {
		/*
		 * A school needs to computerize its gradebook. Develop a program that asks how
		 * many students the class has and then store each of the 4 notes that each
		 * student in the class has. In the end the program must present a report with
		 * the grades per student, the average, and whether the student passed or failed
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of students: ");
		int totalStudents = sc.nextInt();
		
		double grade[][] = new double[totalStudents][4];
		double average = 1;
		double addition = 0;
		
		for (int line = 0; line < totalStudents; line++) {
			for (int col = 0; col < 4; col++) {
				System.out.println("Enter a grade:");
				grade[line][col] = sc.nextDouble();		
			}
		}
		
		
		for (int line = 0; line < totalStudents; line++) {
			System.out.println("STUDENT " + line + ":");
			for (int col = 0; col < 4; col++) {	
				
				addition += grade[line][col];
				System.out.println("Grade "+ (col+1) + ": " + grade[line][col]);
				
			}	
			
			average = addition / 4;
			
			System.out.println();
			System.out.println("Final situation: " + average);
			
			if (average > 7.0) {
				System.out.println("The student " + line + " PASSED");
			} else {
				System.out.println("The student " + line + " FAILED");
			}
			
			average = 0;
			addition = 0;
			
			System.out.println("____________________________________________________");
		}
	
		sc.close();
	}
}
