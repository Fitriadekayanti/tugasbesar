package Program;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
// import java.beans.Statement; <- ini bukan
/**
 *
 * @author Crack
 */
public class koneksi_database {
    public Statement stat;
    public ResultSet res;
    public Connection con;
    public PreparedStatement pst;
    
    public koneksi_database(){
                
        if (con==null){
            try {
                Class.forName("com.mysql.jdbc.Driver"); // driver yang diimport
                con = DriverManager.getConnection(
                   "jdbc:mysql://localhost/PBO","root","");                
                stat = con.createStatement();
                
            } catch (Exception e) {                
                JOptionPane.showMessageDialog(null, 
                        "Koneksi Gagal : "+e);
            }
        }
    }
}
