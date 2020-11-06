
package FileHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SpecialEx_12 {
    public static void main(String[] args) {
         try {
           FileOutputStream fo=new FileOutputStream("File1.txt");
           Scanner sc=new Scanner(System.in);
             System.out.println("Enter No:");
           int no;
           no=sc.nextInt();
           
             for (int i = 1; i <= no; i++) {
                 fo.write(i);
             }
           fo.close();
           FileInputStream fi=new FileInputStream("file1.txt");
           FileOutputStream fo1=new FileOutputStream("File2.txt");
           FileOutputStream fo2=new FileOutputStream("File3.txt");
           int ch;
             System.out.println("File 1: ( Total no.)");
            while((ch=fi.read())!=-1)
            {
                System.out.println(ch);
                if(ch%2==0)
                {
                    fo1.write(ch);
                }
                else
                {
                    
                    fo2.write(ch);
                }
            }
           fi.close();
           fo1.close();
           fo2.close();
           FileInputStream fi1=new FileInputStream("File2.txt");
           FileInputStream fi2=new FileInputStream("File3.txt");
           
             System.out.println("File 2:(Even No.)");              
            while((ch=fi1.read())!=-1)
            {
                System.out.println(ch);
            }
            System.out.println("File 3:(Odd No.)");              
            while((ch=fi2.read())!=-1)
            {
                System.out.println(ch);
            }
            fi1.close();
            fi2.close();
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SpecialEx_12.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException e) //ha sir 
        {
            System.out.println("IO Ex...");
        }
    }
}

