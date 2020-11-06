package ThreadEx;

class SumThread1 extends Thread
{
    int i,sum=0;
    public void run()
    {
        for(i=1;i<=5;i++)
        {
            sum=sum+i;
            System.out.println("Sum of 1 to "+i+" = "+sum);
        }
    }
}
public class Method2 {
    public static void main(String[] args) {
        SumThread1 st=new SumThread1();
        Thread th=new Thread(st,"My Thread2");
        System.out.println("Thrad Name:"+th.getName());
        System.out.println("Is Thread Started?? "+th.isAlive());
        th.start();
        System.out.println("Is Thread Started?? "+th.isAlive());
    }
}