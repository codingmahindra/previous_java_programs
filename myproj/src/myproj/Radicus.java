package myproj;
import java.util.Scanner;

public class Radicus
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radicus");
		double radicus1 = sc.nextDouble();
		double radicus2 = sc.nextDouble();
		double pi = 3.14;
		double area = pi*radicus1*radicus2;
		System.out.println("the radicus of the circle is " + area);
		sc.close();
		
	}
	
}