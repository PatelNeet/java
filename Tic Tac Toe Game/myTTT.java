//plz do not try to copy or send it to other......PLZ
import java.util.Scanner;
public class myTTT 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x=0,count,c=0,m,n;
        int mycomp; 
        int choice,ch;
        int flg,flag;
        int choose;
        int a[] = {48,49,50,51,52,53,54,55,56,57};
        int b[] = {0,0,0,0,0,0,0,0,0,0,0};
        System.out.print(" Select Difficulty - \n[1 for kid] [2 for Expert] \n ->   ");
        choose = sc.nextInt();
        System.out.print(" Choose your Character -> [1 for X] [2 for O] \n ->   ");
        ch = sc.nextInt();
        if(ch==1){m=88;n=79;}
        else{m=79;n=88;}
        System.out.println("Enter your choice position as per below numbers...");
        System.out.print("\t\t"+(char)a[1]+" | "+(char)a[2]+" | "+(char)a[3]+"\n\t       -----------\n\t\t"+(char)a[4]+" | "+(char)a[5]+" | "+(char)a[6]+"\n\t       -----------\n\t\t" +(char)a[7]+" | " +(char)a[8]+" | " +(char)a[9]+" \n");
        for(count=1;count<5;count++)
        {mycomp=(int)(Math.random()*(choose)+1);
            flag=0;
            while(flag!=1)
            {flg=0;System.out.print("Enter your choice -> ");choice = sc.nextInt();
                for(int j=0;j<9;j++){if(choice==b[j]){flg=1;}}
                if(flg==0){a[choice]=m;b[x]=choice;x++;flag=1;if(check(a,m)==1){return;}}
                else{System.out.println("plz select new choice....");}System.out.print("\n");}
            if(mycomp==1)
            {flag=0;while(flag!=1)
                {flg=0;choice = (int) (Math.random()*8+1);for(int j=0;j<9;j++){if(choice==b[j]){flg=1;}}
                    if(flg==0){a[choice]=n;b[x]=choice;x++;if(check(a, m)==1){return;}flag=1;}}}
            else if(mycomp==2)
            {
                if(a[1]==a[2])
                {if(check1(b,3)==1){set(a,3,n);setb(b,x,3);x++;}else{c=1;}}
                else if(a[2]==a[3])
                {if(check1(b,1)==1){set(a,1,n);setb(b,x,1);x++;}else{c=1;}}
                else if(a[4]==a[5])
                {if(check1(b,6)==1){set(a,6,n);setb(b,x,6);x++;}else{c=1;}}
                else if(a[5]==a[6])
                {if(check1(b,4)==1){set(a,4,n);setb(b,x,4);x++;}else{c=1;}}
                else if(a[7]==a[8])
                {if(check1(b,9)==1){set(a,9,n);setb(b,x,9);x++;}else{c=1;}}
                else if(a[8]==a[9])
                {if(check1(b,7)==1){set(a,7,n);setb(b,x,7);x++;}else{c=1;}}
                else if(a[1]==a[4])
                {if(check1(b,7)==1){set(a,7,n);setb(b,x,7);x++;}else{c=1;}}
                else if(a[4]==a[7])
                {if(check1(b,1)==1){set(a,1,n);setb(b,x,1);x++;}else{c=1;}}
                else if(a[2]==a[5])
                {if(check1(b,8)==1){set(a,8,n);setb(b,x,8);x++;}else{c=1;}}
                else if(a[5]==a[8])
                {if(check1(b,2)==1){set(a,2,n);setb(b,x,2);x++;}else{c=1;}}
                else if(a[3]==a[6])
                {if(check1(b,9)==1){set(a,9,n);setb(b,x,9);x++;}else{c=1;}}
                else if(a[6]==a[9])
                {if(check1(b,3)==1){set(a,3,n);setb(b,x,3);x++;}else{c=1;}}
                else if(a[1]==a[5])
                {if(check1(b,9)==1){set(a,9,n);setb(b,x,9);x++;}else{c=1;}}
                else if(a[5]==a[9])
                {if(check1(b,1)==1){set(a,1,n);setb(b,x,1); x++;}else{c=1;}}
                else if(a[3]==a[5])
                {if(check1(b,7)==1){set(a,7,n);setb(b,x,7);x++;}else {c=1;}}
                else if(a[5]==a[7])
                {if(check1(b,3)==1){set(a,3,n);setb(b,x,3); x++;}else{c=1;}}
                else if(a[1]==a[3])
                {if(check1(b,2)==1){set(a,2,n);setb(b,x,2);x++;}else{c=1;}}
                else if(a[4]==a[6])
                {if(check1(b,5)==1){set(a,5,n);setb(b,x,5);x++;}else{c=1;}}
                else if(a[7]==a[9])
                {if(check1(b,8)==1){set(a,8,n);setb(b,x,8);x++;}else{c=1;}}
                else if(a[1]==a[7])
                {if(check1(b,4)==1){set(a,4,n);setb(b,x,4);x++;}else{c=1;}}
                else if(a[2]==a[8])
                {if(check1(b,5)==1){set(a,5,n);setb(b,x,5);x++;}else{c=1;}}
                else if(a[3]==a[9])
                {if(check1(b,6)==1){set(a,6,n);setb(b,x,6);x++;}else{c=1;}}
                else if(a[1]==a[9])
                {if(check1(b,5)==1){set(a,5,n);setb(b,x,5);x++;}else{c=1;}}
                else if(a[3]==a[7])
                {if(check1(b,5)==1){set(a,5,n);setb(b,x,5);x++;}else {c=1;}}
                else {c=1;}
                if(c==1)
                {c=0;flag=0;while(flag!=1)
                {flg=0;choice = (int) (Math.random()*8+1);for(int j=0;j<9;j++){if(choice==b[j]){flg=1;}}
                    if(flg==0){a[choice]=n;b[x]=choice;x++;if(check(a, m)==1){return;}flag=1;}}}}
            if(count==4)
            {flag=0;while(flag!=1)
                {flg=0;choice = (int) (Math.random()*8+1);for(int j=0;j<9;j++){if(choice==b[j]){flg=1;}}
                    if(flg==0){a[choice]=m;b[x]=choice;x++;if(check(a, m)==1){return;}flag=1;}}}
            System.out.print("\t\t"+(char)a[1]+" | "+(char)a[2]+" | "+(char)a[3]+"\n\t       -----------\n\t\t"+(char)a[4]+" | "+(char)a[5]+" | "+(char)a[6]+"\n\t       -----------\n\t\t" +(char)a[7]+" | " +(char)a[8]+" | " +(char)a[9]+" \n");
            System.out.println("\n");}}
    private static int check(int[] a, int m) 
    {int chk;
    if(a[1]==a[2] && a[3]==a[1])
    {chk=1;System.out.print("\t\t"+(char)a[1]+" | "+(char)a[2]+" | "+(char)a[3]+" \n\t      -----------\n\t\t"+(char)a[4]+" | "+(char)a[5]+" | "+(char)a[6]+"\n\t       -----------\n\t\t" +(char)a[7]+" | " +(char)a[8]+" | " +(char)a[9]+" \n");winner(a,1,m);return chk;}
    else if(a[4]==a[5] && a[4]==a[6])
    {chk=1;System.out.print("\t\t"+(char)a[1]+" | "+(char)a[2]+" | "+(char)a[3]+"\n\t       -----------\n\t\t"+(char)a[4]+" | "+(char)a[5]+" | "+(char)a[6]+"\n\t       -----------\n\t\t" +(char)a[7]+" | " +(char)a[8]+" | " +(char)a[9]+" \n");winner(a,4,m);return chk;}
    else if(a[7]==a[8] && a[9]==a[7])
    {chk=1;System.out.print("\t\t"+(char)a[1]+" | "+(char)a[2]+" | "+(char)a[3]+"\n\t       -----------\n\t\t"+(char)a[4]+" | "+(char)a[5]+" | "+(char)a[6]+"\n\t       -----------\n\t\t" +(char)a[7]+" | " +(char)a[8]+" | " +(char)a[9]+" \n");winner(a,7,m);return chk;}
    else if(a[1]==a[4] && a[7]==a[1])
    {chk=1;System.out.print("\t\t"+(char)a[1]+" | "+(char)a[2]+" | "+(char)a[3]+"\n\t       -----------\n\t\t"+(char)a[4]+" | "+(char)a[5]+" | "+(char)a[6]+"\n\t       -----------\n\t\t" +(char)a[7]+" | " +(char)a[8]+" | " +(char)a[9]+" \n");winner(a,1,m);return chk;}
    else if(a[2]==a[5] && a[8]==a[2])
    {chk=1;System.out.print("\t\t"+(char)a[1]+" | "+(char)a[2]+" | "+(char)a[3]+"\n\t       -----------\n\t\t"+(char)a[4]+" | "+(char)a[5]+" | "+(char)a[6]+"\n\t       -----------\n\t\t" +(char)a[7]+" | " +(char)a[8]+" | " +(char)a[9]+" \n");winner(a,2,m);return chk;}
    else if(a[3]==a[6] && a[9]==a[3])
    {chk=1;System.out.print("\t\t"+(char)a[1]+" | "+(char)a[2]+" | "+(char)a[3]+"\n\t       -----------\n\t\t"+(char)a[4]+" | "+(char)a[5]+" | "+(char)a[6]+"\n\t       -----------\n\t\t" +(char)a[7]+" | " +(char)a[8]+" | " +(char)a[9]+" \n");winner(a,3,m);return chk;}
    else if(a[1]==a[5] && a[9]==a[1])
    {chk=1;System.out.print("\t\t"+(char)a[1]+" | "+(char)a[2]+" | "+(char)a[3]+"\n\t       -----------\n\t\t"+(char)a[4]+" | "+(char)a[5]+" | "+(char)a[6]+"\n\t       -----------\n\t\t" +(char)a[7]+" | " +(char)a[8]+" | " +(char)a[9]+" \n");winner(a,1,m);return chk;}
    else if(a[3]==a[5] && a[7]==a[3])
    {chk=1;System.out.print("\t\t"+(char)a[1]+" | "+(char)a[2]+" | "+(char)a[3]+"\n\t       -----------\n\t\t"+(char)a[4]+" | "+(char)a[5]+" | "+(char)a[6]+"\n\t       -----------\n\t\t" +(char)a[7]+" | " +(char)a[8]+" | " +(char)a[9]+" \n");winner(a,3,m);return chk;}return 0;}
    private static int check1(int[] b, int i){int flg=0;for(int j=0;j<9;j++){if(i==b[j]){flg=1;}}if(flg==0){return 1;}else{return 0;}}
    private static int[] set(int[] a, int i, int n){a[i]=n;return a;}
    private static int[] setb(int[] b, int x, int i){b[x]=i;return b;}
    private static void winner(int[] a, int i, int m){if(a[i]==m){System.out.println("\nGame Over......'Human' wins !");}else{System.out.println("Game Over......'Computer' wins !");}}}