package INHERITANCE; 
class A1                    
{
    int x;
    A1(int a)
    {
        x=a;
        System.out.println("A constructor,x:"+x);
    }
}
class B1 extends A1
{
    int y;
    B1(int a,int b)
    {
        super(a);
        y=b;
        System.out.println("B constructor,y:"+y);
    }
}
class C1 extends B1
{
    int z;
    C1(int a,int b,int c)
    {
        super(a,b);
        z=c;
        System.out.println("C constructor,z:"+z);
    }
}
public class callSuperclassArgumentConsUsingSuper7
{
    public static void main(String[] args) {
        C1 obj = new C1(10,20,30);
    }
}
