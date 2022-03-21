package com.msb.service;

import com.msb.pojo.Area;

import java.util.List;

/**
 * @Auther: ms
 * @Date: 2022/3/20 0020 - 03 - 20 - 14:58
 * @Description: com.msb.service
 * @version: 1.0
 */
public interface AreaService {
    List<Area> findByParentID(Integer parentId);
}
