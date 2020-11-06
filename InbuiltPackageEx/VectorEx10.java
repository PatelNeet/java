package InbuiltPackageEx;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx10 
{
    public static void main(String[] args) {
       Vector v=new Vector();
        System.out.println(v);
        System.out.println("Capicity="+v.capacity());
        v.addElement(10);
        v.addElement(20);
        v.addElement("Heyram");
        
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
        
        v.insertElementAt(1000,2);
        System.out.println(v);
        Enumeration e=v.elements();
        while(e.hasMoreElements());
        {
            Object obj=e.nextElement();
            System.out.println(obj);
        }
        if(v.contains("Heyram")==true)
        {
            System.out.println("yes there is");
        }
        else
        {
            System.out.println("no there isn't");
        }
        Object obj1=v.elementAt(2);
        System.out.println(obj1);
        int i=v.indexOf("Heyram");
        System.out.println(i);
        v.removeAllElements();
        System.out.println(v);
        
        if(v.isEmpty())
        {
            System.out.println("yes,empty");
        }
        else
        {
            System.out.println("no, not empty");
        }
    }
    
}
