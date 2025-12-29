package acessmodifiers;

public class PublicModifier
{
	int age = 40;
	double salary = 10000;
	public static void main(String []args)
	{  
		PublicModifier m = new PublicModifier();
		System.out.println(m.age);
		System.out.println(m.salary);
	}
	
}