package InbuiltPackageEx;

import java.util.Calendar;

public class AddTwoTimeEx14 
{
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
     
        System.out.println("Original="+c.getTime());
        
        c.add(Calendar.HOUR,2);
        c.add(Calendar.MINUTE,20);
        c.add(Calendar.SECOND,200);
        System.out.println("Upadate="+c.getTime());
    }
}
