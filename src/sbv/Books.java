package sbv;

import java.util.ArrayList;

public class Books {
     
     
    //spits out an arralist of all books
    public static ArrayList<String> BookList(){
        try{
            return  Query.anyQuery("SELECT label, isbn, price, buy FROM sbm_books ORDER BY label");
        }catch(Exception e){System.out.println(e + "BookList");}
        return null;
    }
    
    //edits book
    public static void editBook(String ID, String label, String isbn, String price, boolean buy){
        try{
            Query.anyUpdate("INSERT INTO `sbm_books` SET label =" + label+", isbn = " + isbn+", price = " + price+", buy = " + buy +"WHERE ID LIKE " + ID);
        }catch(Exception e){System.out.println(e+ "editBook");}
    }
    
    //creates new book
    public static void newBook(String label, String isbn, String price, boolean buy){
        try{
            Query.anyUpdate("INSERT INTO `sbm_books` SET label =" + label+", isbn = " + isbn+", price = " + price+", buy = " + buy);
        }catch(Exception e){System.out.println(e+"newBook");}
    }
}
