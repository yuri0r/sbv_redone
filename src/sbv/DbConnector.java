package sbv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector{

  

public static Connection getConnection() throws Exception{
try{
    String driver = "com.mysql.jdbc.Driver";                //chosing driver
    String url = "jdbc:mysql://localhost:3306/sbv_aes_2013";//choosing mySQL server server
    String username = "root";                               //DB ussername and password
    String password = "usbw";
    Class.forName(driver); 
    Connection con = DriverManager.getConnection(url,username­,password); //Connecting
    System.out.println("Connected");
    return con;
    } 
    catch(ClassNotFoundException | SQLException e){System.out.println(e);} // catches error if appears

return null;
}
   
}