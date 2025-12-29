package myproj;
public class whileloop
{
	public static void main(String args[])
	{
		int i = 1;
		/*
		while (i < 10)
		{
			System.out.print(i+" ,");
			i++;  
		}
		*/
		while (i < 100)
		{
			if(i%2 == 0)  
			{
				System.out.println( i+" ");
			
			}
			i++;
		}
	}
}