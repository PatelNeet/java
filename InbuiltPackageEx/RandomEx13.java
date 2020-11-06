package InbuiltPackageEx;

import java.util.Random;

public class RandomEx13 
{
    public static void main(String[] args) {
        int i;
        float f;
        boolean b;
        Random r=new Random();
        double d;
  //      byte y[]=new byte[5];
        i=r.nextInt();
        f=r.nextFloat();
        b=r.nextBoolean();
        d=r.nextDouble();
    //    r.nextBytes(y);
     //   for(i=0;i<4;i++)
      //  {
        //    System.out.println(y[i]);
       // }
        System.out.println(i);
        System.out.println(f);
        System.out.println(b);
        System.out.println(d);
        
    }
}
