package InbuiltPackageEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ISRex4 
{
    public static void main(String[] args) {
        int n;
        String s;
        
        try
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br= new BufferedReader(isr);
            System.out.println("enter the value os n: ");
            s=br.readLine();
            n=Integer.parseInt(s);
            System.out.println("n: "+n);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
