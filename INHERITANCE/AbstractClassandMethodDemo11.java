package INHERITANCE;
abstract class shape     //The class contains abstract method is called abstract class...
{
    double area;
    final double PHI=22.0/7.0;
    abstract double area();      //abstract method-a method without body is called as abstract method.
}
class rectangle extends shape
{
    double lenth,breadth;
    rectangle(double x,double y)
    {
        lenth=x;
        breadth=y;
    }
    double area()
    {
        area=lenth*breadth;
        return area;
    }
}
class circle extends shape
{
    double radius;
    circle(double r)
    {
        radius=r;
    }
    double area()
    {
        area=PHI*radius*radius;
        return area;
    }
}

public class AbstractClassandMethodDemo11 
{
    public static void main(String[] args)
    {
        rectangle rec = new rectangle (6.0,4.0);
        double ar;
        ar=rec.area();
        System.out.println("area of rectangle = "+ar);
        circle cr = new circle(5.25);
        ar=cr.area();
        System.out.println("area of the circle ="+ar);
    }
}
