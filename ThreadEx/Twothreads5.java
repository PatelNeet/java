//Multithreading programing 
package ThreadEx;
class Sumthread implements Runnable
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
class Factthread implements Runnable
{
    int i, n, fact=1;
    public void run()
    {
        for(i=1; i<=5; i++)
        {
            fact *= i;
            System.out.println("fact of no from "+i+"="+fact);
        }
    }
}
public class Twothreads5 {
    public static void main(String[] args) {
        Thread ct= Thread.currentThread();
        System.out.println("main thread is:"+ct.getName());
        Sumthread st=new Sumthread();
        Factthread ft=new Factthread();
        Thread sumt =new Thread(st, "sum thread");
        Thread factt =new Thread(ft, "factorial thread");
        sumt.start();
        System.out.println("thread is:"+sumt.getName());
        factt.start();
        System.out.println("thread is:"+factt.getName()+"\n");
    }   
}
