class exceptiondemo
{
     public static void main(String args[])
     {
        int res,num=12;
        int b[]={2,0,4,0,6};
        try{
            for(int i=0;i<7;i++)
            {
                try{
                    res=num/b[i];
                    System.out.println("Res:"+res);


                }
                catch(ArithmeticException e1)
                {
                    System.out.println("Arithmetic exception");
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e2)
        {
            System.out.println("Array index out of bound exception");
        }
        finally
        {
            System.out.println("In finally--it will always execute");
        }
        System.out.println("After finally block");
        }
     }
