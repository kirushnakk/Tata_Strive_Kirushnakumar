package day_8;

import java.util.Scanner;

public class Magicplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the length of array");
		int length = sc.nextInt();
		if (length>5 || length<1) {
			System.out.println("invalid array");
			return;
		}
		
		int [] numbers = new int [length];
		System.out.println("enter the no's");
		for (int i=0;i<length;i++)
		{
			numbers[i]=sc.nextInt();
		}
		if (numbers[i]<= 0 || numbers[i] >= 100) {
			
			
			
		}
		

	}

}
