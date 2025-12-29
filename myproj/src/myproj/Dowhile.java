package myproj;

import java.util.Scanner;

public class Dowhile {
	public static void main(String arg [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the current balance");
		int currentBalance = sc.nextInt();
		System.out.println("your current balance "+currentBalance);
		int n;
		do {
		System.out.println(".......display menu........");
		System.out.print("1.Deposit \n 2.withdraw \n 3.display balance \n 4.exit");
		System.out.println("choose your choice ");
		 n = sc.nextInt();
		 switch(n)
		 {
		 case 1: System.out.println("your current balance is "+currentBalance);
		 			System.out.println("enter your deposit amount");
		 			int deposit = sc.nextInt();
		 			currentBalance = (currentBalance + deposit); 
		 			System.out.println("your currentbalance is"+currentBalance);
		 			break;
		 case 2:System.out.println("your current balance is"+currentBalance);
		 		System.out.println("enter your withdraw amount is ");
		 		int withdrawAmount = sc.nextInt();
		 		if(currentBalance < withdrawAmount)
		 		{
		 			System.out.println("insufficent balance");
		 			
		 		}
		 		else
		 		{
		 			currentBalance = (currentBalance - withdrawAmount);
		 			System.out.println("your current Balance "+currentBalance);
		 			
		 		}
		 		break;
		
		 case 3:System.out.println("your current balance "+currentBalance);
		 		break;
		 case 4 :System.out.println("exit");
		 default:
			 System.out.println("entered invalid option");
		 
		 }
		
		}
		while(n != 4);
		sc.close();
	}
}