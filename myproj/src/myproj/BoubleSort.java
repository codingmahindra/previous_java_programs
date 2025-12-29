package myproj;
public class BoubleSort
{
	public static void main (String []args)
	{
		int temp = 0;
		int a[] = {30,10,50,40};
		for(int i = 0; i<a.length;i++)
		{
			for(int j =0; j<a.length-i-i;j++)
			{
				if(a[j]>a[j+i])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp; 
				}
				
			}
		}
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}
}