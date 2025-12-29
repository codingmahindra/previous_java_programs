package myproj;
import java.util.Scanner;
public class Facttable
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; i <= 5; i++ )
		{
			System.out.println("");
			int n = sc.nextInt();
			int fact = 1;
			for ( int j = n; j> 0; j--)
			{
				
				fact = fact *i;
			}
				System.out.println("the number -------- factorial value" ) ;
				System.out.println( n+ "---------------- "+fact);
				
				sum = sum+fact;
			
			
		}
		System.out.println("sum is"+sum);
		sc.close();
	}
}