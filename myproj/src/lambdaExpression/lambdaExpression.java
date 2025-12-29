package lambdaExpression;


// functional interface
interface car{
	abstract  void drive();
}

class Audi implements car{
	public void drive() {
		System.out.println("the audi car");
	}
}

/* Audi a = new Audi();
a.drive(); */

public class lambdaExpression{

public static void main(String []args)
{
	Audi a = new Audi();// instance creating for object for data acessing
	a.drive();
	
	 /*// anonymous object creating 
	car c1 = new car()
			{  
		public  void drive() {
			System.out.println("by using anonymous object");
		     }
			};
			c1.drive();
			*/
	
	//LamdaExpressio
	car c1 = () ->
		{
			System.out.println("the lambda expression");
		};
		c1.drive();
		
}


}