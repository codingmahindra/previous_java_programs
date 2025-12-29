package myproj;
import java.util.Scanner;

public class MultiArrays
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number rows of do you want");
		int rows = sc.nextInt();
		System.out.println("enter number of columns do you want");
		int columns = sc.nextInt();
		String a[][] = new String[rows][columns];
		System.out.println("enter "+ rows *columns+"elements" );
		for (int i = 0; i<rows; i++)
		{
			for(int j = 0; j <columns; j++)
			{
				a[i][j]= sc.next();
			}
		}
		System.out.println("your entered elements are ");
		for(int i = 0; i<rows ; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		} 
		
		sc.close();
		
	}
}