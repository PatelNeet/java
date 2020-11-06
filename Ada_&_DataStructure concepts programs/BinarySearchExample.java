package neet;
 
import java.util.Scanner;

public class BinarySearchExample
{
   public static void main(String args[])
   {
       int n, i, s, f, l, m;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
	   
       System.out.println("Enter Total Number of Elements : ");
       n = scan.nextInt();
	   
       System.out.println("Enter " +n+ " Elements : ");
       for(i=0; i<n; i++)
       {
           arr[i] = scan.nextInt();
       }
	   
       System.out.println("Enter a Number to Search..");
       s = scan.nextInt();
	   
       f = 0;
       l = n-1;
       m = (f+l)/2;
	   
       while(f <= l)
       {
           if(arr[m] < s)
           {
               f = m+1;
           }
           else if(arr[m] == s)
           {
               System.out.print(s+ " Found at Location " +(m + 1));
               break;
           }
           else
           {
               l = m - 1;
           }
           m = (f+l)/2;
       }
       if(f > l)
       {
           System.out.println("Not Found..!! " +s+ " is not Present in the List.");
       }
   }
}