package myproj;
import java.util.Scanner;

public class Switch
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("1.addition \n 2.subtraction \n 3.multiplication \n 4.division");
		System.out.println("choose your option ");
		int option = sc.nextInt();
		switch(option)
		{
		case 1 : System.out.println("the addition of two numbers is"+ (n1+n2));
		break;
		case 2 : System.out.println("the subtraction of two numbers is " + (n1-n2));
		break;
		case 3: System.out.println("the multiplication of two numbers is" + (n1*n2));
		break;
		case 4: System.out.println("the division of two numbers is "+ (n1/n2));
		break;
		default:
			System.out.println("enter the invalid option");
			break;
				
		}
		sc.close();
	}
}