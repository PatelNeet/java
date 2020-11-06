//Program for Float Conversion.
package Wrapper_Class_Examples;
public class float_demo 
{
    public static void main(String[] args) 
    {
        Float f1=new Float(234.5621);
        Float f2=new Float(745.32f);
        
        System.out.println("f1:"+f1);
        System.out.println("f2:"+f2);
        System.out.println("f1 byte:"+f1.byteValue());
        System.out.println("f2 sort:"+f1.shortValue());
        System.out.println("f2 float:"+f1.floatValue());
        System.out.println("f1==f2"+f1.equals(f2));
        System.out.println("f1.compare(f2)"+f1.compareTo(f2));
        
        Float f3=new Float("562.64");
        
        System.out.println("f3:"+f3.floatValue());
        System.out.println("is infinite:?"+Float.isInfinite((float)4.5/0));
        System.out.println("is number?:"+f1.isNaN());
        System.out.println("byte value:"+f3.byteValue());
        System.out.println("int value:"+f3.intValue());
        System.out.println("double value:"+f3.doubleValue());
        
        float f4=Float.parseFloat("765.89");
   	System.out.println("f4:"+f4);
   
        System.out.println("min_value:"+Float.MIN_VALUE);
        System.out.println("max_value:"+Float.MAX_VALUE);
        System.out.println("positive infifnity:"+f1.POSITIVE_INFINITY);
    }
}
