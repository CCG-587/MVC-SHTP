package dao;

import domain.Appraise;

/**
 * 用户评论
 */
public interface AppraiseDao {
    int insert(Appraise record);

    int insertSelective(Appraise record);
}