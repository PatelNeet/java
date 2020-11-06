package INHERITANCE;
class a
{
    int i,j;
    void showij()
    {
        System.out.println("I and J:"+i+" "+j);
    }
}

class b extends a
{
    int k;
    void showk()
    {
        System.out.println("k:"+k);
    }
    void sum()
    {
        int s=i+j+k;
        System.out.println("sum of i+j+k = " +s);
    }
}
public class inheritanceSimple1
{
    public static void main(String[] args) {
        a sup = new a();
        b sub = new b();
        sup.i=10;
        sup.j=20;
        sup.showij();
        
        sub.i=7;
        sub.j=8;
        sub.k=9;
        sub.showij();
        sub.showk();
        sub.sum();
    }
}
