/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiect.bd.pkgfinal;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jamez-Laptop
 */

public class Connection {
    private final String server = "localhost\\DESKTOP-0BL8BK7";
    private final int port = 1433;
    private final String user = "sa";
    private final String password = "asdfg";
    String database = "ScoalaSoferi";
    private java.sql.Connection con;
    private Statement stmt;
    String jdbcUrl = "jdbc:sqlserver://"+server+":"+port+";user="+user+";password="+password+";databaseName="+database+"";
    
    Statement openChannel(){
        try {
            con = DriverManager.getConnection(jdbcUrl);
            System.out.println("# - Connection Obtained");
            
            stmt = con.createStatement();
            System.out.println("# - Statement Created");
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Connection failed");
        }
        return stmt;
    }
    
    ResultSet exQuery(String query) throws SQLException{
            stmt = openChannel();
            ResultSet rs = stmt.executeQuery(query);
            
            return rs;
    }
    void execute(String query) throws SQLException{
            if(stmt == null)
              stmt = openChannel();
            stmt.execute(query); 
    }
    
    void closeChannel(ResultSet rs){
        try {
            rs.close();
            stmt.close();
            con.close();
           // System.out.println("S-au eliberat resursele conexiunii");
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
           // System.out.println("Comunicatia nu s-a incheiat");
        }
    }
}
