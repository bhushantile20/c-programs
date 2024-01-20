import java.io.*;
class ArithmeticException{ 
    void fun1()throws ClassNotFoundException
    {
         throw new ClassNotFoundException();
    }

}
class Exception3
{
     public static void main(String args[])throws IOException

     {
          try{
             throw new IOException();

          }
          catch(IOException e1)
          {
             System.out.println(e1.getMessage());
             
          }
     }
}