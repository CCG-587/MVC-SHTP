package dao;

import domain.Friends;

/**
 * 好友
 */
public interface FriendsDao {
    int insert(Friends record);

    int insertSelective(Friends record);
}