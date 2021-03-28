package dao;

import domain.Buywares;

/**
 * 商品求购
 */
public interface BuywaresDao {
    int deleteByPrimaryKey(String buywaresid);

    int insert(Buywares record);

    int insertSelective(Buywares record);

    Buywares selectByPrimaryKey(String buywaresid);

    int updateByPrimaryKeySelective(Buywares record);

    int updateByPrimaryKey(Buywares record);
}