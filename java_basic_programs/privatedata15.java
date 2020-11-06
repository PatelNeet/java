package neet;
class kmp
{
    public int b;
    public void indata(int i)
    {
    b=i;
    }
    public void dispaly()
    {
        System.out.println("b:"+b);
    }
    public void swp(dmp x,kmp y)
    {
        int temp;
        temp=x.a;
        x.a=y.b;
        y.b=temp;
    }
}
class dmp
{
    public int a;
    public void indata(int i)
    {
    a=i;
    }
    public void display()
    {
        System.out.println("a:"+a);
    }
    public void swp(dmp x,kmp y)
    {
    int temp;
    temp=x.a;
    x.a=y.b;
    y.b=temp;
    }
}
public class privatedata15 
{
    public static void main(String[] args) 
    {
        dmp c1=new dmp();
        kmp c2=new kmp();
        c1.indata(131);
        c2.indata(140);
        System.out.println("Value befor swapping");
        c1.display();
        c2.dispaly();
        c2.swp(c1,c2);
      //  OR 
        //c1.swp(c1, c2);
        System.out.println("Value after swapping");
        c1.display();
        c2.dispaly();
    }
}
