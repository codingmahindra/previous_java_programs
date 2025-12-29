package exceptionhandling;
public class ArithematicNull
{
	public static void main(String args[])
	{
		try 
		{
			int a = 10/0;
			System.out.println(a);
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
}