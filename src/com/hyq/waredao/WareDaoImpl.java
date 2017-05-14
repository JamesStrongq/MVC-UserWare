package com.hyq.waredao;

import com.hyq.vo.Ware;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by admin on 2017/5/13.
 */
public class WareDaoImpl implements WareDao {
    Connection conn = null;

    public  WareDaoImpl(Connection conn){
        this.conn = conn;
    }
    @Override
    public int insertWare(Ware ware) {
        int rs = 0;

        try {
            String sql = "insert into ware(warename,wareprice) value(?,?)";
            PreparedStatement pstmt = this.conn.prepareStatement(sql);
            pstmt.setString(1,ware.getWarename());
            pstmt.setString(2,ware.getWareprice());
            rs = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int deleteWare(Ware ware) {
        int rs = 0;

        try {
            String sql = "delete from ware WHERE wareid=?";
            PreparedStatement pstmt = this.conn.prepareStatement(sql);
            pstmt.setString(1,ware.getWareid());
            rs = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    @Override
    public int updateWare(Ware ware) {
        int rs = 0;
        try{
            String sql = "update ware set warename=?,wareprice=? WHERE wareid=?";
            PreparedStatement pstmt = this.conn.prepareStatement(sql);
            pstmt.setString(1,ware.getWarename());
            pstmt.setString(2,ware.getWareprice());
            pstmt.setString(3,ware.getWareid());
            rs = pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public ResultSet selectWare() {
        ResultSet rs = null;
        try{
            String sql = "select * from ware";
            PreparedStatement pstmt = this.conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public ResultSet selectWareId(Ware ware) {
        ResultSet rs = null;
        try{
            String sql = "select * from ware WHERE wareid=?";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1,ware.getWareid());
            rs = pst.executeQuery();
            if(rs.next()){
                ware.setWarename(rs.getString("warename"));
                ware.setWareprice(rs.getString("wareprice"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}
