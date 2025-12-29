package myproj;
public class Factorial
{
	public static void main(String []args)
	/*
	{
		int fact =1;
		for(int i = 6; i>=1;i--) {
			fact = fact *i;
		}
		System.out.println(fact);
	}
	*/
	{
		//Amstrong number;
		int num = 153;
		int amstrong = 0;
		/*
		while (num >= 0)
		{
			num = num %10;
			amstrong = amstrong + num *num *num;
			num = num/10;
			num --;
			
		}
		*/
		for(int i = num; i>0; i-- )
		{
			int num1 = num %10;
			amstrong += num1 * num1 *num1;
			num = num /10;
		}
		System.out.println(amstrong);
	}
}
