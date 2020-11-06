package neet;
import java.util.Scanner;
class Recursive_factorial{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number:");
      int num = scanner.nextInt();
      int factorial = fact(num);
      System.out.println("Factorial of entered number is: "+factorial);
   }
   static int fact(int n)
   {
       int output;
       if(n==1){
         return 1;
       }
       output = fact(n-1)* n;
       return output;
   }
}