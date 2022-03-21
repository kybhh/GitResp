package com.msb.service;

import com.msb.dao.AreaDao;
import com.msb.dao.AreaDaoImpl;
import com.msb.pojo.Area;

import java.util.List;

/**
 * @Auther: ms
 * @Date: 2022/3/20 0020 - 03 - 20 - 14:59
 * @Description: com.msb.service
 * @version: 1.0
 */
public class AreaServiceImpl implements AreaService {
    private AreaDao areaDao =new AreaDaoImpl();
    @Override
    public List<Area> findByParentID(Integer parentId) {
        List<Area> areas = areaDao.findByParentId(parentId);
        return areas;
    }
}
