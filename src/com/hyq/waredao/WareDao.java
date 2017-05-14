package com.hyq.waredao;

import com.hyq.vo.Ware;

import java.sql.ResultSet;

/**
 * Created by admin on 2017/5/12.
 */
public interface WareDao {
    public int insertWare(Ware ware);
    public int deleteWare(Ware ware);
    public int updateWare(Ware ware);
    public ResultSet selectWare();
    public ResultSet selectWareId(Ware ware);
}
