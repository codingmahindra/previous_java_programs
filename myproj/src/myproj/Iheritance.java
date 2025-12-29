package myproj;
class animal
{
	void eat()
	{
		System.out.println("animal eat food");
	}
}
class dog
{
	animal e = new animal();
	
	void bark()
	{
		e.eat();
		System.out.println("the dog is bark");
		
	}
}
public class Iheritance{
	public static void main(String ags[])
	{
		dog d = new dog();
		d.bark();
		
	}
	
}