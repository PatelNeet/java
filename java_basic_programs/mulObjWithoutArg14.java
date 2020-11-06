package neet;
class person
{
    private int age;
    private double salary;
    private String name;
    public void setdata()
    {
        name="neet";
        age=20;
        salary=80000;
    }
    public void display()
    {
        System.out.println("ns=ame:"+name);
        System.out.println("Age:"+age);
        System.out.println("salary:"+salary);
    }
}
public class mulObjWithoutArg14 
{

    
    public static void main(String[] args)
    {
        person p1=new person();
        p1.setdata();
        p1.display();
    }
}

