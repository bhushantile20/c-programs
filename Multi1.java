class Multi1 implements Runnable
{
     public void run()
     { 
        System.out.println("My thread is in running state.");
     }
     public static void main(String args[])
     {
         Multi m1=new Multi();
         Thread tobj=new Thread(m1);
         tobj.start();
     }
}