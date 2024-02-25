import java.util.Enumeration;
import java.util.Hashtable;
public class HashTableExample
{
     public static void main(String args[])
     {
         Hashtable ht = new Hashtable();
         ht.put("item1 ","Apple");
         ht.put("item2","chiku");
         ht.put("item3","orange");
         ht.put("item4","pine");
         Enumeration e=ht.keys();
         while(e.hashMoreElements())
         {
             String str=(String) e.nextElement();
             System.out.println(ht.get(str));
         }
     }
}