package Config;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Koneksi {
public static Connection c;

public static Connection getConnection(){
    if (c==null) {
        try {
            String url ="jdbc:mysql://localhost/MinimarketKita";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            c = (Connection) DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    return c;
}


}