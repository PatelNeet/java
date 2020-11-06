//Program  to  create User-defined Exception for Checking validity of age.
package ExceptionEx;
class InvalidAgeException extends  Exception							
{														
    private int age;
    InvalidAgeException(int a)											
    {	
        age=a;              
    }							
    public String string()											
{	
    
    String s="Age:"+age+" is not Valid Age";
    return s;		} // copy meru sir , ok na bs sir thx

}		
public class InvalidAgeException14 // public hatu
{													
public static void checkAge(int age)throws InvalidAgeException						
{
	System.out.println("Checking Age Validity : ("+age+")");						
if(age<0 || age>100)											
throw new InvalidAgeException(age);									
System.out.println("Age:"+age+"is a valid age.");	
}
public static void main (String args[])									
{																try															{	checkAge(25);		 checkAge(-5);		}								catch (InvalidAgeException e)										
{	
System.out.println("caugh:"+e);		
}						
}	
} //ha
