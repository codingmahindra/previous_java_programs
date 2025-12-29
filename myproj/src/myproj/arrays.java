package myproj;
import java.util.Scanner;
public class arrays
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int a[]= new int[size];
		for(int i = 0; i<size;i++) {
			System.out.println("enter element into the array");
			a[i] = sc.nextInt(); 
		}
		for (int i = 0; i<size; i++) {
			System.out.println("the array elements are "+a[i]);
		}
		sc.close();
	}
}