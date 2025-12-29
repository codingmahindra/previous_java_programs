package Collection;
import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueOperations
{
	public static void main(String []args)
	{
		Queue <Integer> Qu = new PriorityQueue<>(Comparator.reverseOrder()); //creating object for that priority queue
		Qu.add(40);//add is method to add elements into priority queue
		Qu.add(20);
		Qu.add(40);
		Qu.add(10);
		System.out.println(Qu);
		Qu.remove();
		System.out.println(Qu);
		System.out.println(Qu.peek());

		
	}
}