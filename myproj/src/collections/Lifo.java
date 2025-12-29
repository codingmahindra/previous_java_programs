package collections;
import java.util.*;
public class Lifo
{
	public static void main(String []args)
	{
		Stack<String > s =new Stack<>();
		s.add("black");
		s.add("yellow");
		s.add("white");
		s.push("green");
		s.pop();
		System.out.println(s);
		
	}
}