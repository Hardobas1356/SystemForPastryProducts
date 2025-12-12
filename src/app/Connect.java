
package app;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

public class Connect {
    public Connection conn;
    
    public Connect(){
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:pastriesdb.db");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void close(){
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Throwable ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}