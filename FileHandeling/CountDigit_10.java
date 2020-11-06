//Write a Program for Count Digit Example.
package FileHandeling;
import java.io.*;
class CountDigit_10
{
	public static void main(String args[])
	{
		try
		{
			int count=0;

			FileReader fr=new FileReader("cdac.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				char ch=(char)i;
				if(ch>='0' && ch<='8')
				{		
                                    count++;
                                }
			}
			System.out.println("Total Count = "+count);
			fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}		
}

//


