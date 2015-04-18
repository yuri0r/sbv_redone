package sbv;


public class Home {
    
    public static String StudentsCount(){
        return  Query.getString("SELECT COUNT(ID) FROM sbm_students","COUNT(ID)");
    }
    
    public static String WildCopyCount(){
        return  Query.getString("SELECT COUNT(ID) FROM sbm_copieshistory WHERE collected LIKE '' AND bought = 0","COUNT(ID)");
    }
    
    
    
}
