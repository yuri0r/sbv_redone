package sbv;

public class BookGroups {
    
    //adds record
    public static void AddRecord(String book_id, String class_id){
        try{
            Query.anyUpdate("INSERT INTO `sbm_classes-books` SET book_id= " +book_id+" , class_id = "+class_id);
        }catch(Exception e){System.out.println(e +"AddRecord");}
    }
    
    //deletes record
    public static void DeleteRecord(String ID){
        try{
            Query.anyUpdate("DELETE FROM `sbm_classes-books` WHERE ID LIKE " +ID);
        }catch(Exception e){System.out.println(e +"AddRecord");}
    }
    
    //shows books inside a group
    public static void BooksList(String class_id){
        try{
            Query.anyQuery("SELECT label FROM `sbm_classes-books`, `sbm_books` WHERE sbm_books.ID LIKE book_id AND class_id LIKE " +class_id);
        }catch(Exception e){System.out.println(e +"AddRecord");}
    }
}

