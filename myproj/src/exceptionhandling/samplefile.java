// create a file in folder based location
package exceptionhandling;
import java.io.File;
import java.io.IOException;
public class samplefile
{
	public static void main(String [] args) throws IOException
	{
		File f = new File("C:\\Users\\Admin\\Documents\\mani.txt");
		if(!f.exists())
		{
		 boolean status = f.createNewFile();
		 if(status) {
			 System.out.println("the file created sucessfully" + f.getName());
			 
		 }
		 else {
			 System.out.println("something went wrong");
		 }
		 
		}
		else {
			System.out.println("the file already exists");
		}
		
	}
}
