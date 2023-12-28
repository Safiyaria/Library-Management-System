/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class ConnectionProvider {

    public static Connection getCon() {
        String url = "jdbc:mysql://127.0.0.1/lms";
        String username = "root";
        String pass = "";
        Connection con;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, pass);
            return con;
            

        } 
        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
        
    }

    public static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
