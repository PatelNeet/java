package ThreadEx;
class SumThread2 implements Runnable // will same as method2
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
public class Method3 {
    public static void main(String[] args) {
        SumThread2 st=new SumThread2();
        Thread th=new Thread(st,"My Thread2");
        System.out.println("Thrad Name:"+th.getName());
        System.out.println("Is Thread Started?? "+th.isAlive());
        th.start();
        System.out.println("Is Thread Started?? "+th.isAlive());
    }
}