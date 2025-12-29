package myproj;
class first
{
	int m;
	void xyz()
	{
		int n = 10;
		System.out.println(""+n);
	}
}
public class defaultvalues
{
	public static void main(String args[])
	{
		first f = new first();
		System.out.println(""+f.m);
		f.xyz();
		
	}
}