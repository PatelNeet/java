package INHERITANCE;
class a0
{
    final void display()
    {
        System.out.println("display inside a0 class");
    }
}
class b0 extends a0
{
    // we can not override beacage final ketword used, so we can not write void display() in class b0..............
    void show()
    {
        System.out.println("display inside b0 class");
    }
}
public class FinalmethodOverloading9 
{
    public static void main(String[] args) 
    {
        b0 objname = new b0();
        objname.display();
        objname.show();
    }
    
}
