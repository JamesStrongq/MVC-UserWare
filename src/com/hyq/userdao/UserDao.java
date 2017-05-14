package com.hyq.userdao;

import com.hyq.vo.User;

import java.sql.ResultSet;

/**
 * Created by admin on 2017/5/12.
 */
public interface UserDao {
    public int insertUser(User user);
    public int deleteUser(User user);
    public int updateUser(User user);
    public ResultSet selectUser();
    public ResultSet selectUserId(User user);

}
