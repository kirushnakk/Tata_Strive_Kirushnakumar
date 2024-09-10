package day_7;

import java.util.Scanner;

public class Ex {
	
	 public static void main(String args[]) {
	        int n, a = 1, b = 0, c;
	        int[] pellNumbers = new int[20]; // Array to store the first 20 Pell numbers

	        System.out.println("First 20 Pell numbers: ");
	        
	        // Loop to generate and store the first 20 Pell numbers
	        for (n = 1; n < 20; n++) {
	            c = a + 2 * b; // Calculate the next Pell number
	            pellNumbers[n] = c; // Store the Pell number in the array
	            a = b; // Update a
	            b = c; // Update b
	        }

	        // Print the stored Pell numbers from the array
	        for (int i = 1; i < pellNumbers.length; i++) {
	            System.out.print(pellNumbers[i] + " ");
	        }
	        
	        Scanner sc = new Scanner(System.in);
			System.out.println("enter the day");
			String day14  = sc.nextLine();
			
			for (char d : day14.toCharArray()) {
				System.out.print(pellNumbers[d - '0'] );
			
	    }

}
}
