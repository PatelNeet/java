//there is 5 program!

package neet;
import java.util.*;
class MultipleSelection {
    public static void main(String[] args) {   
        
        Scanner in=new Scanner(System.in);
        System.out.println("enter your marks:");
        int marks=in.nextInt();
	 
        if (marks >= 90) {
            System.out.println("Grade A");
        }

        else if (marks >= 80) {
            System.out.println("Grade B");
        }
        else if (marks >= 70) {
            System.out.println("Grade C");
        }
        else if (marks >= 60) {
            System.out.println("Grade D");
        }
                
        else {
            System.out.println("Grade F");
        } 
    }
}
/*
class Ladder {
    public static void main(String[] args) {   
        
        Scanner in=new Scanner(System.in);
        System.out.println("enter value of a:");
        int num=in.nextInt();
	 
        if (num > 0) {
            System.out.println("The number is positive.");
        }

        else if (num < 0) {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is 0.");
        } 
    }
} */
/*
public class pro2
{
    public static void main(String[] args)
    {
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("enter value of a:");
        int a=in.nextInt();
        
        System.out.println("enter value of b:");
        int b=in.nextInt();
        
        System.out.println("enter value of c:");
        int c=in.nextInt();
        
         System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        
        System.out.println("check greatest number from three");
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is greatest");
            }
            else
            {
                System.out.println("c is greateat");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b is greatest");
            }
            else
            {
                System.out.println("c is greatest");
            }
        }
    }   
} */ 

/*
import java.util.*;
class NegativeNumCheck
{
    public static void main(String args[])
    {
        System.out.println("enter some number:");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(num<0)
            System.out.println("you have enter negative number.");
        if(num>0)
            System.out.println("you have enter positive number.");
    }
} */
/*
import java.util.*;
class EvenOddNumCheck
{
    public static void main(String[] args) {
        {
            System.out.println("enter some number:");
            Scanner in=new Scanner(System.in);
            int num=in.nextInt();
            if(num % 2 == 0)
                System.out.println("you have enter even number.");
            if(num % 2 != 0)
                System.out.println("you have enter odd number.");
        }
    }
}
*/
