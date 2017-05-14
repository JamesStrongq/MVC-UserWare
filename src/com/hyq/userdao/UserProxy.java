package com.hyq.userdao;

import com.hyq.conn.DatabaseConnection;
import com.hyq.vo.User;

import java.sql.ResultSet;

/**
 * Created by admin on 2017/5/12.
 */
public class UserProxy implements UserDao{
    private DatabaseConnection dbc = null;
    private UserDao userDao = null;
    public UserProxy(){
        this.dbc = new DatabaseConnection();
        this.userDao = new UserDaoImpl(this.dbc.getConn());
    }
    @Override
    public int insertUser(User user) {
       int rs = 0;
       rs = this.userDao.insertUser(user);
       return rs ;
    }

    @Override
    public int deleteUser(User user) {
        int rs = 0;
        rs = this.userDao.deleteUser(user);
        return rs;
    }

    @Override
    public int updateUser(User user) {
        int rs = 0;
        rs = this.userDao.updateUser(user);
        return rs;
    }

    @Override
    public ResultSet selectUser() {
        ResultSet rs = null;
        rs = this.userDao.selectUser();
        return rs;
    }

    @Override
    public ResultSet selectUserId(User user) {
        ResultSet rs = null;
        rs = this.userDao.selectUserId(user);
        return rs;
    }
}
