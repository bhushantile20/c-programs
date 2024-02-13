import java.util.*;

class A extends Thread
{
     public void run()
     {
         for(int i =1;i<=5;i++)
         {
             if(i==1) 
             yield();
             System.out.println("\t From Thread A: i="+i);

         }
         System.out.println("Exit from A");

     }
    }
    class B extends Thread 
    {

        public void run()
        {
            for(int j=0;j<=5; j++)
            {
                 System.out.println("\t From Thread B; j="+j);
                 if(j==3) 
                 stop();


                }
                System.out.println("Exit From B");

        }
    }
    class C extends Thread{
         public void run()
         {
             for(int  k=1; k<=5; k++)
             {
                 System.out.println("\t From Thread C: k= "+k);
                 if(k==1)
                 try 
                 {
                     sleep(10000);

                 }
                 catch(Exception e)
                 {

                 }

             }
             System.out.println("Exit from c");

         }
    }

    class ThreadMethods 
    {
         
            public static void main(String args[])
            {
                 A threadA =new A();
                 B threadB =new B();
                 C threadC =new C();

                 System.out.println("Start thread A");
                 threadA.start();
                 System.out.println("Start thread B");
                 threadB.start();
                 System.out.println("Start thread C");
                 threadC.start();
                 System.out.println("End of main thread ");

            }
         }

    