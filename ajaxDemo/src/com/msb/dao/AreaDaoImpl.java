package com.msb.dao;

import com.msb.pojo.Area;

import java.util.List;

/**
 * @Auther: ms
 * @Date: 2022/3/20 0020 - 03 - 20 - 14:53
 * @Description: com.msb.dao
 * @version: 1.0
 */
public class AreaDaoImpl extends BaseDao implements AreaDao {
    @Override
    public List<Area> findByParentId(int parentID) {
        String sql ="select * from area where parentid =?";
        List list = baseQuery(Area.class, sql, parentID);
        return list;
    }
}
