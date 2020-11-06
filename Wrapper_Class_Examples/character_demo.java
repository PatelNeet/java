//Program for Character Conversion.
package Wrapper_Class_Examples;
public class character_demo 
{
    public static void main(String[] args) 
    {
        Character c1=new Character('d');
    	char c2='G';
        char c3='7';
        System.out.println ("c1:"+c1);
        System.out.println("c1 value:"+c1.charValue());
        System.out.println("c2 is defined in character set?:"+Character.isDefined(c2));
        System.out.println("c2 is digit?:"+Character.isDigit(c2));
        System.out.println("c3 is digit?:"+Character.isDigit(c3));
        System.out.println("c2 is in lowercase?:"+Character.isLowerCase(c2));
        System.out.println("c2 is in uppercase?:"+Character.isUpperCase(c2));
        
        System.out.println("maximum rediex:"+Character.MAX_RADIX);
        System.out.println("minimum rediex:"+Character.MIN_RADIX);
    }
}

