package dao;

import domain.Ordermenu;

/**
 * 商品订单
 */
public interface OrdermenuDao {
    int deleteByPrimaryKey(Integer orderid);

    int insert(Ordermenu record);

    int insertSelective(Ordermenu record);

    Ordermenu selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(Ordermenu record);

    int updateByPrimaryKey(Ordermenu record);
}