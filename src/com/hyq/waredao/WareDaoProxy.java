package com.hyq.waredao;

import com.hyq.conn.DatabaseConnection;
import com.hyq.vo.Ware;

import java.sql.ResultSet;

/**
 * Created by admin on 2017/5/13.
 */
public class WareDaoProxy implements WareDao{
    DatabaseConnection dbc = null;
    WareDao wareDao = null;

    public WareDaoProxy(){
        this.dbc = new DatabaseConnection();
        this.wareDao = new WareDaoImpl(this.dbc.getConn());
    }
    @Override
    public int insertWare(Ware ware) {
        int rs = 0;
        rs = this.wareDao.insertWare(ware);
        return rs;
    }

    @Override
    public int deleteWare(Ware ware) {
        int rs = 0;
        rs = this.wareDao.deleteWare(ware);
        return rs;
    }

    @Override
    public int updateWare(Ware ware) {
        int rs = 0;
        rs = this.wareDao.updateWare(ware);
        return rs;
    }

    @Override
    public ResultSet selectWare() {
        ResultSet rs = null;
        rs = this.wareDao.selectWare();
        return rs;
    }

    @Override
    public ResultSet selectWareId(Ware ware) {
        ResultSet rs = null;
        rs = this.wareDao.selectWareId(ware);
        return rs;
    }
}
