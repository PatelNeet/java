package neet;
public class AndLogicalShortCircuitOperator17
{
    public static void main(String[] args) {
        int a=10,b=20;
        if((a<5) && (++b <10))
        {
            System.out.println("true");
        }
        
            System.out.println("b="+b);
        if((a<5)&(++b<10))
        {
            System.out.println("true");               
        }  
        System.out.println("b="+b);
}
}