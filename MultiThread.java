class Newthread implements Runnable
{
     thread t;
     String name ;
     Newthread (String s)
     
     {
         name =s;
         t=new  Thread (this,name);
         System.out.println("NEW Thread :"+t);
         t.start();

     }

     public void run()

     { 
        try 
        {
             for(int i=4;i>0;i++)
             {
                 System.out.Println(name+":"+i);
                 Thread.sleep(5000);

             }
            }

             catch(InterruptedException e){}
             System.out.println("Finally "+Thread.currentThread().getName()+"exited..");

        }
     }

    public class MultiThread
    {
         public static void main(String args[])
         {
             System.out.println("Thread Name:"+Thread.currentThread().getName());
             new Newthread("First");
             new Newthread("Second");
             new Newthread("Third");
             new Newthread("Fourth");
             
         }
    }
