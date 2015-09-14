
package sbv;

import java.text.SimpleDateFormat;

public class Date {
    public static String ToNormal (String timestamp){
        try{
        String s;
        long stuff = Long.parseLong(timestamp);
        java.util.Date time = new java.util.Date((long)stuff*1000);
        s = new SimpleDateFormat("MM/dd/yyyy").format(time);
        return s ;   
        }catch(Exception e){System.out.println(e + "date");}
        return timestamp;
    }
    
}
