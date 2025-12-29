package myproj;
class Employee
{
	int sal;
	int age;
	static String name;
	
	Employee(int sal, int age,String name)
	{
		this.sal =sal ;
		this.age = age ;
		Employee.name = name;
		System.out.println("the sal and age is" +sal +"  " +age + ""+ name);
		
	}
	Employee()
	{
		System.out.println("no agruments passing");
		
	}
}
public class Constructor
{
	public static void main(String []args)
	{
		Employee e = new Employee(10000,45,"mahindra");
		Employee e1 = new Employee();
		System.out.println(e1.sal);
		System.out.println(e1.age);
		System.out.println(Employee.name);
			
	}
}