import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Wageeh
 */


public class JavaConnect {
    
    public static Connection connectDb(){
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Wageeh\\Documents\\NetBeansProjects\\Library Managment System\\libraryNew.sqlite");
            return con ;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null ;
        }
    }
}
