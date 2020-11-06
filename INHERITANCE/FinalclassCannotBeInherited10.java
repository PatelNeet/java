package INHERITANCE;
final class a00
{
    void display()
    {
        System.out.println("display inside a00 class");
    }
}
// class b00 extends a00   // ERROR
// final calss can't be inherited......
class b00
{
    void display()
    {
        System.out.println("display inside b00 class");
    }
}
public class FinalclassCannotBeInherited10 
{

    public static void main(String[] args) 
    {
        a00 objnm = new a00();
        objnm.display();
       
        b00 objname = new b00();
        objname.display();
       
    }
    
}

    

