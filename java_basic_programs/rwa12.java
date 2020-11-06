package neet;
public class rwa12
{
    public static void main(String[] args)
    {
        double fact;
        fact=factorial(5);
        System.out.println("fact="+fact);
        
        int p;
        p=power(2,3);
        System.out.println("power="+p);
        
        int si;
        si=si(30,4,5);
        System.out.println("si="+si);
    }
    static double factorial(int no)
    {
        double fact=1;
        int i;
        for(i=1;i<=no;i++)
        {
        fact=fact*i;
        }
        return fact;
    }
    static int power(int x,int y)
    {
    int i;
    int p=1;
        for (i=1;i<=y;i++)
        {
        p=p*x;    
        }
        return p;
    }
    static int si(int p,int r,int n)
    {
    int si;
    si=(p*r*n)/100;
    return si;
    }
    
}
