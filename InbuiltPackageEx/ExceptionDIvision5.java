package InbuiltPackageEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionDIvision5 
{
    public static void main(String[] args)
    {
        try
        {
            int a,b;
            float div;
            String s;
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br= new BufferedReader(isr);
            System.out.println("enter the value of a: ");
            s=br.readLine();//"1234"
            a=Integer.parseInt(s);
            System.out.println("enter value of b:");
            s=br.readLine();
        //    System.out.println("s  :-- "+s);
            b=Integer.parseInt(s);
            div=(float)a/b;
            System.out.println("Div:"+div);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
