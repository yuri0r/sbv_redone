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
    public static String CauchtCopyCount(){//statement is still wrong and broken
        try{
            int allI = Integer.parseInt(Query.getString("SELECT COUNT(sbm_copies.ID) FROM sbm_copies", "SELECT COUNT(sbm_copies.ID"));
            int historyI = Integer.parseInt(Home.AllCopyCount());            
            int result = Integer.parseInt(Query.getString("SELECT COUNT(sbm_copies.ID) FROM sbm_copieshistory , sbm_copies WHERE bought = 0 AND collected LIKE '%' AND copy_id LIKE sbm_copies.ID","COUNT(ID)")) + (allI - historyI);
        return Integer.toString(result);
        }catch(Exception e){System.out.println(e + "CauchtCopyCount");}
        return null;
    } 
    
     public static String boughtCopyCount(){//statement is still wrong
        try{
            return  Query.getString("SELECT COUNT(ID) FROM sbm_copieshistory WHERE bought = 1 AND collected LIKE ''","COUNT(ID)");
        }catch(Exception e){System.out.println(e + "CauchtCopyCount");}
        return null;
    }
     public static String AllCopyCount(){
        try{
            return  Query.getString("SELECT COUNT(ID) FROM sbm_copies","COUNT(ID)");
        }catch(Exception e){System.out.println(e + "WildCopyCount");}
        return null;
    }
}