package myproj;
public class Breakandcontinue{

public static void main(String args[])
{
	for(int i = 0; i < 20; i++)
	{
		if (i == 6) {
			continue;//break
		}
		System.out.println(""+i);
	}
}
}