package day_7;

import java.util.Scanner;

class Numberplay {
    private int number;

    // Constructor to initialize the number
    public Numberplay(int number) {
        this.number = number;
    }

    // Method to check if the number is valid (two-digit integer)
    public boolean isValid() {
        return number >= 10 && number <= 99;
    }

    // Method to perform the required calculation based on the problem description
    public int calculateDifference() {
        int firstDigit = number / 10;  // Extracts the first digit
        int secondDigit = number % 10; // Extracts the second digit

        if (number > 50) {
            // If the number is greater than 50, return the difference between the digits
            return firstDigit - secondDigit;
        } else {
            // If the number is less than or equal to 50, reverse the number and find the difference
            
            return secondDigit - firstDigit;

        }
    }

    	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int input = scanner.nextInt();
        Numberplay numberPlay = new Numberplay(input);

        // Check if the input is a valid two-digit number
        if (numberPlay.isValid()) {
            // Calculate and print the difference based on the problem logic
            System.out.println(numberPlay.calculateDifference());
        } else {
            // Print "Invalid number" if the input is not a two-digit number
            System.out.println("Invalid number");
        }

        scanner.close();
    }
}

	
	
	
	
	