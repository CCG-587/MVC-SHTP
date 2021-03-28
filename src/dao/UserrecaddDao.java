package dao;

import domain.Userrecadd;

/**
 * 用户地址
 */
public interface UserrecaddDao {
    int insert(Userrecadd record);

    int insertSelective(Userrecadd record);
}