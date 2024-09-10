package day_1;
import java.util.*;

public class Oxygen {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the no");
		
		int n = sc.nextInt();
		
		 if (n < 1000 || n > 9999) {
	            System.out.println("Invalid input! Please enter a four-digit number.");
	            return;
	            
		 }
		 int number = n, reverse = 0;  
		 while(number != 0)   
		 {  
		 int remainder = number % 10;  
		 reverse = reverse * 10 + remainder;  
		 number = number/10;  
		 }  
		 System.out.println("The reverse of the given number is: " + reverse); 
		 
		 
		 int sumOfDigits = 0;
	        int temp = reverse;
	        
	        while (temp != 0) {
	            int digit = temp % 10;
	            sumOfDigits += digit;
	            temp = temp / 10;
	        }
	        System.out.println("The sum of the digits of the reversed number is: " + sumOfDigits);
		
		
		
	}
	
	
	

}
