import java.util.*;

class Sample5
{
   public static void main(String args[])
   {
      Set ts = new TreeSet();
      ts.add("ONE");
      ts.add("TWO");
      ts.add("THREE");
      System.out.println("Members from Treesets = "+ts);
      
      Set ts2 = new TreeSet();
      ts2.add(1);
      ts2.add(2);
      ts2.add(3);
      ts2.add(4);
      System.out.println("Members From TreeSet = "+ts2);
   }
}      
