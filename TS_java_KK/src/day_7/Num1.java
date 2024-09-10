package day_7;

import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        // Array containing names of numbers from 0 to 9
        String[] numberNames = {"zero", "one", "two", "three", "four",
                                "five", "six", "seven", "eight", "nine"};

        // Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        String input = scanner.nextLine(); // Read the input number as a string

        // Check if the number starts with zero
        if (input.startsWith("0")) {
            System.out.println("Number should not start with zero");
        } else {
            // Loop through each character in the input string
            for (char digit : input.toCharArray()) {
                // Convert character to its numeric value and print the corresponding name
                System.out.print(numberNames[digit - '0'] + " ");
            }
        }

        scanner.close(); // Close the scanner
    }
}
