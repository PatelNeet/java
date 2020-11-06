package ExceptionEx;

public class ThrowsExceptionEx5 {
    public static void main(String[] args) throws Exception
                {
                int nmr=24,i,quot;
                for(i=0;i<=5;i++)
                    try
                    {
                      quot=nmr/(2-i);
                      System.out.println("Quotient="+quot);
                    }
                    catch(ArithmeticException e)
                    {
                    System.out.println("Rethrowing the Exception at i="+i);
                    throw e;
                    }
                }
    }
    


      