package com.hyq.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by admin on 2017/5/12.
 */
public class DatabaseConnection {
    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://localhost:3306/test";
    private static final String DBUSER = "root";
    private static final String DBPASS = "0408";
    private Connection conn = null;

    public DatabaseConnection(){
        try {
            Class.forName(DBDRIVER);
            this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Connection getConn(){
        return this.conn;
    }
    public void close(){
        try {
            this.conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
