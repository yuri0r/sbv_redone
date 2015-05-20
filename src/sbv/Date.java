
package sbv;

import java.text.SimpleDateFormat;

public class Date {
    public static String ToNormal (String timestamp){
        //String S = new SimpleDateFormat("MM/dd/yyyy").format(timestamp);
        String s;
        long stuff = Long.parseLong(timestamp);
        java.util.Date time = new java.util.Date((long)stuff*1000);
        //s = time.toString();
        s = new SimpleDateFormat("MM/dd/yyyy").format(time);
        return s ;   
    }
    
}
