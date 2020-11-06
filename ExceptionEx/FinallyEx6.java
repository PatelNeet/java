package ExceptionEx;
public class FinallyEx6 
{
    public static void main(String[] args) {
        int i,x,con=2;
        for(i=1;i<4;i++)
            try
            {
                x=25/(con-i);
                System.out.println("quot="+x);
            }
        catch(ArithmeticException e)
        {
            System.out.println("divide by zero error for i="+i);
        }
        finally
            {
                System.out.println("Exception or no Exception this will be printed always");
            }
    }
}
