package INTERFACE;
interface shape2d
{
    double getarea();
}
interface shape3d
{
    double getvolume();
}
class myshape implements shape2d,shape3d
{
    private int x,y,radius;
    public myshape(int x,int y,int radius)
    {
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    @Override  //no needed
    public double getarea()
    {
        return Math.PI*radius*radius;
    }
    @Override  // no needed //automatic will add by just click
    public double getvolume()
    {
        return 2 * Math.PI * radius;
    }
}
public class InterfaceEx1 
{
    public static void main(String[] args) {
        myshape m=new myshape(10,20,30);
        System.out.println("area="+m.getarea());
        System.out.println("volume="+m.getvolume());
    }
}
