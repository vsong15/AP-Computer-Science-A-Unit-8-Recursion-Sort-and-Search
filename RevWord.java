import java.util.*;
public class RevWord{
   public static void main (String[]args){
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter a word");
      String x = kb.next();
      System.out.println(x+" reversed is "+rev(x));
   }
   public static String rev(String w){
      if (w.length() < 1)
         return "";
      return rev(w.substring(1)) + w.substring(0,1);
   }
}

