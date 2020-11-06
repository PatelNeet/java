package neet;
public class arr11
{
    public static void main(String[] args) 
  {  
    int a[]= new int[10];
    int m=0;
    a[0]=14;
    a[1]=144;
    a[2]=12;
    a[3]=122;
    a[4]=133;
    a[5]=14;
    a[6]=144;
    a[7]=15;
    a[8]=166;
    a[9]=177;
    for(int i=0;i<10;i++)
    {
        if(a[i]>m)
        {
            m=a[i];
        }
        
    }
         System.out.println ("max"+m);
  }
}
