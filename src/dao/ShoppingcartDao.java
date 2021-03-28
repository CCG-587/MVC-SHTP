package dao;

import domain.Shoppingcart;

/**
 * 购物车
 */
public interface ShoppingcartDao {
    int deleteByPrimaryKey(Integer shoppingid);

    int insert(Shoppingcart record);

    int insertSelective(Shoppingcart record);

    Shoppingcart selectByPrimaryKey(Integer shoppingid);

    int updateByPrimaryKeySelective(Shoppingcart record);

    int updateByPrimaryKey(Shoppingcart record);
}