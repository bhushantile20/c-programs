//Slip4_1: Write a program to print an array after changing the rows and columns of a given two dimensional array.

import java.util.*;
class demo
{
   public static void main(String args[])
   {
 	System.out.println("enter the row and column");
	Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();
  	int c = sc.nextInt();
 	int mat[][] = new int[r][c];
	System.out.println("enter the array elts:");
	for(int i=0;i<r;i++)
 	{
	 for(int j=0;j<c;j++)
 	 {
		 mat[i][j] = sc.nextInt();
 	 }
        }
	System.out.println("the matrix is:");
 	for(int i=0;i<c;i++)
 	{
	 for(int j=0;j<r;j++)
 	 {
		 System.out.print(" " +mat[j][i]);
 	 }
	 System.out.println(" ");
        }
     }
}  
