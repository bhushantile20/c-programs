import java.util.*;

class printcollection2{
    public static void main(String args[])
    {
    Vector v=new Vector();
    v.add(2.5);
    v.add(111);
    v.add(true);
    v.add(null);
    System.out.println(v);
    System.out.print("[");
    for(int i=0;i<v.size();i++)       
    System.out.print(v.get(i)+",");
    System.out.print("]");
  
   
    
    ListIterator litr=v.listIterator();
    while(litr.hasPrevious())
    System.out.println(litr.previous());

    System.out.println("content is forward direction :");
    while(litr.hasNext())
    System.out.print("[");
    for(int i=0;i<v.size();i++)       
    System.out.print(v.get(i)+",");
    System.out.print("]");
  
    System.out.println(litr.next());
    

}
}