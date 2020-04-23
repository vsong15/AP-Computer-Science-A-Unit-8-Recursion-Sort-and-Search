//Make a static method to find n! (factorial) but do it recursive style
import java.util.*;
public class Recursivefactorial{
   public static void main (String[]args){
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter a #");
      int x = kb.nextInt();
      System.out.println(x+"! = "+factorial(x));
   }
   public static int factorial(int n){
      if (n == 0)
         return 1;
      return n*factorial(n-1);
   }
}