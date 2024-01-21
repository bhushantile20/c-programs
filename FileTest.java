import java.io.File;
class FileTest
{
    public static void main(String args[])
    {
      File f1=new File("data.txt");
         if(f1.exists())
           System.out.println("File Exists");
         else
           System.out.println("File Does NOT Exists");
    }

}
