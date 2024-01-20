import java.util.*;

class printcollection1{
    public static void main(String args[])
    {
    Vector v=new Vector();
    v.add(2.5);
    v.add(111);
    v.add(true);
    v.add(null);
    System.out.print("[");
    for(int i=0;i<v.size();i++)       
    System.out.print(v.get(i)+",");
    System.out.print("]");
    for(Object o:v)

    Iterator litr=v.iterator();
    while(litr.hasNext())
    System.out.println(litr.next());


}
}
