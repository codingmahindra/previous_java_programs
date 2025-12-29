package myproj;
public class Operator
{
	public static void main(String[]ags)
	{
		//arithematic operator (+,-,*,/,%)
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(" a is" + a + "  b is " + b + " sum is "+ c);
		int division = b/a ;
		System.out.println("division is" + division);
		//assignment operator( =,+=,*=,/=,%=)
		int x = 20;
		x += 5; //(x = x+5)
		System.out.println(" "+x);
		// tenary operator
		int s = 30;
		int m = 50;
		int big = (s>m)?s:m;
		System.out.println("the bigest of two numbers is" +big);
		
		
	}
}