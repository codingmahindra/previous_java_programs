package myproj;
import java.util.Scanner;

public class Assememntswitch
{
	public static void main(String []args)

	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter one character ");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'A':
			System.out.println("your enter vowel");
			break;
		case 'e':
		case 'E':
			System.out.println("your enter vowel");
			break;
		case 'i':
		case 'I':
			System.out.println("youe enter vowel");
			break;
			
		case 'o':
		case 'O':
			System.out.println("Your enter vowel");
			break;
			
		case 'u':
		case 'U':
			System.out.println("your enter vowel ");
			break;
			
	   default:
		   System.out.println("Your entered consonsnt value");
		}
		sc.close();
	}
}