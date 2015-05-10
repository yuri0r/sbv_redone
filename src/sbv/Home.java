package sbv;

public class Home {
    
    //Cureent Students count
    public static String StudentsCount(){
        try{
            return  Query.getString("SELECT COUNT(ID) FROM sbm_students","COUNT(ID)");
        }catch(Exception e){System.out.println(e + "StudentsCount");}
        return null;   
    }
    
    //current count of borrowed copys
    public static String WildCopyCount(){
        try{
            return  Query.getString("SELECT COUNT(ID) FROM sbm_copieshistory WHERE collected LIKE '' AND bought = 0","COUNT(ID)");
        }catch(Exception e){System.out.println(e + "WildCopyCount");}
        return null;
    }
    
    //returns number of copies in Stock
    public static String CauchtCopyCount(){//statement is still wrong
        try{
            return  Query.getString("SELECT COUNT(ID) FROM sbm_copieshistory WHERE collected LIKE '' AND bought = 0","COUNT(ID)");
        }catch(Exception e){System.out.println(e + "CauchtCopyCount");}
        return null;
    }   
}
