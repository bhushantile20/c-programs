//Slip7_2: Write a program to accept a text file from user and display the contents of a file in reverse order and change its case.

import java.io.*;
import java.util.*;
class reversefile
{
   public static void main(String args[])throws IOException
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter file name:");
	 String fnm = sc.next();
	 File f = new File(fnm);
	 if(f.isFile())
	 {
BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fnm));
		 int size =bis.available();
		 for(int i = size-1;i>=0;i--)
		 {
			 bis.mark(i);
			 bis.skip(i);
			 char ch=((char)bis.read());
			 if(Character.isLowerCase(ch))
				 ch=Character.toUpperCase(ch);
			 else if(Character.isUpperCase(ch))
				 ch = Character.toLowerCase(ch);
			 System.out.print(ch);
			 bis.reset();
		 }
 		bis.close();
 	}
 	else
 		System.out.println("file not found");
     }
}
