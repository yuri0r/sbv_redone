package sbv;

import java.util.ArrayList;

public class Books {
     
     
    //spits out an arraylist of all books
    public static ArrayList<String> BookList(){
        try{
            return  Query.anyQuery("SELECT label, isbn, price, buy FROM sbm_books ORDER BY label");
        }catch(Exception e){System.out.println(e + "BookList");}
        return null;
    }
      public static ArrayList<String> BookIDList(){
        try{
            return  Query.anyQuery("SELECT ID FROM sbm_books ORDER BY ID");
        }catch(Exception e){System.out.println(e + "BookIDList");}
        return null;
    }
    
    //gives information on one book
    public static ArrayList<String> singleBook(String sterm, int i){
        if(i==0){
            try{
                return Query.anyQuery("SELECT label, isbn, price, buy, ID FROM sbm_books WHERE isbn Like '" +sterm +"'");
            }catch(Exception e){System.out.println(e +"singleBook");}
        } else{
            try{
                return Query.anyQuery("SELECT label, isbn, price, buy FROM sbm_books WHERE label Like '" +sterm +"'");
            }catch(Exception e){System.out.println(e +"singleBook");}    
        }
        return null;       
    }
    
     public static String singleBookName(String bookID){
        
            try{
                return Query.getString("SELECT label  FROM sbm_books WHERE ID Like '" +bookID +"'","label");
            }catch(Exception e){System.out.println(e +"singleBook");}
          return null;       
     
        }
        
    //edits book
    public static void editBook(String ID, String label, String isbn, String price, String buy){
        try{
            Query.anyUpdate("INSERT INTO `sbm_books` SET label ='" + label+"', isbn = " + isbn+", price = " + price+", buy = " + buy +" WHERE ID LIKE " + ID);
        }catch(Exception e){System.out.println(e+ "editBook");}
    }
    
    //creates new book
    public static void newBook(String label, String isbn, String price, String buy){
        try{
            Query.anyUpdate("INSERT INTO `sbm_books` SET label ='" + label+"', isbn = " + isbn+", price = " + price+", buy = " + buy);
        }catch(Exception e){System.out.println(e+"newBook");}
    }
}
