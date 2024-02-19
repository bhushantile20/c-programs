import java.sql.*;
public class InsertData
{

    public static void main(String args[])throws Exception
    {
         final String drvr ="oracle.jdbc.driver.OracleDriver";
         final String usrname="System";
         final String passwed="Basclab";
         final String passwrd ="Bsclab":
         String sql=stmt="insert into Emp values ('1130','virat')";
         String commit="Commit";
         Conncetion conn=null;
         try{
            Class.forName(drvr).newInstance();
            conn=DriverManger.getConncetion(urldb,usrname,password);
            stmt.executeUpdate(sql_stmt);
            System.out.println("Data Inserted succesfully!");
            stmt.executeUpdate(commit);
            System.out.println("Commit Succesfully !");
            conn.close();
         }
          catch (Exception e)
        {
          System.out.println("Exception Handled....");
          e.printStackTrace();
          
        }
        
        }
    }