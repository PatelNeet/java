//Program for Long Conversion.
package Wrapper_Class_Examples;
public class long_demo 
{
    public static void main(String[] args) 
    {
        Long l1=new Long(87456);
        Long l2=new Long("681523");
        System.out.println("l1:"+l1);	 
        System.out.println("l2:"+l2);
        
        System.out.println("2*l1:"+2*l1.longValue());
        System.out.println("2*l2:"+2*l2.longValue());
        
        
       // System.out.println("2*l1:"+2*l1);
       // System.out.println("2*l2:"+2*l2);
        
        System.out.println("l1==l2"+l1.equals(l2));
        System.out.println("l1.compare(l2)"+l1.compareTo(l2));
        
        Long l3=Long.valueOf("234ab34df", 16);
        System.out.println("l3:"+l3);
        System.out.println("byte value:"+l3.byteValue());
        System.out.println("int value:"+l3.intValue());
        System.out.println("double value:"+l3.doubleValue());
        Long l4=Long.parseLong("3bcdef29",16);
        System.out.println("l4:"+l4);
        int num=97234;
        System.out.println("binary value:"+Long.toBinaryString(num));
        System.out.println("hexadecimal value:"+Long.toHexString(num));
        
        System.out.println("min_value:"+Long.MIN_VALUE);
        System.out.println("max_value:"+Long.MAX_VALUE);
    }			
}


