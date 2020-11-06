
package FileHandeling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput_6 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fi=new FileInputStream("cdac2.txt");
            int ch;
            
            while((ch=fi.read())!=-1)
            {
                System.out.println(ch);
            }
    }
}

//


