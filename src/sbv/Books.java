/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Mack
 */
public class Books {
    
    public static String getLabel(String isbn) {
        try{
        Connection con = DbConnector.getConnection(); //connect
        PreparedStatement statement = con.prepareStatement("SELECT label FROM sbm_books WHERE isbn LIKE " +isbn);
        ResultSet result = statement.executeQuery();
        result.next();
        String label = result.getString("label");

        return label;
        }
        catch(Exception e){System.out.println(e);}
        return null;  
    }
    
}
