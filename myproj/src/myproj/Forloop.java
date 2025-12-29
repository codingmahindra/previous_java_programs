package myproj;
import java.util.Scanner;

public class Forloop
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = num ; i > 1; i--)
		{
			fact = fact*i;
		}
		System.out.println("the factorial of the given number is "+ fact);
		sc.close();
		
	}

	
}