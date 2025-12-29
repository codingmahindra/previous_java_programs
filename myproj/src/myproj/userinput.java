//to find area of rectangle 
package myproj;
import java.util.Scanner;
public class userinput
{
	public static void main(String [] agrs)
	{
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("enter the length of the rectange");
		int length = sc.nextInt();
		System.out.println("enter the breadth of the rectangle");
		int breadth = sc.nextInt();
		int area = length*breadth;
		System.out.println("area of the rectangle is" +area);*/
		
		System.out.println("enter your name");
		System.out.println("enter your rollnumber");
		System.out.println("enter three subject marks ");
		double s1 = sc.nextInt();
		double s2 = sc.nextInt();
		double s3 = sc.nextInt();
		double sum = s1+s2+s3;
		double avg = sum/3;
		System.out.println("the sum is "+sum + "and the average is"+avg );
		sc.close();
		
		
		
		
	}
}