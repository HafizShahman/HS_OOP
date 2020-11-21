/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.engine;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author stmpc1
 */
public class DBconnection {
     //membuat class connection kepada database
    
    //maklumat database
    String url = "jdbc:mysql://localhost:3306/test";
    String driver = "com.mysql.jdbc.Driver";
    String username = "root";
    String password = "";
    
    public Connection getConnectionDB() throws Exception {
        
        Class.forName(driver);
        
        Connection conn = (Connection) DriverManager.getConnection(url, username, password);
        
        return conn;
        
    }
    
}
