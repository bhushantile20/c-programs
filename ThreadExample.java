 import java.util.*;
 
 class Account
  {
    private int bal;
    Account(int b)
    {
        bal=b;
    }
    public boolean isSufBal(int wb)
   {
    if(bal>wb)
    {
        return true;
    }
    else
    {
         return false;
    }
   }
    void withdraw(int wb)
    {
        bal=bal-wb;
        System.out.println("Withrawl succesful "+wb);
        System.out.println("Current Balance  "+bal);
    }

    }
    class Customer implements Runnable
    {
         Account g1;
         String name;
         Customer(Account x1,String n1)
         {
            g1=x1;
            name=n1;

             
         }
         public void run()
         {Synchronized(g1);
            {
             Scanner s1=new Scnner(System.in);
             System.out.println(name+"ENter amount to withdrwal:");
             int wb=s1.nextInt();
             if(g1.isSufBal(Wb))
             {
              g1.withdraw(wb);
System.out.println("Money withdrawn by "+name);

             }
             else
             {
                 System.out.Println("Insufficent balance");

             }
         }
         
    }
}

    class ThreadExample
    {
     public static void main(String args[])
     {
         Account a1=new Account(10000);
        Customer c1=new Customer(a1,"Siddhesh");
        Customer c2=new Customer(a2,"bhushan");
    Thread t1= new Thread(c1);
    Thread t2=new Thread(c2);


     }
    }
