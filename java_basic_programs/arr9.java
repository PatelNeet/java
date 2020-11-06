package neet;
public class arr9 {

        public static void main(String[] args) {
            int sum = 0;
            int a[]=new int[10];
            int b[][]={{12,21},{11,33}};
            a[0]=12;
            a[1]=12;
            a[2]=12;
            a[3]=12;
            a[4]=12;
            a[5]=12;
            a[6]=12;
            a[7]=12;
            a[8]=12;
            a[9]=12;
    for(int i=0;i<10;i++){
    sum+=a[i];
    System.out.println("a["+i+"]"+a[i]);
}   
    System.out.println("ans is:- "+sum);
}
}