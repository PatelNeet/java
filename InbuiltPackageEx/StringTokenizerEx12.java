package InbuiltPackageEx;

import java.util.StringTokenizer;

public class StringTokenizerEx12 
{
    public static void main(String[] args) {
        String s="my name is heyram/my name is bharat";
        StringTokenizer st=new StringTokenizer(s,"/");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
