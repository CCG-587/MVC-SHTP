package dao;

import domain.Warespicture;

/**
 * 商品图片
 */
public interface WarespictureDao {
    int deleteByPrimaryKey(String pictureid);

    int insert(Warespicture record);

    int insertSelective(Warespicture record);

    Warespicture selectByPrimaryKey(String pictureid);

    int updateByPrimaryKeySelective(Warespicture record);

    int updateByPrimaryKeyWithBLOBs(Warespicture record);

    int updateByPrimaryKey(Warespicture record);
}