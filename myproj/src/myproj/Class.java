package myproj;
class employee
{
	int age;
	String name;
	double salary;
	void setdetails()
	{
		age = 10;
		name = "mahi";
		salary = 1000;
	}
	void displaydetails()
	{
		System.out.println("employee age is "+ age);
		System.out.println("employee name is "+name);
		System.out.println("employee salary is "+salary);
	}
	public class Class
	{
		public static void main(String args[])
		{
			employee emp = new employee();
			emp.setdetails();
			emp.displaydetails();
		}
	}
}