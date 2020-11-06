//Write a Program for File Write & Read Demo.
package FileHandeling;
import java.io.*;
class FileWriteReadDemo_3
{
	public static void main(String args[])
	{
		try
		{
			int i;
			FileWriter fw = new FileWriter("Chhaya.txt");
			for(i=0;i<=10;i++)
			{
				fw.write("Chhaya "+i+ "\n");
			}
			fw.close();
			FileReader fr = new FileReader("Chhaya.txt");
			while((i= fr.read())!= -1)
			{
				System.out.print((char)i);
			}
			fr.close();
		}
		catch(Exception e)
		{			
                    System.out.println("Exceptoin : "+e);	
                }
	}		
}
//
