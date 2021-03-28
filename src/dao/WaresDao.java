package dao;

import domain.Wares;

import java.util.List;

/**
 * 商品
 */
public interface WaresDao {

    //显示所有商品信息
    List<Wares> selectAll()throws Exception;

    int deleteByPrimaryKey(String waresid)throws Exception;

    int insert(Wares record)throws Exception;

    int insertSelective(Wares record)throws Exception;

    Wares selectByPrimaryKey(String waresid)throws Exception;

    int updateByPrimaryKeySelective(Wares record)throws Exception;

    int updateByPrimaryKey(Wares record)throws Exception;

    //通过条件查询商品信息
    List<Wares> selectByCondition(Wares wares)throws Exception;
}