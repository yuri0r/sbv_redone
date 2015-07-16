package sbv;

import java.util.ArrayList;
//import java.sql.Date;

public class Students {
    
    //All students
    public static ArrayList<String> StudentsList(){
        try{
            return Query.anyQuery("SELECT forename, surname, birth FROM sbm_students");   
        }catch(Exception e){System.out.println(e+ "StudentsList");}
        return null;
    }
    
   //Schüler informationen abhängig vom der schülerID und einem index 
    public static String SingelStudent( String StudentId, int index){
        try{
            ArrayList<String> result = Query.anyQuery("SELECT ID, forename, surname, birth FROM `sbm_students` WHERE ID LIKE '" + StudentId+"'"); 
            return result.get(index);     
        }catch(Exception e){System.out.println(e +"SingelStudent");}
        return null;
    }
    
    //booklist of a student
    public static ArrayList<String> BookList(String student_id){
        try{
            return  Query.anyQuery("SELECT label, bought, distributed, paid FROM sbm_copieshistory , sbm_books, sbm_copies WHERE sbm_books.ID LIKE book_id AND sbm_copies.ID LIKE copy_ID AND student_ID LIKE " + student_id);
        }catch(Exception e){System.out.println(e + "BookList");}
        return null;
    } 
    
    //copies to return
    public static String CopiesToReturn ( String StudentId){
        try{
            String result = Query.getString("SELECT COUNT(sbm_copieshistory.ID)FROM `sbm_copieshistory` WHERE bought LIKE '0' AND student_id LIKE '" + StudentId+"' GROUP BY student_id", "COUNT(sbm_copieshistory.ID)");
            return result;     
        }catch(Exception e){System.out.println(e +"CopiesToReturn");}
        return null;
    }
    
    public static ArrayList<String>  SingelStudentClasses ( String StudentId){
        try{
            ArrayList<String> result = Query.anyQuery("SELECT name FROM sbm_classes, `sbm_students-classes` WHERE student_ID LIKE "+ StudentId +" AND class_ID LIKE sbm_classes.ID"); 
            return result;    
        }catch(Exception e){System.out.println(e +"SingelStudentClasses");}
        return null;
    }
    
    
    
        //checks if student has a copy of a book
    public static boolean[] BookGroupListCheck(String class_id , String student_id){
        boolean results[] = null ;
        ArrayList<String>  books = BookGroups.getBookIds(class_id);
        ArrayList<String>  students = BookGroups.getStudentIds(class_id);
        boolean stahp =true;

        try{
            for(int i=0;i<students.size();i++){
                ArrayList<String>  studentsBooks = Students.BookList(students.get(i));
                for(int o=0;o<books.size();o++){
                    for(int k=0;k < studentsBooks.size();k++){
                        do{
                            if(books.get(o)== studentsBooks.get(k)){
                                results[o] = true;
                            }
                            else{
                                results[o] = false;
                            }
                            if (k == studentsBooks.size()){   
                                stahp=false;
                            }
                        }
                        while( results[o] || stahp == false);                        
                    }
                }
            } 
        return results;
        }catch(Exception e){System.out.println(e);}
        return null;
    }
     
    public static void moveToClass(String student_id, String class_id, String new_class_id){
        try{
            Query.anyUpdate("UPDATE `sbm_students-clases` SET class_id =" + new_class_id + ", student_id = "+ student_id + "WHERE student_id LIKE "+student_id + "AND class_id LIKE "+class_id);
        }catch(Exception e){System.out.println(e + "newStudent");}       
    }
    
       public static void addToClass(String student_id, String class_id){
        try{
            Query.anyUpdate("INSERT INTO `sbm_students-clases` SET class_id =" + class_id + ", student_id = "+ student_id);
        }catch(Exception e){System.out.println(e + "newStudent");}       
    } 
    
    //edits Student 
    public static void editStudent(int ID, String forename, String surename,String birth){ //birth might bug needs testing
        try{
            Query.anyUpdate("UPDATE `sbm_students` SET forename =" + forename + ", surename = "+ surename + ", birth = "+birth + "WHERE ID LIKE"+ ID );
        }catch(Exception e){System.out.println(e + "editStudent");}
    }
    
    //creates new student
    public static void newStudent(String forename, String surename,String birth){
        try{
            Query.anyUpdate("INSERT INTO `sbm_students` SET forename =" + forename + ", surename = "+ surename + ", birth = "+birth );
        }catch(Exception e){System.out.println(e + "newStudent");}       
    }    
}
