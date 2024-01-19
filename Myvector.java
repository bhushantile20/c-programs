import java.util.*;
class MyVector
{
    public static void main(String args[])
    {
        Vector v=new Vector();
        System.out.println(v);
        System.out.println("size:"+v.size());
        System.out.println("Capacity:"+v.capacity());

        v.add(111);
        System.out.println(v);
        System.out.println("Size:"+v.size());
        System.out.println("capacity:"+v.capacity());
        v.add(222);
        v.add(333);
        v.add(444);
        
    }
}