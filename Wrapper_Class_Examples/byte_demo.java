//Program for byte Conversion
package Wrapper_Class_Examples;
class passbyref
{
void objectval(Byte ob)
{
byte val=ob.byteValue();
System.out.println("byte value:"+val);
}
}
public class byte_demo
{
public static void main(String[] args)
{ 
passbyref p=new passbyref();
Byte b1=new Byte((byte)123);
Byte b2=new Byte("75");
System.out.println("b1:"+b1);
System.out.println("b2:"+b2);
System.out.println("2*b1:"+2*b1.byteValue());
System.out.println("2*b2:"+2*b2.byteValue());
System.out.println("b1==b2"+b1.equals(b2));
System.out.println("b1.compare(b2)"+b1.compareTo(b2));
Byte b3=Byte.valueOf("110111", 2);
System.out.println("b3:"+b3);
Byte b4=Byte.parseByte("89");
System.out.println("b4:"+b4);
p.objectval(b3);
System.out.println("min_value:"+Byte.MIN_VALUE);
System.out.println("max_value:"+Byte.MAX_VALUE);
}
}

