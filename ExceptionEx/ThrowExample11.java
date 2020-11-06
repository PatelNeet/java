package ExceptionEx;
/* In this program we are checking the Student age
 * if the student age<12 and weight <40 then our program 
 * should return that the student is not eligible for registration.
 */

// throw is unchecked and user-defined exception as well.

public class ThrowExample11 {
   static void checkEligibilty(int stuage, int stuweight){ 
      if(stuage<12 && stuweight<40) {
         throw new ArithmeticException("Student is not eligible for registration"); 
      }
      else {
         System.out.println("Student Entry is Valid!!"); 
      }
   } 

   public static void main(String args[]){ 
     System.out.println("Welcome to the Registration process!!");
     checkEligibilty(10, 39); 
  // checkEligibilty(14, 49); 
     System.out.println("Have a nice day.."); 
 } 
}
