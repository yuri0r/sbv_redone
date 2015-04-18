package sbv;

import java.util.ArrayList;

public class Books {
    
    //Buch informationen abhängig vom der copyID und einem index  
    public static String SingleBook ( String copyId,int index) throws Exception {    
       ArrayList<String> result = Query.anyQuery("SELECT label, sbm_copieshistory.ID, distributed, collected, bought, notice, paid FROM sbm_copieshistory, sbm_copies, sbm_books, sbm_students WHERE sbm_books.ID = sbm_copies.book_id AND sbm_copieshistory.copy_id = sbm_copies.ID  AND sbm_copieshistory.student_id = sbm_students.ID AND sbm_copieshistory.ID LIKE "+copyId);
       return result.get(index);
    } 
     
      //spits out an arralist of all books
    public static ArrayList<String> BookList(String BookID) throws Exception { //Takes super long
        return  Query.anyQuery("SELECT ID, label, isbn, price, buy FROM sbm_books");
    } 
    
    // how many copies peer label 
    public static ArrayList<String> CopyCount(String BookID) throws Exception { //Takes super long
        return  Query.anyQuery("SELECT sbm_books.ID, sbm_books.label, COUNT(sbm_copieshistory.ID) FROM sbm_copieshistory, sbm_books, sbm_copies WHERE sbm_copies.book_id LIKE sbm_books.ID AND sbm_copieshistory.copy_id LIKE sbm_copies.ID GROUP BY sbm_books.label");
    }
}