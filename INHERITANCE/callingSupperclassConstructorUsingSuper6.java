package INHERITANCE; // property of superclass extends by super() in derive class
class A                    
{
    A()
    {
        System.out.println("A constructor");
    }
}
class B extends A
{
    B()
    {
        super();  //with super also extends
        System.out.println("B constructor");
    }
}
class C extends B
{
    C()
    {
        super();  //with super also extends
        System.out.println("C constructor");
    }
}
public class callingSupperclassConstructorUsingSuper6
{
    public static void main(String[] args) {
        C obj = new C();
    }
}
