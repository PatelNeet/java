//Write a Program for File Copy.
package FileHandeling;
import java.io.*;
class FileCopy_9
{
	public static void main(String args[])
	{	try
		{
			FileReader fr=new FileReader("cdac.txt");
			FileWriter fw=new FileWriter("One.txt");//new File banavel che…
			int i;
			while((i=fr.read())!=-1)
			{
				fw.write((char)i);
			}
			fw.close();
			fr.close();
			System.out.println("File Copy Completed");
		}
		catch(Exception e)
		{		e.printStackTrace();		}
	}		
}

