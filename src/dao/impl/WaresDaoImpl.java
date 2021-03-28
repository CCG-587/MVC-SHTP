package dao.impl;

import dao.WaresDao;
import db.DButil;
import domain.Wares;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WaresDaoImpl implements WaresDao {
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    @Override
    public List<Wares> selectAll() {
        List<Wares> waresList = new ArrayList<>();
        try {
            conn = DButil.getConnction();
            String sql = "select * from wares";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()){
                String waresid = rs.getString(1);
                String userid = rs.getString(2);
                String name = rs.getString(3);
                double originalprice = rs.getDouble(4);
                double currentprice = rs.getDouble(5);
                Integer stock = Integer.valueOf(rs.getString(6));
                String state = rs.getString(7);
                Timestamp date = rs.getTimestamp(8);
                String type = rs.getString(9);
                Wares wares = new Wares(waresid,userid,name,originalprice,currentprice,stock,state,type,date);
                waresList.add(wares);
            }
            return waresList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public int deleteByPrimaryKey(String waresid) {
        return 0;
    }

    @Override
    public int insert(Wares record) {
        return 0;
    }

    @Override
    public int insertSelective(Wares record) {
        return 0;
    }

    @Override
    public Wares selectByPrimaryKey(String waresid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Wares record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Wares record) {
        return 0;
    }

    @Override
    public List<Wares> selectByCondition(Wares wares) {
        return null;
    }
}
