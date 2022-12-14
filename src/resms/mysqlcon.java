package resms;
import java.sql.*;

    public class mysqlcon{
        public Connection c;
        public mysqlcon(){

            try{
                //here resms is database name, root is username and password
                c=DriverManager.getConnection("jdbc:mysql://localhost:3306/resms","root","417441");//returns a connection to the url
                System.out.println("Connected Successfully!");
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }

