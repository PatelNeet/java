//Write a Program for File Buffer Writer.
package FileHandeling;
 import java.io.*;
class BufferWriterDemo_4
{
	public static void main(String args[])
	{
		try
		{
			FileWriter fw = new FileWriter("Asha.txt");//navi file banse.
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<=12;i++)
			{
				bw.write("Line-"+i+ "\n");
			}
			bw.close();
		}
		catch(Exception e)
		{		e.printStackTrace();		}
	}		
}



 
