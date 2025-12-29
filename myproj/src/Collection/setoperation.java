package Collection;
//import java.util.LinkedHashSet;
import java.util.TreeSet;


public class setoperation
{
	public static void main(String [] args)
	{
		/*
		HashSet<Integer> Se = new HashSet<>();
		Se.add(10);
		Se.add(20);
		System.out.println(Se);
		Se.add(30);
		Se.add(40);
		Se.add(10);
		System.out.println(Se);
		Se.remove(30);
		*/
		/*
		LinkedHashSet<Integer> Lhs = new LinkedHashSet<>();
		Lhs.add(10);
		Lhs.add(20);
		Lhs.add(30);
		System.out.println(Lhs);
		Lhs.remove(30);
		System.out.println(30);
		System.out.println(Lhs);
		*/
		TreeSet <Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		
		
	}
	
}