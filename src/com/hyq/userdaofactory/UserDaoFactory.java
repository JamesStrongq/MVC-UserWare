package com.hyq.userdaofactory;

import com.hyq.userdao.UserDao;
import com.hyq.userdao.UserProxy;

/**
 * Created by admin on 2017/5/12.
 */
public class UserDaoFactory {
    public static UserDao getInstanceUser(){
        return new UserProxy();
    }
}
