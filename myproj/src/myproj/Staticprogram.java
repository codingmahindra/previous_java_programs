package myproj;
class man
{
	static int n1;
	int n2;
	void sample()
	{
		n1 = 20;
		n2 = 30;
	}
	void display()
	{
		System.out.println("the value of n1 and n2 is"+n1+ "" + n2);
	} 

}
public class Staticprogram
{
	public static void main(String []args)
	{
		man m = new man();
		m.sample();
		m.display();
		man m1 = new man();
		m1.display();
		
	}
}