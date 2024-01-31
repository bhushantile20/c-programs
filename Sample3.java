import java.util.*;

class Sample3
{
   public static void main(String args[])
   {
      HashSet hs = new HashSet(5,0.5f);
      System.out.println(hs.add("one"));
      System.out.println(hs.add("two"));
      System.out.println(hs.add("three"));
      System.out.println(hs.add("four"));
      System.out.println(hs.add("five"));
      
      System.out.println(hs);
      
      Boolean b = hs.add("one");
      System.out.println("Duplicate item allowed = " +b);
      System.out.println(hs);
   }
}
