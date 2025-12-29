package collections;
import java.util.*;

public class StackOperation
{
	public static void main(String []args)
	{
		Stack<String> s = new Stack<>();
		s.add("book");
		s.add("paper");
		s.add("pen");
		System.out.println("the elements is "+s);
		System.out.println("the push operation is "+s.push("pencil"));
		System.out.println("elements in pushoperation "+s);
		System.out.println("the elements in pop operation is "+ s.pop());
		System.out.println("pop operation is "+s);
	}
}