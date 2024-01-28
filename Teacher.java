import java.io.*;
class Teacher
{
     public static void main(String args[])throws SQLException,Exception{
         try{
            Class.forName("org.postgreSql,Driver");
            Connection cn=DriverManager.getConnection("jdbc:postgresql://localhost:IP//tybcs""postgres","root");
            Statement st=cn.createStatement()
              st.executeUpdate("Create table teacher(Tid int primary key,Tname varchar(250), Tdegree varchar(15),Tsalary float(50))");
              System.out.println("Table is created Succesfully");
              System.out.println("Insert How many records int Teacher Table ??");
              int n=Integer.parseInt(br.readLine());
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              
              for(int i;i<=n;i++)
              {
                 System.out.println("Enter teacher id");
                 int tid =Integer.parseInt(br.readLine());
                 System.out.Println("Enter tname");
                 String tname=br.readLine();
                 System.out.Println("Enter tname");
                 String tname=br.readLine();
                 System.out.Println("Enter tname");
                 String tname=br.readLine();

                 String sql="insert into teacher values(tid,tname,tdegree,tsalary);";

                 st.executeUpdate(sql);
                 System.out.println("Records inserted succesfully");
              }
              ResultSet rs=st.executeQuery("Selcet *from teacher");

              
        
              }
                  
         }
     }
}