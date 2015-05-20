
package sbv;

import java.text.SimpleDateFormat;

public class Date {
    public static String ToNormal (String timestamp){
        String S = new SimpleDateFormat("MM/dd/yyyy").format(timestamp);
        return S ;   
    }
    
}
