/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libmgr.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Properties;

/**
 *
 * @author simonbassey
 */
public class DbHelper {
    
    
    
    public static Connection getConnection(String url) throws SQLException{
        return connect(url);
    }
    
    
    public static ResultSet executeQuery(String sql_query) throws SQLException {
        
        try {
            Connection conn  = connect("");
            Statement statement = conn.createStatement();
            
            ResultSet result = statement.executeQuery(sql_query);
            return result;
        } 
        catch (SQLException e) {
            System.out.printf("Error occured executing query %s\n%s", sql_query, e);
         throw e;
        }
    }
    
    public static int executeNonQuery(String sql_query) throws SQLException {
        
        try {
            Connection conn  = connect("");
            Statement statement = conn.createStatement();
            
            var res = statement.executeUpdate(sql_query);
            return res;
        } 
        catch (SQLException e) {
            System.out.printf("Error occured executing query %s\n%s", sql_query, e);
         throw e;
        }
    }
    
    
    private static Connection connect(String db_url) throws SQLException{
        
        try {
            Properties props = new Properties();
            props.put("user", "root");
            props.put("password", "P@ssw0rd");
        
            db_url = !db_url.isBlank() ? db_url : "jdbc:mysql://localhost:3306/lib_mgr_db";
        
            Connection conn = DriverManager.getConnection(db_url, props);
            return conn;
        } 
        catch (SQLException e) {
            System.out.println("Error occured while connecting to the database \n"+e.getMessage());
            throw e; 
        }
    }
    
}
