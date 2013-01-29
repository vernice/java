/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author zsolti
 */
public class UriConn {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String url = null;
    String user = null;
    String password = null;
    String kiir, kiir1, kiir2;
    
     public void kapcsolat() {
        try {

            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM megrendelok");
            rs = pst.executeQuery();

            /*   while (rs.next()) {
             kiir = rs.getString(1);
             kiir1 = rs.getString(2);
             kiir2 = rs.getString(3);
                
             }*/
        } catch (SQLException ex) {
        }
    }
    
}
