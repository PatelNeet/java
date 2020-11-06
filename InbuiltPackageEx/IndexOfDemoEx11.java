package InbuiltPackageEx;
public class IndexOfDemoEx11 {
    public static void main(String[] args) {
        
    
   String s="now is the time for all good man"+"to come to the aid of their country";
   System.out.println (s);
   System.out.println ("IndexOf(t)="+s.indexOf('t'));
   System.out.println ("lastIndexOf(t)="+s.lastIndexOf('t'));
   System.out.println ("IndexOf(the)="+s.indexOf("the"));
   System.out.println ("lastIndexOf(the)="+s.lastIndexOf("the"));
   System.out.println ("IndexOf(t,10)="+s.indexOf('t',10));
   System.out.println ("lastIndexOf(t,60)="+s.indexOf('t',60));
   System.out.println ("IndexOf(the,10)="+s.indexOf("the",10));
   System.out.println ("lastIndexOf(the,60)="+s.lastIndexOf("the",60));
    }
}
