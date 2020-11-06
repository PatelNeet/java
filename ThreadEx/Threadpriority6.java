//Thread Priorities
package ThreadEx;
class Sumthread1 implements Runnable
{
    int i, sum=0;
    public void run()
    {
        for(i=1; i<=5; i++)
        {
            sum += i;
            System.out.println("sum of no from "+i+"="+sum);
            if(i==4)
                Thread.yield();
        }
    }
}
class Factthread1 implements Runnable
{
    int i, n, fact=1;
    public void run()
    {
        for(i=1; i<=5; i++)
        {
            fact *= i;
            System.out.println("fact from "+i+"="+fact);
        }
    }
}

public class Threadpriority6 {
    public static void main(String[] args) {
        Sumthread1 st = new Sumthread1();
        Factthread1 ft = new Factthread1();
        Thread sumt = new Thread(st, "sum thread");
        Thread factt = new Thread(ft, "factorial thread");
        sumt.setPriority(Thread.NORM_PRIORITY - 2);
        factt.setPriority(Thread.NORM_PRIORITY + 2);
        
        System.out.println("thread is:"+sumt.getName());
        System.out.println("thread is:"+factt.getName()+"\n");
        
        System.out.println("\nPriority value of " + sumt.getName() + " is = "+sumt.getPriority());
        System.out.println("Priority value of " + factt.getName() + " is = "+factt.getPriority()+"\n");
        sumt.start(); 
        factt.start();
        
    }
}
