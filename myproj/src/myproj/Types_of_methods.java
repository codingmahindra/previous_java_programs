package myproj;
import java.util.Scanner;

class Calculator
{
	static Scanner sc = new Scanner(System.in);

	void addition()
	{
		System.out.println("enter the a value is");
		int a = sc.nextInt();
		System.out.println("enter the b value is");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("the sum of two numbers "+ c);
			
	}
	void addition(int a, int b)
	{
		int x = a;
		int y = b;
		int sum = x+y;
		System.out.println(sum);
	}
	int addition1()
	{
		int a = 10;
		int b = 30;
		return a+b;
	}
	int addition1(int a, int b)
	{
		int x = a;
		int y = b;
		return x+y;
	}
	
}
public class Types_of_methods
{
	public static void main (String args [])
	{
		
		Calculator s = new Calculator();
		s.addition();
		s.addition(50,50);
		int sum1 = s.addition1();
		System.out.println("the sum is" + sum1);
		
		int sum2 = s.addition1(20,30);
		System.out.println("the sum is"+sum2);
	}
}