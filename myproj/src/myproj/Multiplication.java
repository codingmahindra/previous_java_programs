package myproj;
import java.util.Scanner;
public class Multiplication
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		for(int i = 1; i<= 10;i++)
		{
			int multiply = n*i;
			System.out.println( n +"*"+i +"=" +multiply);
		}
		sc.close();
		
	}
}