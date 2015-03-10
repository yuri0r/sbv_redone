package sbv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestQuery {
    
    public static ArrayList<String> anyQuery() throws Exception{
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
    } //will be modified to execute and output any SQL statement
    
        /*
        Input is SQL statement Return is an Array of collum Names 
        */
        public static String[] TableNames (String statement ){
        
            Pattern rawPattern = Pattern.compile("SELECT.*FROM"); // catches hole SELECT ... FROM
            Matcher rawMatcher = rawPattern.matcher(statement); 
            rawMatcher.find();

            Pattern selectPattern = Pattern.compile("SELECT ");      //prepares to remove SELCT from the sql statement
            Matcher selectMatcher = selectPattern.matcher(statement);
            selectMatcher.find();
            int selectStart = selectMatcher.start(); 
            int selectEnd = selectMatcher.end();

            Pattern fromPattern = Pattern.compile("FROM");          //prepares to remove FROM from the sql statement
            Matcher fromMatcher = fromPattern.matcher(statement);
            fromMatcher.find();
            int fromStart = fromMatcher.start();
            int fromEnd = fromMatcher.end();

            String kommaPattern = "," ;                                                  //for removing the "," of the SQL statement

            StringBuffer raw = new StringBuffer(" ");                                    // SELECT and FROM gets cut out from Statement Stringbuffer 
            String tableLong = rawMatcher.group();                                       //and splited to an array of words (the collum names)
            raw.insert(0,tableLong);
            System.out.println(raw);
            raw.delete(fromStart, fromEnd); 
            raw.delete(selectStart, selectEnd);
            tableLong = raw.toString();
            tableLong = tableLong.replaceAll(kommaPattern,"");
            String[] table = tableLong.split(" ");

        return table;
    } 
}