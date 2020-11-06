//Write a Program for Class Cast Exception.   ( Datatype Convert karta nathi teni Exception)
package ExceptionEx;
class ClassCast10
{	  
    public static void main(String args[])
 {
    try 
    {
      Object obj = new Integer("85");
      System.out.println("Before cast");
      Double dobj = (Double)obj;
      System.out.println("After cast");
    }
    catch(Exception e) {
      System.out.println(e);	
    }	
 }
}
// not so understandable for use .....