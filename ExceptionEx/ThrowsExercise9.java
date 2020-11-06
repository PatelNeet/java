//Write a Program for Number Format & Null Pointer Exception.
package ExceptionEx;
class ThrowsExercise 
{
  public static void main(String args[]) 
{
    // Create an array of strings
    String strings[] = new String[6];
    strings[0] = "45";
    strings[1] = "-578";
    strings[2] = "22";
    strings[3] = "100";
    strings[4] = "-1";
    // Omit the following line to get a NullPointerException
    strings[5] = "3000";  // if we will make any null(comment strings[5] or any  ) value than NullPointerException occur
    // Include the following line to get a NumberFormatException
  //  strings[5] = "300..";   // numberformatexception will occur 
    // Compute average string length
    try {
      System.out.println(average(strings));
    }
    catch(NullPointerException e) {
      System.out.println("Null pointer exception");
    }
    catch(NumberFormatException e) {
      System.out.println("Number format exception");
    } 
  }
  static double average(String array[]) 
  throws NullPointerException, NumberFormatException {
    double sum = 0;
    for(int i = 0; i < array.length; i++) {
      double d = Double.valueOf(array[i]).doubleValue();
      sum += d;
    }
    return sum/array.length;	
  }	
}
