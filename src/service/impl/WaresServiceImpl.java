package service.impl;

import dao.WaresDao;
import dao.impl.WaresDaoImpl;
import domain.Wares;
import service.WaresService;

import java.util.List;

public class WaresServiceImpl implements WaresService {

    WaresDao waresDao = new WaresDaoImpl();
    @Override
    public List<Wares> queryAll() {
        try {
            return waresDao.selectAll();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Wares> queryByCondition(Wares wares) throws Exception {
        return waresDao.selectByCondition(wares);
    }

    @Override
    public Integer removeById(String waresid) throws Exception {
        return waresDao.deleteByPrimaryKey(waresid);
    }

}
