package InbuiltPackageEx;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarEx8 {
    public static void main(String[] args) {
        GregorianCalendar gc=new GregorianCalendar();
        GregorianCalendar gc2=new GregorianCalendar(2012,0,16,05,12,30);
        System.out.println(gc.get(Calendar.DATE));
        System.out.println("GC2="+gc2);
        System.out.println(gc2.get(Calendar.DATE)+"/"+gc.get(Calendar.MONTH));
        if(gc.isLeapYear(2012))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
    
}
