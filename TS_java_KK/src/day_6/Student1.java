package day_6;

import java.util.Scanner;

public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Enter Student Id");
		 Scanner scanner = new Scanner(System.in);
	        int studentId = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.println("Enter Student name");
	        String studentName = scanner.nextLine();

	        System.out.println("Enter Department name");
	        String department = scanner.nextLine();

	        System.out.println("Enter gender");
	        String gender = scanner.nextLine();

	        System.out.println("Enter category");
	        String category = scanner.nextLine();

	        System.out.println("Enter College fee");
	        double collegeFee = scanner.nextDouble();

	        

	}

}
