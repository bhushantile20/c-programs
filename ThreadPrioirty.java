class A extends Thread
{
     public void run()
     {
         System.out.println("THis is THread A\t THread ID:"+Thread.currentThread().getId()+"\tThread Priority :"+Thread.currentThread().getPriority());

     }
}
class B extends Thread 
{
     public void run()
     {
         System.out.println("This is THread B\t Thread ID:"+Thread.currentThread().getId()+"\t Thread Priority :
         "+Thread.currentThread().getPriority());

     }
}
class C extends Thread{
     public void run()
     {
         System.out.println("THis thread is Thread C/t THread ID :"+THread .currentThread().getPriority());

     }

}
class Threadpriority
{
     public static void main(String args[])
     {
        A threadA=new A();
        B threadB=new B();
        C threadC=new C();
        threadA.setPriority(Thread.MIN_PRIORITY);
        threadB.setPriority(Thread.NORM_PRIORITY);
        threadC.setpriority(Thread.MAZ_PRIORITY);

        threadA.start();
        threadB.start();
        threadC.start();
        
     }
}