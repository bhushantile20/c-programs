class RuunableThread implements Runnable
{
    Thread runner;
    public RunnableThread()
    {

    }
    public RunnableThread(String threadName)
    {
         runner =new Thread(this,threadName);
         System.out.println(runner.getName());
         runner.start();

    }
    public void run()
    {
         System.out.println(Thread.currentThread());
    }
}






public class RunnableExample {
    public static void main(String args[])
    {
         Thread t1=new Thread(new RunnableThread(),"t1");
         Thread t2=new Thread(new RunnableThread(),"t2");
         RunnableThread t3=new RunnableThread("t3");
         t1.start();
         t2.start();
         try
         {
             Thread.currentThread().sleep(1000);

         }
         catch(InterruptedException e)
         {

         }
         System.out.println(Thread.currentThread());
    }
    
}

