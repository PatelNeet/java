package INHERITANCE; //super keyworf to call super class constructor to initialize super class instance variables
class box3
{
   private double width;
   private double height;
   private double depth;
    box3(box3 ob)
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    box3(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    box3()
    {
        width=1;
        height=1;
        depth=1;
    }
    box3(double len)
    {
        width=height=depth=len;
    }
    double volume()
    {
    return width*height*depth;
    }
}
class box3Weight extends box3
{
    double weight;
    box3Weight(box3Weight ob)
    {
        super(ob);
        weight=ob.weight;
    }
    box3Weight(double w,double h,double d,double m)
    {
        super(w,h,d);
        weight=m;
    }
    box3Weight()
    {
        super();
        weight=1;
    }
    box3Weight(double len,double m)
    {
        super(len);
        weight=m;
    }
}
public class boxWeightSuperInstanceVariable4 
{
    public static void main(String[] args) 
    {
        box3Weight b1=new box3Weight(10,20,15,34.3);
         box3Weight b2=new box3Weight(1,2,5,4.03);
         box3Weight b3=new box3Weight();
         box3Weight b4=new box3Weight(5,6);
         box3Weight b5=new box3Weight(b1);
      
        double vol;
        vol=b1.volume();
        System.out.println("volume of b1 is "+vol);
        System.out.println("weight of b1 is "+b1.weight);  
        
        vol=b2.volume();
        System.out.println("volume of b2 is "+vol);
        System.out.println("weight of b2 is "+b2.weight);
        
        vol=b3.volume();
        System.out.println("volume of b3 is "+vol);
        System.out.println("weight of b3 is "+b3.weight);
        
        vol=b4.volume();
        System.out.println("volume of b4 is "+vol);
        System.out.println("weight of b4 is "+b4.weight);
        
        vol=b5.volume();
        System.out.println("volume of b5 is "+vol);
        System.out.println("weight of b5 is "+b5.weight);
    }
}
