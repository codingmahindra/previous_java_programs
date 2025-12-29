package exceptionhandling;

/*
import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) {
        // Use double backslashes for Windows path or a raw path
        File f = new File("C:\\Users\\Admin\\Documents\\mahi.txt");
        
        try {
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
} */

import java.io.File;

public class File1
{
	public static void main(String [] args)
	{
		File f = new File("C:\\Users\\Admin\\Documents\\maha.txt");
		
		try
		{
			f.createNewFile();
			System.out.println("the file name is "+ f.getName());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}


