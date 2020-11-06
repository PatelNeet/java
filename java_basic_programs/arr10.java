package neet;
public class arr10
{
 public static void main(String[] args)
 {
            int sum = 0;
            int a[][]={{10,20},{30,40},{50,60},{22,44}};
         
    for(int i=0;i<2;i++)
    {
        for (int j = 0; j <2; j++)
        {
            sum+=a[i][j];
            //System.out.println("a["+i+"]"+"["+j+"]"+a[i][j]);  
            System.out.print(" "+a[i][j] );
        }System.out.println("");
    }
        System.out.println("ans is:"+sum);
    }
     
}