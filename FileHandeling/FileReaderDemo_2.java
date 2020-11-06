// Write a Program for File Reader.
package FileHandeling;
import java.io.*;
class FileReaderDemo_2
{
	public static void main(String args[])
	{	try
		{
			FileReader fr = new FileReader("cdac.txt");
			int i;
			while((i=fr.read())!=-1)
			{	
                            System.out.print((char)i);	
                        }
			fr.close();
		}
		catch(Exception e)
		{	
                    System.out.println("Exception : "+e);	
                }
	}		
}
