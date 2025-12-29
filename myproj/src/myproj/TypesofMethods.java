package myproj;
public class TypesofMethods
{
	public static void main(String []args)
	{
		TypesofMethods t = new TypesofMethods();
		t.addition();
		t.addition(20,30);
		
	}
	
void addition()
{
	System.out.println("addition perform only");
	int a = 10;
	int b = 20;
	System.out.println(""+ a+b);
	
}
void addition (int a, int b)
{
	System.out.println("passing arguments");
	System.out.println(" "+ a+b);
}


}