package INTERFACE;
abstract class shape2d1
{
    abstract double getarea();
}
interface shape3d1
{
    double getvolume();
}
class myshape1 extends shape2d1 implements shape3d1
{
    private int x,y,radius;
    public myshape1(int x,int y,int radius)
    {
    this.x=x;
    this.y=y;
    this.radius=radius;
    }
    @Override
    public double getarea()
    {
        return Math.PI *radius *radius;
    }
    public double getvolume()
    {
        return 2*Math.PI*radius;
    }
}
public class InterfaceWithInheritanceEx2 
{
    public static void main(String[] args) {
        myshape1 m=new myshape1(10,20,30);
        System.out.println("area="+m.getarea());
        System.out.println("volume="+m.getvolume());
   
    }
}
