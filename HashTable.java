import java.util.*;

class HashTable
{
    public static void main(String args[])
    {
     Hashtable h1=new Hashtable();
     h1.put("1","bhushan Tile");
     h1.put("2","Pawar Alok");
     h1.put("3","atul SHewale");
     Enumeration keys =h1.keys();
     while(key.hasMoreElements())
     {
         String key=(String )keys.nextElement();
         System.out.println(key+"-"+h1.get(key));
         
     }
}
}