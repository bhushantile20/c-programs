class A extends Thread
{
     public void run()
     {
         for(int i=1; i<=5;i++)
         {
             System.out.println("\t From Thread A: i= "+i);

         }
         System.out.println("Exit From A");

     }

}
class B extends Thread{
     public void run()
     {
         for(int j=1;j<=5; j++)

          { 

            System.out.println("\n From THread B: j=" +j);

          }
          System.out.println("Exit From B");

     }
}

class C extends Thread{
     public void run()
     {
         for(int k=1; k<=5;k++)
         {
             System.out.println("\t From THread C :k=" +k);


         }

         Sytem.out.println("Exit from C");

     }
}

class ThreadTest2
{
     public static void main(String args[])
     {
         new A().run();
         new B().run();
         new C().run();
         
     }
}