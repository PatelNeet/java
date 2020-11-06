package neet;
import java.util.Scanner;  
   
class LinearSearchExample   
{  
  public static void main(String args[])  
  {  
    int a, n, b, arr[];  
   
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = in.nextInt();   
    arr = new int[n];  
   
    System.out.println("Enter those " + n + " elements");  
   
    for (a = 0; a < n; a++)  
      arr[a] = in.nextInt();  
   
    System.out.println("Enter value to find");  
    b = in.nextInt();  
   
    for (a = 0; a < n; a++)  
    {  
      if (arr[a] == b)     /* Searching element is present */  
      {  
         System.out.println(b + " is present at location " + (a + 1) + ".");  
          break;  
      }  
   }  
   if (a == n)  /* Element to search isn't present */  
      System.out.println(b + " isn't present in array.");  
  }  
}



