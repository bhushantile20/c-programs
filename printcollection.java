import java.util.*;

class printcollection{
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
    for(Object o:v)
    System.out.print(o);

}
}
