//Write a Program for ArrayIndex Exception Handling.
package ExceptionEx;
public class ArrayIndexEx8
{    	public static void main(String[] args) 
    	{
        try
        {
        int a[]=new int[3];
        
        a[0]=10;      
        a[1]=20;     
        a[2]=30;     
        a[3]=40; // THIS WILL GENERATE ERORR ! WHICH WILL CATCH BY CATCH FUNCTIONS...
      
        }
        catch(ArrayIndexOutOfBoundsException e)
         {                    
             System.out.println("u r out of limit");      
         }
        }
  }

