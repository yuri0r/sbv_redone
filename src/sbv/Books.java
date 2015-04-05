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
import static sbv.TestQuery.TableNames;

/**
 *
 * @author Mack
 */
public class Books {
    
    //für einzelnen Frame
      
    public static String getLabel(String copy_Id) {
        try{
            Connection con = DbConnector.getConnection(); //connect
            PreparedStatement statement = con.prepareStatement("SELECT label FROM sbm_books WHERE isbn LIKE " + copy_Id);
            ResultSet result = statement.executeQuery();
            result.next();
            String label = result.getString("label");

            return label;
        }
        catch(Exception e){System.out.println(e);}
            return null;  
    }
    
     public static ArrayList<String> SingleBookSerch ( String copyId) {    
         try{
            Connection con = DbConnector.getConnection(); //connect
            PreparedStatement statement = con.prepareStatement(" SELECT ID, copy_id, student_id, distributed, collected, bought, notice, paid FROM sbm_copieshistory WHERE ID LIKE " + copyId);//SQL Query
            ResultSet result = statement.executeQuery();        // gets results
            ArrayList<String> array = new ArrayList();          //Arraylist for Results
            String[] collum = TableNames(copyId);                //gets collum names
            int collum_nr = collum.length;                      //gets number ov collums 
            //42 <3
            while (result.next()){                              //Saves results
                for (int i =0; i<collum_nr;i++){
                    array.add(result.getString(collum[i]));
                }     
            }
            return array;
        }
        catch(Exception e){System.out.println(e);}
        return null;     
    } 
   
}
