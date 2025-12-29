package myproj;
class program
{
	int age;
	String name;
	double salary;
	void setdetails(int age,String name,double salary)
	{
		this.age = age;
		this.name = name;
		this.salary = salary;
		
	}
	void displaydetails()
	{
		System.out.println("your age is"+age);
		System.out.println("your name " +name);
		System.out.println("your salary is "+salary);
		
	}
}

public class Oopsprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program emp = new program();
		emp.setdetails(18,"mahi",2000);
		emp.displaydetails();
		

	}

}
