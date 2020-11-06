package ExceptionEx;
public class NestedTryEx3 
{
    public static void main(String[] args) {
        int vec[]={3,5,4,10,2};
        int nmr=24;
        int quot,sum=0;
        for(int i=0;i<=5;i++)
        {
            try
            {
                quot=nmr/(2-i);
                
                try
                {
                    sum +=vec[i];
                }
                catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Array Index Out Of Bounds at index(inner try)="+i);
                }
                catch(ArithmeticException e)
                {
                    System.out.println("divide by zero error at i(inner try)="+i);
                }
                System.out.println("Quotient="+quot);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array Index Out Of Bounds at index(outer try)="+i);
            }
            
                catch(ArithmeticException e)
                {
                    System.out.println("divide by zero error at i(outer try)="+i);
                }
        }
        System.out.println("sum of number="+sum);
    }
}
