package myproj;

public class ArrayAverage
{
	public static void main(String []args)
	{
		int sum = 0;
		double average =1;
		int a[] = {10,30,40,50};
		for(int i = 0; i < a.length;i++)
		{
			sum = sum + a[i];
		}
		average = sum / (a.length);
		System.out.println(sum + "and"+average);
 	}
}