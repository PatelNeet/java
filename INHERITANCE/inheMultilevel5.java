package INHERITANCE;
class bos
{
    private double width;
    private double height;
    private double depth;
    bos(bos ob)
            {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    bos(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    bos()
    {
        width=1;
        height=1;
        depth=1;
    }
    bos(double len)
    {
        width=height=depth=len;
    }
    double volume()
    {
    return width*height*depth;
    }
}
class bosWeight extends bos
{
    double weight;
    bosWeight(bosWeight ob)
    {
        super(ob);
        weight=ob.weight;
    }
    bosWeight(double w,double h,double d,double m)
    {
        super(w,h,d);
        weight=m;
    }
    bosWeight()
    {
        super();
        weight=-1;
    }
    bosWeight(double len,double m)
    {
        super(len);
        weight=-m;
    }
}
class boscost extends bosWeight
{
    double cost;
    boscost(boscost ob)
    {
        super(ob);
        cost=ob.cost;
    }
    boscost(double w,double h,double d,double m,double c)
    {
        super(w,h,d,m);
        cost=c;
    }
    boscost()
    {
        super();
        cost=-1;
    }
    boscost(double len,double m,double c)
    {
        super(len,m);
        cost=-c;
    }
}
public class inheMultilevel5
{
    public static void main(String[] args)
    {
        boscost b1= new boscost(10,15,20,25.75,50.5);
        double vol;
        vol=b1.volume();
        System.out.println("volume of b1 is "+vol);
        System.out.println("weight of b1 is "+b1.weight);
        System.out.println("cost:Rs."+b1.cost);
    }
}
