package myproj;
class boreddy
{
	int age; // instance variable
	String name; // instance variable
	static double salary; // static variable
	static String city; // static variable(name of the memory location)	
}
public class Variable
{
	public static void main(String []args)
	{
		int a ;
		a = 10;
		System.out.println(""+a);
		System.out.println(""+boreddy.salary);
		boreddy b = new boreddy();
		b.age = 22;
		b.name = "mahendra";
		boreddy.salary = 2000000;
		boreddy.city = "kanigiri";
		System.out.println("age is "+ b.age);
		System.out.println("name is"+ b.name );
		System.out.println("salary"+boreddy.salary);
		System.out.println("city"+boreddy.city);
		boreddy b2 = new boreddy();
		b2.age = 25;
		b2.name = "vishnu";
		boreddy.salary = 300000;
		boreddy.city = "vengalapuram";
		System.out.println("age is "+ b2.age);
		System.out.println("name is"+b2.name);
		System.out.println("salary is "+boreddy.salary);
		System.out.println("city is "+ boreddy.city);
		
	}
}
