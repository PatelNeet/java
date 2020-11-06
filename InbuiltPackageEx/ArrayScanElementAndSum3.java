package InbuiltPackageEx;

import java.util.Scanner;

public class ArrayScanElementAndSum3 {
    private static Scanner Scanner;
    public static void main(String[] args) {
        int i,sum=0;
        Scanner sc =new Scanner(System.in);
        int a[]=new int[5];
        for(i=0;i<5;i++)
        {
            System.out.println("enter value:");
            a[i]=sc.nextInt();
            sum=sum+a[i];
        
        }
        System.out.println("sum of all elements: "+sum);
        
    }
    
}
