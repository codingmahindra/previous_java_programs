package exceptionhandling;
import java.util.Scanner;

public class ArrayString
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[3];
		try {
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		for(int i = 0; i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		sc.close();
	}
	
}