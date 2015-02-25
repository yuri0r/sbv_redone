package sbv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TestQuery {
    
    public static ArrayList<String> Test() throws Exception{
        try{
            Connection con = DbConnector.getConnection(); //connect
            PreparedStatement statement = con.prepareStatement("SELECT * FROM sbm_books LIMIT 0,30");//SQL Query
            
            ResultSet result = statement.executeQuery();        // gets results
            
            ArrayList<String> array = new ArrayList();          //saves Resuts in ArryList
            while (result.next()){                              //prints results
                System.out.println(result.getString("label"));
                array.add(result.getString("label"));
            }
            return array;
        }
        catch(Exception e){System.out.println(e);}
        return null;        
       
    }
}