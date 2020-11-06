package InbuiltPackageEx;

import java.util.Scanner;

public class simpleInterest2 
{
    public static void main(String[] args) 
    {
     float p,r,t,si;
     Scanner in=new Scanner(System.in);
        System.out.println("enter the principle amount:");
        p=in.nextInt();
        System.out.println("enter the rate if interest:");
        r=in.nextInt();
        System.out.println("enter the time period:");
        t=in.nextInt();
        si=(p*r*t)/100;
        System.out.println("total interest of given amount is: "+si);
    }
    
}
