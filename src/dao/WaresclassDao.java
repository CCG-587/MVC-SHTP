package dao;

import domain.Waresclass;

/**
 * 商品分类
 */
public interface WaresclassDao {
    int insert(Waresclass record);

    int insertSelective(Waresclass record);
}