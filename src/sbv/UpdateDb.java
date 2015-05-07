package sbv;

import java.util.ArrayList;
//will convert old database structure to the new one :)
public class UpdateDb {
    public static void UpdateAll() throws Exception {
      deleteTables();                   //deletes old tables
      createTables();                   //creates new tables
      updateClassTable();               //Updates class table
      updateClassStudentTable();        //Transfers classesfrom Students table to students-classes table and removes classes cullom from students table   
    }
    
    public static void deleteTables(){ 
        try{
            Query.anyUpdate("DROP TABLE `sbm_booklists`");
            Query.anyUpdate("DROP TABLE `sbm_languages`");
            Query.anyUpdate("DROP TABLE `sbm_users`");
            Query.anyUpdate("DROP TABLE `sbm_userpermissions`");
            Query.anyUpdate("DROP TABLE `sbm_usergroups`");
            Query.anyUpdate("DROP TABLE `sbm_userconfigs`");
            Query.anyUpdate("DROP TABLE `sbm_configurations`");
        }
        catch(Exception e){System.out.println(e);}
}  
    
    public static void createTables(){
        try{
            Query.anyUpdate("CREATE TABLE `sbm_classes` (`ID` int(11) NOT NULL,`name` text NOT NULL,PRIMARY KEY (`ID`) )ENGINE=InnoDB DEFAULT CHARSET=latin1");
            Query.anyUpdate("CREATE TABLE `sbm_classes-books` ( `ID` int(11) NOT NULL AUTO_INCREMENT, `book_id` int(11) NOT NULL COMMENT 'FS zu books', `class_id` int(11) NOT NULL COMMENT 'FS zu classes', PRIMARY KEY (`ID`)) ENGINE=InnoDB DEFAULT CHARSET=latin1");
            Query.anyUpdate("CREATE TABLE `sbm_students-classes` ( `ID` int(11) NOT NULL AUTO_INCREMENT, `student_ID` int(11) NOT NULL, `class_ID` int(11) NOT NULL, PRIMARY KEY (`ID`)) ENGINE=InnoDB AUTO_INCREMENT=247 DEFAULT CHARSET=latin1");
        }
        catch(Exception e){System.out.println(e);}
    }
    
    public static void updateClassTable(){
        try{
            Query.anyUpdate(" ALTER TABLE `sbm_classes` MODIFY COLUMN `ID` INT(20) AUTO_INCREMENT;");
            Query.anyUpdate( "ALTER TABLE sbm_classes AUTO_INCREMENT = 1;");
            ArrayList<String> results = Query.anyQuery("SELECT class FROM sbm_students GROUP BY class"); //gets ID's and names from classes table
                for(int i=0; i<results.size(); i++){
                    Query.anyUpdate("INSERT INTO `sbm_classes` SET name = \"" + results.get(i)+"\"");
                } 
        }catch(Exception e){System.out.println(e);}
    }  
    
    public static void updateClassStudentTable(){
        try{
            Query.anyUpdate(" ALTER TABLE `sbm_students-classes` MODIFY COLUMN `ID` INT(20) AUTO_INCREMENT;");
            Query.anyUpdate( "ALTER TABLE `sbm_students-classes` AUTO_INCREMENT = 1;");        
            ArrayList<String> results = Query.anyQuery("SELECT name, ID FROM sbm_classes"); //gets ID's and names from classes table

                for (int i=0;i < (results.size()-1);i=i+2){ //goes trough all class  namens
                    classes(results.get(i),results.get(i+1));
                }
       
            Query.anyUpdate("ALTER TABLE `sbm_students` DROP class");
        }catch(Exception e){System.out.println(e);}
    }
    
    public static void classes(String Klasse,String ID){
        try{
            ArrayList<String> studentId =Query.anyQuery("SELECT ID FROM sbm_students WHERE class LIKE \"" + Klasse+ "\"");
    
                for(int i = 0; i < studentId.size(); i++){
                    Query.anyUpdate("INSERT INTO `sbm_students-classes` SET `class_ID` = "+ ID +", `student_ID` = " + studentId.get(i));
                }
            }catch(Exception e){System.out.println(e);}
    }
}