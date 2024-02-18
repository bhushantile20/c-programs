import java.util.*;
class Q2
{
     public static void main(String args[])
     {
         ArrayList<Integer>  a1=new <Integer> ArrayList();
         Scanner sc=new Scanner(System.in);
         int i,n;
         System.out.println("ENter how many integers:");
         n=sc.nextInt();
         for(i=0;i<n;i++)
         {
             System.out.
             print("Enter unique integer:");
             t=sc.nextInt();
             if(a1.contains(t))
             System.out.println(t+"is aleradey exits");
             else
             {a1.add(t);
             al.add(sc.nextInt());
         }}

         Collection.sort(a1);
         System.out.println("Sorted Integers");
         System.out.println(a1);
         
         System.out.println("ENter number to be searched:");
         t=sc.nextInt();
         int ans=Collections.binarySearch(a1.t);
         if(ans<0)
         
            System.out.println(t+"not found");
          
         else
         { 
            System.out.println(t+"found at"+ans);
         }

     }
}