class Exception2
{
     public static void main(String args[])
     {
         int cb=100000;
         int wb=6000;

         try
         {
             if(cb<wb)
             {
                 throw new ArithmeticException("InSufficent Balance");

             }
             cb=cb-wb;
             System.out.println("Transaction susscesfull");
             System.out.println("Curret balaance is "+cb);

         }
         catch(ArithmeticException a1)
         {
             System.out.println(a1.getMessage());
             System.out.println("CurrentBalance "+cb);
        
         }
     }
}