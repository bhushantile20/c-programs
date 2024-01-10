
public class ArmstrongNumber{

public static void main(String args[])
{
    int n=153,arg,sum=0,r;
    arg=n;
    for(int i=1;i<n;i++)
    { 
        while(n>0)

        { 
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;

        }
    }
    if(arg ==sum)
    { 
        System.out.println("Given number is not armsstrong nnumber :"+arg);
    }
    else
    {
         System.out.println("given number is not armstrong number:"+arg);
         
    }
}}
