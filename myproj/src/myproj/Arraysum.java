package myproj;
import java.util.Scanner;
public class Arraysum
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int a [] = new int [5];
		int sum = 0;
		for(int i = 0; i < size;i++)
		{
			System.out.println("enter the values");
			a[i]= sc.nextInt();
			sum = sum +a[i];
			
			
		}
		System.out.println("the sum of the array"+sum );
		sc.close();
		
		
	}
}