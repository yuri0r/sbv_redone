package sbv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector{

    /*
    Connects to SQL Database And catches error if appers
    */
    public static Connection getConnection() throws Exception{
    try{
        final String driver = "com.mysql.jdbc.Driver";                //chosing driver
        final String url = "jdbc:mysql://localhost:3306/sbv_aes_2013";//choosing mySQL server server
        final String username = "root";                               //DB ussername and password
        final String password = "usbw";
        Class.forName(driver); 
        Connection con = DriverManager.getConnection(url,username­,password); //Connecting
        System.out.println("Connected");
        return con;
        } 
        catch(ClassNotFoundException | SQLException e){System.out.println(e);} // catches error if appears

    return null;
    }
   
}