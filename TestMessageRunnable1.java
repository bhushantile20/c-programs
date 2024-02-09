
class MessageRunnable1 implements Runnable{
     String msg;
     int n;
     Thread t;

     MessageRunnable(String n,int no)
     {
         msg=m;
         n=no;
         t=new Thread(this);
         t.start();
     }

     public void run()
     {
         for(int i=0;i<n;i++)
         {
            System.out.println(msg);
            try{
                 Thread.sleep(500);

            }
            catch(InterruptedException ie)
            {
                 
            }
         }
     }
}

class TestMessageRunnable1
{
     public static void main(String arhs[])
     {
         MessageRunnable1 m1=new MessageRunnable1("good moring",10);

         MessageRunnable2 m2= new MessageRunnable2("Good Evning",20);

         
     }
}