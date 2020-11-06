
package neet;

public class pro3
{
    public static void main(String[] args) 
    {
    int a=10,b=30;
    int x=4;
    float c;
    c=(float)a/b;
    switch(x)
    {
        case 1:
            System.out.println("sum:"+(a+b));
            break;
        case 2:
            System.out.println("sub"+(a-b));
            break;
        case 3:
            System.out.println("mul"+(a*b));
            break;
        case 4:
            System.out.println("div"+c);
            break;
        default:
            System.out.println("enter proper number");
    }
    
    }
}
