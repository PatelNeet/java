package INHERITANCE;
class box
{
    double width;
    double height;
    double depth;
    box(box ob)
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    box()
    {
        width=1;
        height=1;
        depth=1;
    }
    box(double len)
    {
        width=height=depth=len;
    }
    double volume()
    {
    return width*height*depth;
    }
}
class boxWeight extends box
{
    double weight;
    boxWeight(double w,double h,double d,double m)
    {
      /*  width=w;
        height=h;
        depth=d;*/
        super(w, h, d);
        weight=m;
    }
}
public class BoxWeightDemo2 
{
    public static void main(String[] args) 
    {
        boxWeight b1=new boxWeight(10,20,15,34.3);
        double vol;
        vol=b1.volume();
        System.out.println("volume of b1 is "+vol);
        System.out.println("weight of b1 is "+b1.weight);  
    }
}
