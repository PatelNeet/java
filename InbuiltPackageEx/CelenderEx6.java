package InbuiltPackageEx;

import java.util.Calendar;

public class CelenderEx6 
{
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE)+":"+c.get(Calendar.MONTH)+":"+c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.ZONE_OFFSET));
    }
}
