import java.io.*;

class slip13a
{
    public static void main(String args[]) throws Exception
    {
        String Line;
        int cnt=0;

        FileReader  f1 = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(f1);

        while((Line=br.readLine())!=null)
        {
            String words[] = Line.split(" ");
            cnt = cnt + 1;
        }
        System.out.println("The Total Line Present in File is: "+cnt);
        f1.close();
    }
}