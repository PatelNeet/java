//this is  the program of hierarchy
// this program will give complie error
package ExceptionEx;

public class MulticatchEx4 
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
          sum +=vec[i];
              System.out.println("Quotient="+quot);
          }
         // that code have to write here not down side other wise generato error
          catch(Exception e)
          {
              System.out.println("array index out of bound at index="+i);
          }
         /* catch(ArithmeticException e)
          {
              System.out.println("divde by zero error at i="+i);
          }*/
         }
        System.out.println("sum of no.="+sum);
    }
    
}
