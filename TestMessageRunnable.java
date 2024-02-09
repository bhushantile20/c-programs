class MessageRunnable implments Runnable
{
     String msg;
     int n;
     MessageRunnable(String n,int no)
     {
         msg =m;
         n=no;
     }

     public void run()
     {
         for(int i=0; i<n;i++)
         {
             System.out.println(msg);
             try
             {
                 Thread.sleep(500);
             }
             catch(InterruptedException ie)
             {

             }
         }
     }
}


class TestMessageRunnable
{
     public static void main(String args[])
     {
        MessageRunnable m1=new MessageRunnable("good morning ",10)
        Thread t1=new Thread(m1); 
        t1.start();

         MessageRunnable m1= new MessageRunnable("good morning ",20)
         Thread t2=new Thread(m2);
         t2.start();
     }
}