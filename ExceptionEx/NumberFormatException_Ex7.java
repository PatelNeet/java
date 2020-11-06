//Write a Program for Simple Number Format Exception Handling.
package ExceptionEx;
import java.util.Scanner;
public class NumberFormatException_Ex7 
{
    public static void main(String[] args) 
    {
        try
        {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter any String = ");
            String s1=sc.next();   //IN OUTPUT WE WILL GIVES STRING THAN PRINT CATCH ERORR!
            int a=Integer.parseInt(s1);  //STRING WILL CONVERT IN INTEGER SO GIVES INTEGER INPUT!
            System.out.println("a = "+a);
        }
        catch(NumberFormatException e)
        {  
            System.out.println("Not a proper format....");	
        }
    }
}
