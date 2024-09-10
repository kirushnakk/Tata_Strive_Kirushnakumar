/**
 * 
 */
package day_7;

import java.util.Scanner;

/**
 * 
 */
public class Goose_egg {

	public class Example25 {
	    public static void main(String args[]) {
	        int n, a = 1, b = 0, c;
	        int[] pellNumbers = new int[20]; // Array to store the first 20 Pell numbers

	        System.out.println("First 20 Pell numbers: ");
	        
	        // Loop to generate and store the first 20 Pell numbers
	        for (n = 0; n < 20; n++) {
	            c = a + 2 * b; // Calculate the next Pell number
	            pellNumbers[n] = c; // Store the Pell number in the array
	            a = b; // Update a
	            b = c; // Update b
	        }

	        // Print the stored Pell numbers from the array
	        for (int i = 0; i < pellNumbers.length; i++) {
	            System.out.print(pellNumbers[i] + " ");
	        }
	    }
	}

		
		 
	
	
	
}
