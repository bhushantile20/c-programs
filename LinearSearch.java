import java.util.*;
 
class LinearSearch
{
     public static void main(String args[])
     {
         int i,num,searchval,array[];
         Scanner in =new Scanner(System.in);
         System.out.println("Enter number of elemtns ");
         num=in.nextInt();
         array=new int [num];
         System.out.println("Enter "+num+"integers");
         for(i=0;i<num;i++)
         array[i]=in.nextInt();
         System.out.println("Enter the search value:");
         searchval=in.nextInt();
         in.close();
         for(i=0;i<num;i++)
         { 
            if(array[i]==searchval)
            {
                 System.out.println(searchval+"is present ata location "+(i+1));
                 break;
            }
         }
         if(i==num)
         System.out.println(searchval+"is not exist in array.");
        }
     }
