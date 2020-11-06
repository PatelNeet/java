package neet;
public class pro8
{
    public static void main(String[] args)
    {
        int i,b=0,c,num=153,x;
        System.out.println("Sum of Armstrong number:");
  
        while(num!=0)
        {
            x=num%10;
            b=b+(x*x*x);
            num=num/10;
        }
        
        System.out.println(+b);
       
    }
    
}
