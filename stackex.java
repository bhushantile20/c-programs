import java.util.*;
public class stackex
{
     public static void main(Strig args[])
     {
         Stack st=new Stack();
         st.push("java");
         st.push("latest");
         st.push("Editiion");
         st.push("-Fifth");
         System.out.println("The elements in the stack :"+st);
         System.out.println("The elements at the top :"+st.peek());
         System.out.println("The element poped outof the stack L"+st.pop());
         System.out.println("The element in a stack after pop out an element :"+st);
         System.out.println("The result of  searched " +st.search("r u"));
         
     }
}