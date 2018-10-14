package lmsfinal;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author SHIBLI
 */
public class DatabaseConnect {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
           //String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=JDBC;user=sa;password=sabbir2420";
            Connection conn = DriverManager.getConnection("jdbc:sqlite:final.sqlite");
            //System.out.println("Connected");
            //JOptionPane.showMessageDialog(null, "Connected to Database!!");
            return conn;
        }
        catch(Exception e){
            //System.out.println("Not connected");
            JOptionPane.showMessageDialog(null, "Not Connected to Database!!");
        }
        return null;
    
    }
}
