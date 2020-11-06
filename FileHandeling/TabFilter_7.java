//Write a Program for Tab Filter Example.
package FileHandeling;
import java.io.*;
class TabFilter_7
{
	public static void main(String args[])
	{
		try
		{
			FileReader fr=new FileReader("cdac.txt");
			FileWriter fw=new FileWriter("Two.txt");//navi file che..
			int i;
			while((i=fr.read())!=-1)
			{
				char ch=(char)i;
				if(ch=='\t')
				{	
                                    ch='n'; // aa line nai j aavew vche n me lkhiyo 
                                  //  ch='';
                                }
				fw.write(ch);
			}
			fw.close();	
                        fr.close();
		}
		catch(Exception e)
		{		
                    e.printStackTrace();
                }
	}
}
//import java.io.FileInputStream;

        
