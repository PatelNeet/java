//Write a Program for Short Coversion.
package Wrapper_Class_Examples;
public class short_demo 
{
    public static void main(String[] args) 
    {
        Short s1=new Short((short)4567);
        Short s2=new Short("6523");
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("2*s1:"+2*s1.shortValue());
        System.out.println("2*s2:"+2*s2.shortValue());
        System.out.println("s1==s2"+s1.equals(s2));
        System.out.println("s1.compare(s2)"+s1.compareTo(s2));
        
        Short s3=Short.valueOf("2df", 16);
        System.out.println("s3:"+s3);
        System.out.println("syte value:"+s3.byteValue());
        System.out.println("int value:"+s3.intValue());
        System.out.println("double value:"+s3.doubleValue());
        Short s4=Short.parseShort("4789");
        System.out.println("s4:"+s4);
        
        System.out.println("min_value:"+Short.MIN_VALUE);
        System.out.println("max_value:"+Short.MAX_VALUE);
    }    
}
