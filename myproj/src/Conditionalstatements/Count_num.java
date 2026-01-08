package Conditionalstatements;

import java.util.Scanner;

public class Count_num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = sc.nextInt();
		int temp = num;
		System.out.println("enter a digit ");
		int digit = sc.nextInt();
		int rem;
		int count = 0;
		
		int sum = 0;
		
		for(int i = temp ; i>0; i = i /10) {
			
			rem = i % 10;
			sum = sum + rem;
			
			
			if(rem == digit) { 
				count++;
			}
			
		}
		System.out.println("count is "+count);
		System.out.println("the sum of the digit in given number "+ sum);

	}
	

}
