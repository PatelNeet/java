package INHERITANCE;
class a1
{
    int i,j;
    a1(int a,int b)
        {
        i=a;
        j=b;
        }
    void show()
        {
            System.out.println("i and j:"+i+" "+j);
        }
}
class b1 extends a1
{
    int k;
    b1(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    void show()
    {
        super.show();// if we can not write this than i and j not showing their value.........
        System.out.println("k:"+k);
    }
}

public class overriding8 
{

    public static void main(String[] args) 
    {

    b1 subob = new b1(1,2,3);
    subob.show();         //this calls show() in  b1 class
        
    }
}
