package day_7;

import java.util.Scanner;

public class Number {
	
	public static void main (String [] args) {
	
	
	
	
	String [] Numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	
	Scanner scanner = new Scanner (System.in);
	System.out.println("enter the no");
	String input = scanner.nextLine();
	
	if (input.startsWith("0")) {
		
		System.out.println("not start with zero");
	} else {
		
		for (char digit : input.toCharArray()) {
		System.out.print(Numbers [digit - '0'] + " ");
	}
	
	
	}
	
	}
}
