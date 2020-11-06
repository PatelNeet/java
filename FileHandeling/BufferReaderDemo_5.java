
package FileHandeling;
import java.io.*;
class BufferReaderDemo_5
{
	public static void main(String args[])
{
		try
		{
			FileReader fr= new FileReader("Asha.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine())!=null)
			{
				System.out.println(s);
			}
			br.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}		
}
