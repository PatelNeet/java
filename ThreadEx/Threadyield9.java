
package ThreadEx;
class Sumthread4 implements Runnable
{
    int i, sum=0;
    public void run()
    {
        for(i=1; i<=5; i++)
        {
            sum += i;
            if(i%2 == 0)
                Thread.yield();
            System.out.println("sum of no from 1 upto " +i+"="+sum);
        }
    }
}
class Factthread4 implements Runnable
{
    int i, n, fact=1;
    public void run()
    {
        for(i=1; i<=5; i++)
        {
            fact *= i;
            if(i%3 == 0)
                Thread.yield();
            System.out.println("fact from "+i+"="+fact);
        }
    }
}
public class Threadyield9 {
    public static void main(String[] args) {
        Thread ct= Thread.currentThread();
        System.out.println("main thread is:"+ct.getName());
        Sumthread4 st=new Sumthread4();
        Factthread4 ft=new Factthread4();
        Thread sumt =new Thread(st, "sum thread");
        Thread factt =new Thread(ft, "factorial thread");
        System.out.println("main thread priority is:"+ct.getPriority());
        System.out.println("sum thread priority is:"+sumt.getPriority());
        System.out.println("factorial thread priority is:"+factt.getPriority()+"\n ");
        sumt.start();
        factt.start();
    }
    
}
