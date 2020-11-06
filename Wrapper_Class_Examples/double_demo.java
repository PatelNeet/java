//Program for Double Conversion.
package Wrapper_Class_Examples;
public class double_demo 
{
    public static void main(String[] args) 
    {
        Double d1=new Double(23434567.5621);
        Double d2=new Double(3.45e123);
        Double d3=new Double("5624567.64");
        System.out.println("d1:"+d1);
        System.out.println("d2:"+d2);
        System.out.println("d3:"+d3);
        System.out.println("byte value::"+d1.byteValue());
        System.out.println("int value:"+d1.intValue());
        System.out.println("float value:"+d1.floatValue());
        System.out.println("double value:"+d1.doubleValue());
        System.out.println("d1==d2"+d1.equals(d2));
        System.out.println("d1.compare(d2)"+d1.compareTo(d2));
       
        Double d4=Double.parseDouble("765.89");
        System.out.println("d4:"+d4);
        System.out.println("is infinite:?"+Double.isInfinite(2345.67843/1));
        System.out.println("is number?:"+d1.isNaN());
        System.out.println("positive indidnity:"+Double.POSITIVE_INFINITY);
        System.out.println("negative indidnity:"+Double.NEGATIVE_INFINITY);
        System.out.println("d1 min value:"+d1.MIN_VALUE);
        System.out.println("d1 max value:"+d1.MAX_VALUE);
        System.out.println("min_value:"+Double.MIN_VALUE);
        System.out.println("max_value:"+Double.MAX_VALUE);
        
    }
}
