package sbv;

public class Home {
    
    //Cureent Students count
    public static String StudentsCount() throws Exception {
        return  Query.getString("SELECT COUNT(ID) FROM sbm_students","COUNT(ID)");
    }
    
    //current count of borrowed copys
    public static String WildCopyCount() throws Exception {
        return  Query.getString("SELECT COUNT(ID) FROM sbm_copieshistory WHERE collected LIKE '' AND bought = 0","COUNT(ID)");
    }
    
    
    
}
