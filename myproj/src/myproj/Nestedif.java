package myproj;
import java.util.Scanner;
public class Nestedif
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age ");
		int age  = sc.nextInt();
		if (age > 0) 
		{
			if(age > 18)
			{
				System.out.println("your are major");
				
			}
			else
			{
				System.out.println("your are minar");
				
			}
			
		}
		else
		{
			System.out.println("your entere invalid number");
		}
		sc.close();
		
	}
}