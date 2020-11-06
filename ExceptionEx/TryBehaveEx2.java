package ExceptionEx;
public class TryBehaveEx2 
{
    public static void main(String[] args) {
        int i,x,con=4;
        for(i=1;i<8;i++)
            try
            {
            x=25/(con-i);
                System.out.println(" quot="+x);
            }
            catch(ArithmeticException e)
            {
                System.out.println(" divide by zero error for i = "+i);
            }
     //   catch(ArrayIndexOutOfBoundsException e)
        {}
        
    }
}
