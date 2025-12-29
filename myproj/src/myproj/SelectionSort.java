package myproj;
public class SelectionSort
{
	public static void main(String []args)
	{
	int a[]= {39,19,29,15,12,5};
	for(int i = 0; i<a.length; i++)
	{
		int min = 0;
		int temp = 0;
		for(int j=i+1; j< a.length; j++)
		{
			if(a[j] < a[min])
			{
				min = j;
				
			}
			temp = a[i];
			a[i] =a[min];
			a[min] =temp;
			
		}

		
		for(i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}
	}
	
}