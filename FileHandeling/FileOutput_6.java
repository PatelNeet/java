package FileHandeling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutput_6 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileOutputStream fo=new FileOutputStream("cdac2.txt");
         for (int i = 1; i <= 15; i++) {
                fo.write(i);
                
            }
    }
}
