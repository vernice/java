/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri;

import java.util.*;
import java.text.*;
/**
 *
 * @author zsolti
 */
public class UriFormDatum {
    
    String datum;
    
    public String aktDatum(){
        Date most = new Date();
        SimpleDateFormat formatum = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        datum = formatum.format(most);
        return datum;
    }
    
    
}
