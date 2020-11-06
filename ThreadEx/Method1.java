package ThreadEx;

class SumThread extends Thread
{
    Thread th;
    int i,sum=0;
    SumThread()
    {
        th=new Thread(this,"My Thread1");
        th.start();
    }
    public void run()
    {
        for(i=1;i<=5;i++)
        {
            sum=sum+i;
            System.out.println("Sum of 1 to "+i+" = "+sum);
        }
    }
}
public class Method1 {
    public static void main(String[] args) {
        new SumThread();
    }
}

