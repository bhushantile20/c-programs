class CreatThreadm1 implements Runnable
{
     Thread t;
     Createthreadm1(String s)

     { 
        t=new Thread(this,s);
        t.start();

     }
public void run()
{ 
    for(int i=0;i<2;i++)
    
    {
        System.out.println("Thread Name :"+Thread.currentThread().getName());
        try
        {
             System.out.Println("Now "+Thread.currentThread().getName()+"sleep...");
             Thread.sleep(5000);
             System.out.Println("");
             System.out.println("Now "+Thread.currentThread().getName()+"wakeup....");

        } 
        catch(Exception e){}
        }
        System.out.Println("Finally"+Thread.currentThread().getName()+"exited..");
    }
}
public class RunnbleThread
{
     public static void main(String args[])
     {
         System.out.println("Thread Name:"+Thread.currentThread().getName());
         Createthreadm1 m1=new Createthreadm1("First thread");
         Creatthreadm1 m2=new Createthreadm1("Second thread");
     }
}

