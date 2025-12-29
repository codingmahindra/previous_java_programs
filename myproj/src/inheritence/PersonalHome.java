package inheritence;

public class PersonalHome extends Loan 
{
	public static void main(String []args)
	{
		PersonalHome p = new PersonalHome();
		String details = p.getDetails();
		double Sal = p.Salary();
		System.out.println("the details " +details);
		System.out.println("the Salary is "+Sal);
	}
	

}
