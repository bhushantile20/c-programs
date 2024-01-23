import java.sql.*;
import java.util.*;
class EmployeeMenu{
    public static void main(String args[]){
        Connection con;
        Statement stmt;
        ResultSet rs;
        try{
            Scanner sc = new Scanner(System.in);
            int choice,ch1,ans;

            int eid;
            String ename;
            float esalary;

            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost/tyjdbc1","postgres","password");
            stmt = con.createStatement();

            do{
                System.out.println("1:Insert");
                System.out.println("2:Delete");
                System.out.println("3:Update");
                System.out.println("4:Search");
                System.out.println("5:View All");
                System.out.println("6:Exit");
                System.out.print("Enter your choice:");
                choice = sc.nextInt();

                switch(choice){
                    case 1: System.out.print("Enter id:");
                            eid = sc.nextInt();
                            System.out.print("Enter name:");
                            ename = sc.next();
                            System.out.print("Enter salary:");
                            esalary = sc.nextFloat();
                            try{
                                stmt.executeUpdate("insert into employee values("+eid+",'"+ename+"',"+esalary+")");
                                System.out.println("Record inserted successfully");
                            }catch(SQLException sqle){
                                System.out.println("employee already exist");
                            }                            
                            break;
                    case 2: System.out.print("Enter id to be deleted:");
                            eid = sc.nextInt();
                            ans = stmt.executeUpdate("delete from employee where id="+eid);
                            if(ans==0)
                                System.out.println("Given id is not present");
                            else
                                System.out.println("Record deleted successfully");
                            break;
                    case 3: System.out.println("1:Update name:");
                            System.out.println("2:Update salary:");
                            System.out.print("Enter your choice:");
                            ch1 = sc.nextInt();                            
                            System.out.print("Enter id to be updated:");
                            eid = sc.nextInt();
                            if(ch1==1){
                                System.out.print("Enter new name:");
                                ename = sc.next();
                                ans = stmt.executeUpdate("update employee set name='"+ename+"' where id="+eid);
                                if(ans==0)
                                    System.out.println(eid+" not present");
                                else
                                    System.out.println("Record updated successfully");
                            }else if(ch1==2){
                                System.out.print("Enter new salary:");
                                esalary = sc.nextFloat();
                                ans = stmt.executeUpdate("update employee set salary="+esalary+" where id="+eid);
                                if(ans==0)
                                    System.out.println(eid+" not present");
                                else
                                    System.out.println("Record updated successfully");
                            }else
                                System.out.println("Go to hell");
                            break;
                    case 4: System.out.print("Enter id to be searched:");
                            eid = sc.nextInt();
                            rs = stmt.executeQuery("select * from employee where id="+eid);
                            if(rs.isBeforeFirst()){
                                rs.next();
                                System.out.println("ID\t\tNAME\t\tSALARY");
                                System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getFloat(3));
                            }else
                                System.out.println(eid+" not present");
                            break;
                    case 5: rs = stmt.executeQuery("select * from employee");
                            if(rs.isBeforeFirst()){
                                System.out.println("ID\t\tNAME\t\tSALARY");
                                while(rs.next()){
                                    System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getFloat(3));
                                }
                            }else   
                                System.out.println("There is nothing to view");
                            break;
                }
            }while(choice!=6);
        }catch(ClassNotFoundException cnfe){
            System.out.println(cnfe);
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
        catch(Exception e){
            System.out.println(e);
        }        
    }
}