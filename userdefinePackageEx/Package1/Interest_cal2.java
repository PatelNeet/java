package Package1;

import java.util.Scanner;

public class Interest_cal2 
{
    public void calculation()
    { 
       
        int p,n;
        float r,interest;
        
        System.out.println("enter the value of period,rate and net amount....");
        
        Scanner sc=new Scanner(System.in);
        
        p=sc.nextInt();
        System.out.println("Period:"+p);
        
        n=sc.nextInt();
        System.out.println("net amount:"+n);
        
        r=sc.nextFloat();
        System.out.println("Interest rate:"+r);
      
        interest=(p*r*n)/100;
        System.out.println("Interest Amount="+interest);  
    }
}
