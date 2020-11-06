package INHERITANCE;
class box1
{
    double width;
    double height;
    double depth;
    box1(box1 ob)
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    box1(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    box1()
    {
        width=1;
        height=1;
        depth=1;
    }
    box1(double len)
    {
        width=height=depth=len;
    }
    double volume()
    {
    return width*height*depth;
    }
}
class box1Weight extends box1
{
    double weight;
    box1Weight(double w,double h,double d,double m)
    {
        width=w;
        height=h;
        depth=d;
        weight=m;
    }
}
public class boxWeightSubReference3
{
    public static void main(String[] args) 
    {
        box1Weight wb =new box1Weight(10,15,20,25.75);
        box1 b=new box1();
        double vol;
        vol= wb.volume();
        System.out.println("volume of b1 is "+vol);
        System.out.println("weight of b1 is "+wb.weight);
        System.out.println();
        
        //assign boxWeight reference to box reference
        b=wb;
      //  box1Weight x = new box1();
        vol=b.volume();
        System.out.println("volume of b is "+vol);
  //        System.out.println("weight of b is "+b.weight);
    }
}
