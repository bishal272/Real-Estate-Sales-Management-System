package resms;
import java.sql.*;

    public class mysqlcon{
        public Connection c;
        Statement s;
        public mysqlcon(){

            try{
                //here resms is database name, root is username and password
                c=DriverManager.getConnection("jdbc:mysql://localhost:3306/resms","root","417441");//returns a connection to the url
                System.out.println("Connected Successfully!");
                s=c.createStatement();//the statement is a interface and it is used to sending a SQL query to the database
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }

