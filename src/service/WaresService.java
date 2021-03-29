package service;

import domain.Wares;

import java.util.List;

public interface WaresService {

    /*显示所有商品信息*/
    List<Wares> queryAll();

    /*根据条件查询商品详细*/
    List<Wares> queryByCondition(Wares wares) throws Exception;

    Integer removeById(String waresid) throws Exception;


}
