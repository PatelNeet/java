
package ThreadEx;
class Sumthread3 implements Runnable
{
    int i ,sum=0;
    public void run()
    {
    for(i=1;i<=5;i++)
        {
        sum += i;
        try
            {
            if(i % 2 == 0)
                Thread.sleep(25);
            }
        catch(InterruptedException e)
            {
             ;
            }
            System.out.println("Sum of numbers from 1 up to " +i+ " = "+sum) ;
            
        }
    }
}
class Factthread3 implements Runnable
{
    int i ,fact=1, n;
    public void run()
    {
    for(i=1;i<=5;i++)
        {
        fact *= i;
        try
            {
            if(i % 3 == 0)
                Thread.sleep(25);
            }
        catch(InterruptedException e)
            {
             ;
            }
            System.out.println("Factorial of " +i+ " = "+fact) ;
            
        }
    }
}

public class Threadsleep8 {
    public static void main(String[] args) {
        Thread ct = Thread.currentThread();
        System.out.println("The main Thread is:"+ct.getName());
        
        Sumthread3 st = new Sumthread3();
        Factthread3 ft = new Factthread3();
        Thread sumt = new Thread(st, "sum thread");
        Thread factt = new Thread(ft, "factorial thread");
        
        System.out.println("The main thread priority is :"+ct.getPriority());
        System.out.println("The sum thread priority is:"+sumt.getPriority());
        System.out.println("The factorial thread priority is:"+factt.getPriority());
        
        sumt.start();
        factt.start();   
    } 
}
