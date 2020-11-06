package ThreadEx;
class SumThread3 implements Runnable 
{
    Thread th;
    int i,sum=0;
    SumThread3()
    {
        th=new Thread(this,"My Thread1");
        th.start();
        
        System.out.println("Thrad Name:"+th.getName());
        System.out.println("Is Thread Started?? "+th.isAlive());
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
public class Method4 {
    public static void main(String[] args) {
        new SumThread3();
    }
}