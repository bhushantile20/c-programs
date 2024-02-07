class MessageThread extends Thread{
  String msg;
   MessageThread(String m){

   
 msg=m;
   }
    }
    public void run()
    {
         while(true)
         {
             System.out.println(msg);

         }
    }


class A{
    public static void main(String args[])
    {
        A m1= new A("Good MOrining ");
          m1.start();
          
        A m2=new M2("Good Evning");
     m2.start();
           
        }
}