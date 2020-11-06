//Write a Program for Custom Exception Handling with Finally.
package ExceptionEx;
import java.util.*;
class cdacException13 extends Exception
{
	public cdacException13(String message)
	{		super(message);	}
}
class CustomExceptionEx_2
{	public static void main(String args[])
	{
		try
		{
			int i,j;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter value for i = ");
			i=s.nextInt();
			if(i%5==0)
			{
			throw new cdacException13("You cannot enter value 5 na gunak ma");
			}
			System.out.print("Enter value for j = ");
			j=s.nextInt();
			if(j%5==0)
			{
			throw new cdacException13("You cannot enter value 5 na gunak ma");
			}
			System.out.println("Addition = "+(i+j));
		}
		catch(cdacException13 e)
		{			e.printStackTrace();		}
		catch(Exception e)
		{			e.printStackTrace();		}
		finally
                    
		{			System.out.println("Program Complete");		}
	}
}

