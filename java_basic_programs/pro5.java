package neet;
public class pro5
{
    public static void main(String[] args)
    {
    int i,j,k;
    for(i=0;i<5;i++)
        {  
           for(j=5-i;j>1;j--)
           {
                System.out.print(" ");
           }
           for(j=0;j<=i;j++)
           {
                System.out.print("* ");
           }
                System.out.println("");
        }
    }
}
