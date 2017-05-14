package com.hyq.userdao;

import com.hyq.vo.User;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by admin on 2017/5/12.
 */
public class UserDaoImpl implements UserDao {
    private Connection conn = null;

    public UserDaoImpl(Connection conn){
        this.conn = conn;
    }
    @Override
    public int insertUser(User user) {
        int rs = 0;

        try {
            String sql = "insert into user(username,userpass) value(?,?)";
            PreparedStatement pstmt = this.conn.prepareStatement(sql);
            pstmt.setString(1,user.getUsername());
            pstmt.setString(2,user.getUserpass());
            rs = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int deleteUser(User user) {
        int rs = 0;

        try {
            String sql = "delete from user WHERE userid=?";
            PreparedStatement pstmt = this.conn.prepareStatement(sql);
            pstmt.setString(1,user.getUserid());
            rs = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int updateUser(User user) {
        int rs = 0;
        try {
            String sql = "update user set username=?,userpass=? WHERE userid=?";
            PreparedStatement pstmt = this.conn.prepareStatement(sql);
            pstmt.setString(1,user.getUsername());
            pstmt.setString(2,user.getUserpass());
            pstmt.setString(3,user.getUserid());
            rs = pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public ResultSet selectUser() {
        ResultSet rs = null;

        try {
            String sql = "select * from user";
            PreparedStatement pstmt = this.conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }
    public ResultSet selectUserId(User user){
        ResultSet rs = null;
        try{
            String sql = "select * from user WHERE userid=?";
            PreparedStatement pstmt = this.conn.prepareStatement(sql);
            pstmt.setString(1,user.getUserid());
            rs = pstmt.executeQuery();
        }catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}
