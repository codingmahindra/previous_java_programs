package exceptionhandling;
import java.util.Scanner;
public class Arithematicexpression1
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in); 
		System.out.println("enter a number ");
		int a = s.nextInt();
		System.out.println("enter a number");
		int b = s.nextInt();
		try
		{
			System.out.println("try");
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch");
			e.printStackTrace();
		}
		s.close();
	}
	
	
}