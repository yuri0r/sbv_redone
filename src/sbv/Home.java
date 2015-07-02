package sbv;

   import java.util.ArrayList; 
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
    public static String CauchtCopyCount(){
        try{
            int history = Integer.parseInt(Query.getString("SELECT COUNT(ID) FROM sbm_copieshistory","COUNT(ID)"));
            int all = Integer.parseInt(Home.AllCopyCount());            
            int catchedhistory = Integer.parseInt(Query.getString("SELECT COUNT(sbm_copies.ID) FROM sbm_copieshistory , sbm_copies WHERE bought = 0 AND collected LIKE '%' AND copy_id LIKE sbm_copies.ID","COUNT(sbm_copies.ID)"));
            int result = catchedhistory + (all - history);
            return Integer.toString(result);
        }catch(Exception e){System.out.println(e + "CauchtCopyCount");}
        return null;
    } 
    
     public static String boughtCopyCount(){
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