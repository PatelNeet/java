//Program for Integer Conversion.
package Wrapper_Class_Examples;
public class integer_demo 
{
    public static void main(String[] args) 
    {
        Integer i1=new Integer(4567);
        Integer i2=new Integer("6523");
        System.out.println("i1:"+i1);
        System.out.println("i2:"+i2);
        System.out.println("2*i1:"+2*i1.intValue());
        System.out.println("2*i2:"+2*i2.intValue());
        System.out.println("i1==i2"+i1.equals(i2));
        System.out.println("i1.compare(i2)"+i1.compareTo(i2));
        
        Integer i3=Integer.valueOf("fa26", 16);
        System.out.println("i3:"+i3);
        System.out.println("byte value:"+i3.byteValue());
        System.out.println("int value:"+i3.intValue());
        System.out.println("double value:"+i3.doubleValue());
        Integer i4=Integer.parseInt("85671");
        System.out.println("i4:"+i4);
        
        int num=97234;
        System.out.println("binary value:"+Integer.toBinaryString(num));
        System.out.println("hexadecimal value:"+Integer.toHexString(num));
        
        System.out.println("min_value:"+Integer.MIN_VALUE);
        System.out.println("max_value:"+Integer.MAX_VALUE);
  }
}


