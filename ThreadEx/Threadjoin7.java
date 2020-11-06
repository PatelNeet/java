package ThreadEx;
class Sumthread2 implements Runnable
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

class Factthread2 implements Runnable
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
public class Threadjoin7 {
    public static void main(String[] args) {
        Sumthread2 st=new Sumthread2();
        Factthread2 ft=new Factthread2();
        Thread sumt =new Thread(st, "sum thread");
        Thread factt =new Thread(ft, "factorial thread");
        sumt.setPriority(Thread.NORM_PRIORITY - 2);
        factt.setPriority(Thread.NORM_PRIORITY + 2);
        
        System.out.println("\nthe priority of" +sumt.getName()+"is ="+ sumt.getPriority());
        System.out.println("the priority of" +factt.getName()+"is ="+ factt.getPriority()+"\n");
        
        sumt.start();
        System.out.println("\nthe thread created is :"+sumt.getName());
        
        try
        {
            sumt.join();
        }
        catch (InterruptedException e)
        {
            factt.start();
            System.out.println("\n the thread created is :"+ factt.getName());
        }
        
    }
    
}
