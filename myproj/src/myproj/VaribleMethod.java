package myproj;
class Mahi
{
	public void start()
	{
		System.out.println("started");
	}
	public void end()
	{
		System.out.println("ended");
		
	}
	static void begin()
	{
		System.out.println("begininng");
		Mahi m = new Mahi(); 
			m.start();
		
	}
	static void destroyed()
	{
		System.out.println("destroying ");
	}
}

public class VaribleMethod
{
	public static void main(String []args)
	{
	Mahi.begin();	
	Mahi m = new Mahi();
	m.start();
	m.end();
}
}