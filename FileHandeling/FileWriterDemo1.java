// Write a Program for File Writer.
package FileHandeling;
import java.io.*;
 class FileWriterDemo1
 {
	 public static void main(String args[])
	 {	try
		{
			FileWriter fw = new FileWriter("cdac.txt");
			for(int i = 0;i<=12;i++)
			{
				fw.write("Line-"+i+ "\n");
			}
			fw.close();
		}
		catch(Exception e)
		{		System.out.println("Exception: "+e);		}
	}
 }



