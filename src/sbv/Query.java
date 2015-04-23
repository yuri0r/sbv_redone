package sbv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Query {
         
    //example get method just copy paste and modifie it :3
    public static String getString(String Statement, String label){
        try{
            Connection con = DbConnector.getConnection(); //connect
            PreparedStatement statement = con.prepareStatement(Statement);
            ResultSet result = statement.executeQuery();
            result.next();
            String returnString = result.getString(label);

            return returnString;
        }
        catch(Exception e){System.out.println(e);}
            return null;  
    }

    //executes any SQL query 
    public static ArrayList<String> anyQuery(String input) throws Exception {
        Connection con = DbConnector.getConnection(); //connect    
        try{
            PreparedStatement statement = con.prepareStatement(input);//SQL Query
            ResultSet result = statement.executeQuery();        // gets results
            ArrayList<String> array = new ArrayList();          //Arraylist for Results
            String[] collum = TableNames(input);                //gets collum names
            int collum_nr = collum.length;                      //gets number ov collums 
            //42 <3
            while (result.next()){                              //Saves results
                for (int i =0; i<collum_nr;i++){
                    array.add(result.getString(collum[i]));
                }     
            }
            con.close();
            return array;
        }
        catch(Exception e){System.out.println(e);}
        return null;   
    } 
    
    //Executes anny modificational SQL statement
    public static void anyUpdate(String input) throws Exception {
    Connection con = DbConnector.getConnection();       //connect    
        try{
            
            PreparedStatement statement = con.prepareStatement(input);//SQL Query
            statement.executeUpdate(input);                         //updates DB gets results 
            con.close();
        }
        catch(Exception e){System.out.println(e);}           
    } 
    
    //SQL Console
    public static void Console()throws Exception{
        InputStreamReader Input = new InputStreamReader(System.in);
        BufferedReader DataIn = new BufferedReader(Input);
        ArrayList<String> result = new ArrayList();
        Connection con = DbConnector.getConnection(); //tests Connection
        
        while(con != null){
            System.out.println("Enter SQL Statement");
            String statement = DataIn.readLine();
            String[] collums =Query.TableNames(statement);
            result = Query.anyQuery(statement);
            Query.output(result,collums);
        }
    }    
    
    //Input is SQL statement Return is an Array of collum Names
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
            //System.out.println(raw);                                                  //testing purpuse
            raw.delete(fromStart, fromEnd); 
            raw.delete(selectStart, selectEnd);
            tableLong = raw.toString();
            tableLong = tableLong.replaceAll(kommaPattern,"");
            String[] table = tableLong.split(" ");

        return table;
    }
 
    //primitiv method for SystemPrinting SQL Results
    public static void output(ArrayList<String> result, String[] collums){
        int rows = collums.length;
        
        for (int i = 0 ; i < result.size() ; i=i+rows){
            for(int o=i; o < (rows+i); o++){
                System.out.print(result.get(o));
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        
    }
}