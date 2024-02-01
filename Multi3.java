class MyThread extends  Thread
{ 
    String message;
    MyThread(String message)
    {
         this.message=message;

    }
    public void run()
    {
         try{
            for(int i=1;i<=5;i++)

            {
               System.out.println(message+"-"+i)
               Thread.sleep(5000);


            }
         }
         catch(InterruptedException ie)
         {
             
         }
    }
}
 public class Multi3 
 {
     public static void main(String args[]){
        MyThread t1=new MyThread("one");
        MyThread t2=new MyThread("Two");
        System.out.println(t2);
        t1.start();
        t2.start();
        
     }
 }

