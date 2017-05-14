package com.hyq.waredaofactory;


import com.hyq.waredao.WareDao;
import com.hyq.waredao.WareDaoProxy;

/**
 * Created by admin on 2017/5/13.
 */
public class WareDaoFactory {
    public static WareDao getInstanceWare(){
        return new WareDaoProxy();
    }
}
