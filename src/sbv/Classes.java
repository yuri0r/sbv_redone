package sbv;

import java.util.ArrayList;

public class Classes {
    
    //arrayList of all classes with student count
    public static ArrayList<String> classesList(){
        try{
            return Query.anyQuery("SELECT name, COUNT(student_ID) FROM `sbm_classes`, `sbm_students-classes` WHERE sbm_classes.ID lIKE class_ID GROUP BY class_ID");   
        }catch(Exception e){System.out.println(e + "classesList");}
        return null;
    }
    
    //gets Class name
    public static String getClassName (int ID){
        try{
            return Query.getString("SELECT name FROM sbm_classes WHERE ID LIKE "+ ID,"name");
        }catch(Exception e){System.out.println(e + "getClassName");}
        return null;
    }
    
    public static ArrayList<String> getClassIDs(){
         
        try{
        return Query.anyQuery("SELECT ID FROM sbm_classes");        
        }catch(Exception e){System.out.println(e +"getClassIDs");}
        return null;
        
    }
    
    //all students in a class
    public static ArrayList<String> classList(String name){
        try{
            return Query.anyQuery("SELECT sbm_students.ID, forename, surname, birth FROM  `sbm_students`, `sbm_students-classes`, `sbm_classes` WHERE student_ID lIKE sbm_students.ID AND sbm_classes.name LIKE '"+ name+ "'");   
        }catch(Exception e){System.out.println(e + "classList");}
        return null;
    }    
    
    //adds new class
    public static void newClass(String name){
        try{
            Query.anyUpdate("INSERT INTO `sbm_classes` SET name =" + name);   
        }catch(Exception e){System.out.println(e + "newClass");}
    }
    
    //adds new class
    public static void editClass(int ID, String name){
        try{
            Query.anyUpdate("UPDATE `sbm_classes` SET name = " + name +" WHERE ID LIKE "+ ID);
        }catch(Exception e){System.out.println(e + "editClass");}
    }
}
