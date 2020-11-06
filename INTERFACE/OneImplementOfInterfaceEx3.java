package INTERFACE;
interface i1
{
    int i=63;
    void show();
    interface i2
    {
        void display();
    }
}

public class OneImplementOfInterfaceEx3 implements i1.i2,i1
{
    public void display()
    {
        System.out.println("value of i="+i);
    }
    public void show()
    {
        System.out.println("value of i="+i);
        System.out.println("show() is called");
    }
    public static void main(String[] args) {
        OneImplementOfInterfaceEx3 obj=new OneImplementOfInterfaceEx3();
        obj.show();
        obj.display();
    }
}
