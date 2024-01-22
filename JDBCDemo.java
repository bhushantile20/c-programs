import java.sql.*;
import java.io.*;
class JDBCDemo
{ 
    public static void main(String args[])
    {
         Connection con=null;
         Statement stmt= null;
         ResultSet rs=null;
         try{
            Class.forName("org.Postgresql.Driver");
            con=DriverManager.getConnection("jdbc:postgresql:empDB","postgres","");
            if(con==null)
                 System.out.println("conncetion failed");
                 else
                 {
                    System.out.println("Conncetion succesful");
                    stmt =con.createStatement();
                    rs=stmt.executeQuery("Select *from emp");
                    while(rs.next())
                    {
                         System.out.println("EmpId="+rs.getInt(1));
                         System.out.println("EmptName="+rs.getString(2));
                         System.out.println("Salary="+rs.getInt(3));

                    }
                    con.close();

                 }
                 catch(Exception e)
                 {
                     System.out.println("Error"+e);


                 }
                }
            }
            

            }
         }
    }
}